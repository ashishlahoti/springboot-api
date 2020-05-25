package com.example.api.service;

import java.util.List;

import com.example.api.model.Post;

public interface PostService {

	public List<Post> getAllPosts();

	public Post getPostById(Long id);
	
	public List<Post> getAllPostsByUserId(Long userId);

	public Long addPost(Post Post);

	public void updatePost(Long id, Post Post);

	public void deletePost(Long id);
}
