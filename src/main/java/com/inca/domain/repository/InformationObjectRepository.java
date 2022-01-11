package com.inca.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.InformationObject;

@Repository
public interface InformationObjectRepository extends CrudRepository<InformationObject, Long> {
	public Page<InformationObject> findAll(Pageable pageable);
	public Page<InformationObject> findAll(Specification<InformationObject> spec, Pageable pageable);
}
