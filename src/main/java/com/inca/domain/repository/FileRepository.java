package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.inca.domain.model.FileInformation;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface FileRepository extends BaseRepository<FileInformation, Long> {
	public Optional<FileInformation> findByMd5(String md5);
}