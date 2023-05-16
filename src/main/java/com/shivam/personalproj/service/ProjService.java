package com.shivam.personalproj.service;

import java.util.List;
import java.util.Optional;

import com.shivam.personalproj.entity.User;

public interface ProjService {
	
	public List<User> Hello();

	public Optional<User> getUserbyId(int id);

	public User addUser(User user);

}
