package com.example.api.graphql.user;

import com.example.api.model.Post;
import com.example.api.model.User;
import com.example.api.service.PostService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPostResolver implements GraphQLResolver<User> {

    private final PostService postService;

    List<Post> posts(User user) {
        return postService.getAllPostsByUserId(user.getId());
    }
}
