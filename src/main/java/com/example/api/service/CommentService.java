package com.example.api.service;

import java.util.List;

import com.example.api.model.Comment;
import com.example.api.model.Post;

public interface CommentService {

    List<Comment> getAllComments();

    Comment getCommentById(Long id);

    List<Comment> getAllCommentsByPostId(Long commentId);

    Comment createComment(Comment comment);

    void updateComment(Long commentId, Comment comment);

    void deleteComment(Long commentId);

}
