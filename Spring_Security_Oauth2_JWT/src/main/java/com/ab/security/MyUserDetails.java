package com.ab.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ab.models.AuthenticationRequest;

public class MyUserDetails implements UserDetails {
	
	private static final long serialVersionUID=1L;
	
	@Autowired
	private AuthenticationRequest req;
	
	public MyUserDetails(AuthenticationRequest authReq) {
		super();
		req=authReq;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> ga=new ArrayList<GrantedAuthority>();
		return ga;
	}

	@Override
	public String getPassword() {
		return req.getPassword();
	}

	@Override
	public String getUsername() {
		return req.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public AuthenticationRequest getUserDetails() {
		return req;
	}

}
