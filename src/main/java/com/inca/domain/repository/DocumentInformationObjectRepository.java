package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.DocumentInformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface DocumentInformationObjectRepository extends BaseRepository<DocumentInformationObject, Long> {
	public Page<DocumentInformationObject> findAll(Pageable pageable);
	public Page<DocumentInformationObject> findAll(Specification<DocumentInformationObject> spec, Pageable pageable);
	public Optional<DocumentInformationObject> findByFileId(Long fileId);
}
