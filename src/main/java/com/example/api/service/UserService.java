package com.example.api.service;

import com.example.api.model.User;
import com.example.api.model.Users;

public interface UserService {

	public Users getAllUsers();

	public User getUserById(Long id);

	public Long createUser(User user);

	public void updateUser(Long id, User user);

	public void deleteUserById(Long id);
}
