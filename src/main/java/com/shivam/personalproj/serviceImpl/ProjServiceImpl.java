package com.shivam.personalproj.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.personalproj.entity.User;
import com.shivam.personalproj.model.UserResponseModel;
import com.shivam.personalproj.repository.UserRepository;
import com.shivam.personalproj.service.ProjService;

@Service
public class ProjServiceImpl implements ProjService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> Hello() {
		// TODO Auto-generated method stub
		
		List<User> res = userRepository.findAll();
		
		return res;
	}

	@Override
	public Optional<User> getUserbyId(int id) {
		// TODO Auto-generated method stub
		
		UserResponseModel urm = new UserResponseModel();
		Optional<User> res = userRepository.findById(id);
		
		
		return res;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method
		
		User user_res = userRepository.save(user);
		
		return user_res;
	}

}
