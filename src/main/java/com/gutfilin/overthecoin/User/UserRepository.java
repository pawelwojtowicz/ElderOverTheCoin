package com.gutfilin.overthecoin.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
	User findUserByEmail( String email);
	
	void deleteByEmail( String email );
}
