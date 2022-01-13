package com.inca.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.LocationInformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface LocationInformationObjectRepository extends BaseRepository<LocationInformationObject, Long> {
	public Page<LocationInformationObject> findAll(Pageable pageable);
	public Page<LocationInformationObject> findAll(Specification<LocationInformationObject> spec, Pageable pageable);
}
