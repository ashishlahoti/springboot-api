package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Comment;
import com.example.api.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;

	@GetMapping
	public List<Comment> getAllComments() {
		return commentService.getAllComments();
	}
	
	@GetMapping(params = "postId")
	public List<Comment> getAllCommentsByUserId(@RequestParam Long postId) {
		return commentService.getAllCommentsByPostId(postId);
	}

	@GetMapping("/{id}")
	public Comment getCommentById(@PathVariable Long id) {
		return commentService.getCommentById(id);
	}
	
}
