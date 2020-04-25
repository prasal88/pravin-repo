package com.kpra.doc.app.track.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kpra.doc.app.track.model.User;
import com.kpra.doc.app.track.service.UserService;

@Component
public class UserRepositoryImpl implements UserService{

	@Autowired
	private UserRepositoryDao userRepository;
	
	@Override
	public User getAuthentication(String email, String password) throws Exception {
		return userRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public User saveUser(User user) throws Exception {
		return userRepository.save(user);
	}

	@Override
	public void getUserRole(User user) {
		
	}

	
}
