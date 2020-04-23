package com.abc.springbootmicroservice.service;

import java.util.List;

import com.abc.springbootmicroservice.model.Post;

public interface PostService {

	public List<Post> getAllPosts();

	public Post getPostById(String id);

	public void addPost(Post Post);

	public void updatePost(String id, Post Post);

	public void deletePost(String id);
}
