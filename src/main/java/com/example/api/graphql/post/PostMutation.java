package com.example.api.graphql.post;

import com.example.api.model.CreatePostInput;
import com.example.api.model.Post;
import com.example.api.service.PostService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostMutation implements GraphQLMutationResolver {

    private final PostService postService;

    Post createPost(CreatePostInput input) {
        return postService.createPost(input);
    }

}
