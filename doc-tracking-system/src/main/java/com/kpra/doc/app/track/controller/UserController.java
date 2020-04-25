package com.kpra.doc.app.track.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kpra.doc.app.track.model.User;
import com.kpra.doc.app.track.service.UserService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user/{email}/{password}")
	public User getAuthenticate(@PathVariable("email") String email,
								  @PathVariable("password") String password) {
		User user=null;
		try {
			user= userService.getAuthentication(email, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@PostMapping("/createuser")
	public User display(@RequestBody User user) {
		System.out.println("username: "+user.getFname());
		try {
			user= userService.saveUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
