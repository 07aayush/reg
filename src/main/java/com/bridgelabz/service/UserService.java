package com.bridgelabz.service;

import com.bridgelabz.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	public void saveUser(User user);
	
}
