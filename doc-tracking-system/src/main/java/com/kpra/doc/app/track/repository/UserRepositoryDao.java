package com.kpra.doc.app.track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kpra.doc.app.track.model.User;

@Component
@Repository
public interface UserRepositoryDao extends JpaRepository<User,Long>{

	public User findByEmailAndPassword(String email,String password);
	
	public User save(User user);
	
}
