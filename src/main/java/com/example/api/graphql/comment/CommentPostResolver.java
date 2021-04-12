package com.example.api.graphql.comment;

import com.example.api.model.Comment;
import com.example.api.model.Post;
import com.example.api.service.PostService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommentPostResolver implements GraphQLResolver<Comment> {

    private final PostService postService;

    Post post(Comment comment) {
        return postService.getPostById(comment.getPostId());
    }
}
