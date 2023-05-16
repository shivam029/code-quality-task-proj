package com.shivam.personalproj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.personalproj.entity.User;
import com.shivam.personalproj.model.UserResponseModel;
import com.shivam.personalproj.service.ProjService;

@RestController
public class Controller {
	
	@Autowired
	ProjService projService;
	
	@GetMapping("/hello")
	public List<User> Hello() {
		
		List<User> res = projService.Hello();
		
		return res;
	}

	@RequestMapping(method = RequestMethod.GET, value= "/user/{id}")
	//@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") int id ) {
		
		Optional<User> res = projService.getUserbyId(id);
		
		return res;
	}
	
	@PostMapping("/adduser")
	public UserResponseModel addUser(@RequestBody User user) {
		
		UserResponseModel usr = new UserResponseModel();
		
		User user_res = projService.addUser(user);
		
		usr.setUser(user_res);
		usr.setStatus("Success");
		
		return usr;
	}
}
