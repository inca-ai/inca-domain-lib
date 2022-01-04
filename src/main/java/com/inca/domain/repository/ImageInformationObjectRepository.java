package com.inca.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.ImageInformationObject;

@Repository
public interface ImageInformationObjectRepository extends CrudRepository<ImageInformationObject, Long> {

}
