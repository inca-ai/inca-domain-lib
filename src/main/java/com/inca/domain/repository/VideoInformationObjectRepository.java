package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.VideoInformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface VideoInformationObjectRepository extends BaseRepository<VideoInformationObject, Long> {
	public Page<VideoInformationObject> findAll(Pageable pageable);
	public Page<VideoInformationObject> findAll(Specification<VideoInformationObject> spec, Pageable pageable);
	public Optional<VideoInformationObject> findByFileId(Long fileId);
}
