package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.beans.User;
import com.test.service.UserRepository;

@RestController
public class UserController {

	
	@RequestMapping("/")
	public List<User> getUser(){
		List<User> user= new ArrayList<User>();
		User users = new User();
		users.setId(1);
		users.setName("jain");
		user.add(users);
		return user;
	}
	
	

}
