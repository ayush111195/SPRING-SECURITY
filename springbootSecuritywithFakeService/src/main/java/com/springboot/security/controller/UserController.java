package com.springboot.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.entities.User;
import com.springboot.security.services.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	
	private UserService userService;
	
	
@GetMapping("/users")

//All Users---->>>.
public List<User>getAlluser()
{
	List<User> allUser = this.userService.getAllUser();

	System.out.println(allUser);
	
	return allUser;
}

//Return Single User--->>>.

@GetMapping("/{username}")
public User getUser( @PathVariable("username") String username) 
{
	return this.userService.getUser(username);
}

//Add the user --->>>

@PostMapping("/")
public User  add(User user) {
	return this.userService.addUser(user);
}
}
