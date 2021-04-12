package com.example.api.graphql.post;

import com.example.api.model.Comment;
import com.example.api.model.Post;
import com.example.api.service.CommentService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PostCommentResolver implements GraphQLResolver<Post> {

    private final CommentService commentService;

    List<Comment> comments(Post post) {
        return commentService.getAllCommentsByPostId(post.getId());
    }
}
