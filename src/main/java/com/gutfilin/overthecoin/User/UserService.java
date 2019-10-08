package com.gutfilin.overthecoin.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	public Boolean addUser( User user) {
		if ( null == repository.findUserByEmail(user.email) ) {
			repository.save(user);
			return true;
		}
		return false;
	}
	
	public User getUserByEmail(String email) {
		return repository.findUserByEmail(email);
	}
	
	public void removeUser( String email) {
		repository.deleteByEmail(email);
	}
	
	public List<User> getAllUsers() {
		return repository.findAll();
	}
}
