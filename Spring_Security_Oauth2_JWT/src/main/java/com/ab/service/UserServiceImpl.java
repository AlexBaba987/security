package com.ab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.models.AuthenticationRequest;
import com.ab.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserRepository userRepo;

	@Override
	public String saveUserDetails(AuthenticationRequest req) {
		return "User Details are save whose userId is :: "+userRepo.save(req).getUserId();
	}

}
