package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.inca.domain.model.InformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

// This is depreacted and shouldnt be used longer
//@Repository
public interface InformationObjectRepository extends BaseRepository<InformationObject, Long> {
	public Page<InformationObject> findAll(Pageable pageable);
	public Page<InformationObject> findAll(Specification<InformationObject> spec, Pageable pageable);
	public Optional<InformationObject> findByFileId(Long fileId);
}
