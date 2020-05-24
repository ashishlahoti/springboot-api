package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Post;
import com.example.api.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private PostService postService;

	@GetMapping
	public List<Post> getAllPosts() {
		return postService.getAllPosts();
	}

	@GetMapping("/{id}")
	public Post getPostById(@PathVariable String id) {
		return postService.getPostById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Long addPost(Post post) {
		return postService.addPost(post);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void updatePost(@PathVariable String id, Post post) {
		postService.updatePost(id, post);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deletePost(@PathVariable String id) {
		postService.deletePost(id);
	}
}
