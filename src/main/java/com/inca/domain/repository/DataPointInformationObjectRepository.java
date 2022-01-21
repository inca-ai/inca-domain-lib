package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.DataPointInformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface DataPointInformationObjectRepository extends BaseRepository<DataPointInformationObject, Long> {
	public Page<DataPointInformationObject> findAll(Pageable pageable);
	public Page<DataPointInformationObject> findAll(Specification<DataPointInformationObject> spec, Pageable pageable);
	public Optional<DataPointInformationObject> findByFileId(Long fileId);
}
