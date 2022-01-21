package com.inca.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import com.inca.domain.model.User;
import com.nooul.apihelpers.springbootrest.repositories.BaseRepository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
	public Page<User> findAll(Pageable pageable);
	public Page<User> findAll(Specification<User> spec, Pageable pageable);
}
