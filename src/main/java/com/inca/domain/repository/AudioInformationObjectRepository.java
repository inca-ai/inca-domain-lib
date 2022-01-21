package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.AudioInformationObject;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface AudioInformationObjectRepository extends BaseRepository<AudioInformationObject, Long> {
	public Page<AudioInformationObject> findAll(Pageable pageable);
	public Page<AudioInformationObject> findAll(Specification<AudioInformationObject> spec, Pageable pageable);
	public Optional<AudioInformationObject> findByFileId(Long fileId);
}
