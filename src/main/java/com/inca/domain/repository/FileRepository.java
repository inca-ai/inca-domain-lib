package com.inca.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.FileInformation;

@Repository
public interface FileRepository extends CrudRepository<FileInformation, Long> {
	public Optional<FileInformation> findByMd5(String md5);
}