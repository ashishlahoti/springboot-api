package com.abc.springbootmicroservice.service;

import java.util.List;

import com.abc.springbootmicroservice.model.User;

public interface UserService {

	public List<User> getAllUsers();

	public User getUserById(Long id);

	public User createUser(User user);

	public User updateUser(Long id, User user);

	public void deleteUserById(Long id);
}
