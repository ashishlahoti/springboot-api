package com.example.api.graphql.post;

import com.example.api.model.Post;
import com.example.api.service.PostService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PostResolver implements GraphQLQueryResolver {

    private final PostService postService;

    List<Post> posts(){
        return postService.getAllPosts();
    }

    Post postById(Long postId){
        return postService.getPostById(postId);
    }

    List<Post> postByUserId(Long userId){
        return postService.getAllPostsByUserId(userId);
    }
}
