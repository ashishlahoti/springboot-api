package com.abc.springbootmicroservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.springbootmicroservice.model.Post;

@Service
public class PostServiceImpl implements PostService {

	private List<Post> posts = new ArrayList<>(Arrays.asList(new Post[] { 
			new Post("spring", "Spring Boot", "All about Spring boot microservice"),
			new Post("java", "Java", "Learn Streams in Java"),
			new Post("javascript", "JavaScript", "Whats new in ES6") 
		}));

	@Override
	public List<Post> getAllPosts() {
		return posts;
	}

	@Override
	public Post getPostById(String id) {
		return posts.stream().filter(post -> id.equals(post.getId())).findFirst().orElse(null);
	}

	@Override
	public void addPost(Post post) {
		posts.add(post);
	}

	@Override
	public void updatePost(String id, Post post) {
		posts.forEach(item -> {
			if (item.getId().equals(id)) {
				item.setTitle(post.getTitle());
				item.setBody(post.getBody());
			}
		});

	}

	@Override
	public void deletePost(String id) {
		posts.removeIf(post -> post.getId().equals(id));

	}

}
