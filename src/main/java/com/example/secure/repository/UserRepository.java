package com.example.secure.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.secure.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

}
