package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.client.CommentFeignClient;
import com.example.api.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentFeignClient commentFeignClient;

	@Override
	public List<Comment> getAllComments() {
		return commentFeignClient.getAllComments();
	}

	@Override
	public Comment getCommentById(Long id) {
		return commentFeignClient.getCommentById(id);
	}

	@Override
	public List<Comment> getAllCommentsByPostId(Long postId) {
		return commentFeignClient.getCommentsByPostId(postId);
	}

}
