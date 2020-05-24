package com.abc.springbootmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.springbootmicroservice.model.Post;
import com.abc.springbootmicroservice.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private PostService postService;

	@GetMapping
	public ResponseEntity<List<Post>> getAllPosts() {
		return ResponseEntity.ok(postService.getAllPosts());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable String id) {
		return ResponseEntity.ok(postService.getPostById(id));
	}

	@PostMapping
	public ResponseEntity<Void> addPost(Post post) {
		postService.addPost(post);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> updatePost(@PathVariable String id, Post post) {
		postService.updatePost(id, post);
		return ResponseEntity.ok().build();		
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePost(@PathVariable String id) {
		postService.deletePost(id);
		return ResponseEntity.ok().build();
	}
}
