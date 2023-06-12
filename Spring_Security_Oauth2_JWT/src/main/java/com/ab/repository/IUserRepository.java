package com.ab.repository;

import org.springframework.data.repository.CrudRepository;

import com.ab.models.AuthenticationRequest;

public interface IUserRepository extends CrudRepository<AuthenticationRequest, Integer> {

	public AuthenticationRequest findByEmail(String email);
}
