package com.example.api.service;

import java.util.List;

import com.example.api.model.Post;

public interface PostService {

	public List<Post> getAllPosts();

	public Post getPostById(String id);

	public Long addPost(Post Post);

	public void updatePost(String id, Post Post);

	public void deletePost(String id);
}
