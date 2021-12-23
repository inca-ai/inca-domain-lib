package com.inca.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.inca.domain.model.InformationObject;

@Transactional
public interface InformationObjectRepository extends CrudRepository<InformationObject, Long> {
	
}
