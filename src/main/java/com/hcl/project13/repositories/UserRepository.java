package com.hcl.project13.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.project13.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
    
    
}