package com.inca.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.InformationObject;

@Repository
public interface InformationObjectRepository extends CrudRepository<InformationObject, Long> {
	
}
