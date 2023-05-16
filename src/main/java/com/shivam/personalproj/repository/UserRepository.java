package com.shivam.personalproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.personalproj.entity.User;

@Repository
public interface  UserRepository extends JpaRepository<User, Integer>{

	/*
	 * @Query(select * from User where id=1) List<User> getUserbyId(int id);
	 */
}
