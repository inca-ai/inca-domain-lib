package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.FileInformation;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface FileRepository extends BaseRepository<FileInformation, Long> {
	public Optional<FileInformation> findByMd5(String md5);
	public Page<FileInformation> findAll(Pageable pageable);
	public Page<FileInformation> findAll(Specification<FileInformation> spec, Pageable pageable);
}