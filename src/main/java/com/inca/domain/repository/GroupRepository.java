package com.inca.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.Group;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface GroupRepository extends BaseRepository<Group, Long> {
	public Page<Group> findAll(Pageable pageable);
	public Page<Group> findAll(Specification<Group> spec, Pageable pageable);
}
