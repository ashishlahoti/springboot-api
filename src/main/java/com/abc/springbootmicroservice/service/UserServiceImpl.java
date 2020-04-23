package com.abc.springbootmicroservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.springbootmicroservice.model.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> users = Arrays.asList(new User[] { new User(1, "Leanne Graham", 22), new User(2, "Ervin Howell", 28),
			new User(3, "Clementine Bauch", 32) });

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public User getUserById(Long id) {
		return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
	}

	@Override
	public User createUser(User user) {
		users.add(user);
		return user;
	}

	@Override
	public User updateUser(Long id, User user) {
		users.forEach(item -> {
			if (item.getId() == id) {
				item.setName(user.getName());
				item.setAge(user.getAge());
			}
		});
		return user;
	}

	@Override
	public void deleteUserById(Long id) {
		users.removeIf(user -> user.getId() == id);
	}

}
