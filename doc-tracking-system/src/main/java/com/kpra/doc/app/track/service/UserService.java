package com.kpra.doc.app.track.service;

import org.springframework.stereotype.Service;

import com.kpra.doc.app.track.model.User;

@Service
public interface UserService {

	public User getAuthentication(String username, String password) throws Exception;
	
	public User saveUser(User user)throws Exception;
	
	public void getUserRole(User user);
}
