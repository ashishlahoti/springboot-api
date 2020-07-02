package com.example.api.service;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.api.model.User;
import com.example.api.model.Users;

@Service
public class UserServiceImpl implements UserService {

	private Random random = new Random();
	private List<User> userList = new ArrayList<>(
			Arrays.asList(new User[] { new User(1, "Adam", "1950-01-01"), 
					new User(2, "Bob", "1990-10-30"),
					new User(3, "Charlie", "1979-07-26") }));

	@Override
	public Users getAllUsers() {
		Users users = new Users();
		userList.forEach(user -> user.setLastLogin(LocalDateTime.now().minusDays(random.nextInt(10))));
		users.setUsers(userList);
		return users;
	}

	@Override
	public User getUserById(Long id) {
		return userList.stream().filter(user -> user.getId() == id).map(user -> {
			user.setLastLogin(LocalDateTime.now());
			user.setZonedDateTime(ZonedDateTime.now());
			return user;
		}).findAny().orElse(null);
	}

	@Override
	public Long createUser(User user) {
		Long id = Long.valueOf(this.userList.size() + 1);
		user.setId(id);
		userList.add(user);
		return id;
	}

	@Override
	public void updateUser(Long id, User user) {
		userList.forEach(item -> {
			if (item.getId() == id) {
				item.setName(user.getName());
				item.setDateOfBirth(user.getDateOfBirth());
			}
		});
	}

	@Override
	public void deleteUserById(Long id) {
		userList.removeIf(user -> user.getId() == id);
	}

}
