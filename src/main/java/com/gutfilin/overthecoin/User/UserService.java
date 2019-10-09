package com.gutfilin.overthecoin.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	public Boolean addUser( User user) {
		User userWithEmail = repository.findUserByEmail(user.email);
		if ( null ==  userWithEmail ) {
			repository.save(user);
			return true;
		}
		return false;
	}
	
	public void updateUserInfo( User user) {
		repository.save(user);
	}
	
	public User getUserByUserId(long userId) {
		return repository.findUserByUserId(userId);
	}
	
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public void deleteUser(long userId) {
		repository.deleteByUserId(userId);
	}
}
