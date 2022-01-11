package com.inca.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.InformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface InformationObjectRepository extends BaseRepository<InformationObject, Long> {
	public Page<InformationObject> findAll(Pageable pageable);
	public Page<InformationObject> findAll(Specification<InformationObject> spec, Pageable pageable);
}
