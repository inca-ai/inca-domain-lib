package com.inca.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.ImageInformationObject;

@Repository
public interface ImageInformationObjectRepository extends CrudRepository<ImageInformationObject, Long> {
	public Page<ImageInformationObject> findAll(Pageable pageable);
	public Page<ImageInformationObject> findAll(Specification<ImageInformationObject> spec, Pageable pageable);
}
