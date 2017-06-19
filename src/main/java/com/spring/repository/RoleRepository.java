package com.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.domain.Role;

public interface  RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);

}
