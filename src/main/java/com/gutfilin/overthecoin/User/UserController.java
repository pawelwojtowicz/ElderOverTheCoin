package com.gutfilin.overthecoin.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService service;

    @RequestMapping( method= RequestMethod.POST, value = "/user")
	Boolean addUser( @RequestBody User user) {
		return service.addUser(user);
	}
    
    @RequestMapping( method= RequestMethod.PUT, value = "/user")
    void modifyUserInfo( @RequestBody User user) {
    	service.updateUserInfo(user);
    }
    
    @RequestMapping( method= RequestMethod.GET, value ="/user")
    List<User> getAllUsers() {
    	return service.getAllUsers();
    }
    
    @RequestMapping( method= RequestMethod.GET, value ="/value/{userId}") 
    User getUserByUserId(@PathVariable long userId) {
    	return service.getUserByUserId(userId);
    }
    
    @RequestMapping( method= RequestMethod.DELETE, value = "/user/{userId}")
    void deleteUser(@PathVariable long userId) {
    	service.deleteUser(userId);
    }
    
    
}
