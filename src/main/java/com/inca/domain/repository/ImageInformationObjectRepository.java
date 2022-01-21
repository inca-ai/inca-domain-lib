package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.ImageInformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface ImageInformationObjectRepository extends BaseRepository<ImageInformationObject, Long> {
	public Page<ImageInformationObject> findAll(Pageable pageable);
	public Page<ImageInformationObject> findAll(Specification<ImageInformationObject> spec, Pageable pageable);
	public Optional<ImageInformationObject> findByFileId(Long fileId);
}
