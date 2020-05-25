package com.example.api.service;

import java.util.List;

import com.example.api.model.Comment;

public interface CommentService {

	public List<Comment> getAllComments();

	public Comment getCommentById(Long id);

	public List<Comment> getAllCommentsByPostId(Long postId);

}
