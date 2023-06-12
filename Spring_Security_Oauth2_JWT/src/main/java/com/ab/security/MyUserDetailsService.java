package com.ab.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ab.models.AuthenticationRequest;
import com.ab.repository.IUserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IUserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AuthenticationRequest user=userRepo.findByEmail(email);
		
		return new MyUserDetails(user);
	}
}