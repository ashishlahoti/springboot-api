package com.example.api.graphql.user;

import com.example.api.model.User;
import com.example.api.service.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserQueryResolver implements GraphQLQueryResolver {

    private final UserService userService;

    List<User> users() {
        return userService.getAllUsers();
    }

    User getUserById(Long userId) {
        return userService.getUserById(userId);
    }
}
