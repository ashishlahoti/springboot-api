package com.example.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api.model.Post;

@Service
public class PostServiceImpl implements PostService {

	private List<Post> postList = new ArrayList<>(
			Arrays.asList(new Post[] { new Post("spring", "Spring Boot", "All about Spring boot microservice"),
					new Post("java", "Java", "Learn Streams in Java"),
					new Post("javascript", "JavaScript", "Whats new in ES6") }));

	@Override
	public List<Post> getAllPosts() {
		return postList;
	}

	@Override
	public Post getPostById(String id) {
		return postList.stream().filter(post -> id.equals(post.getId())).findFirst().orElse(null);
	}

	@Override
	public Long addPost(Post post) {
		Long id = Long.valueOf(this.postList.size() + 1);
		postList.add(post);
		return id;
	}

	@Override
	public void updatePost(String id, Post post) {
		postList.forEach(item -> {
			if (item.getId().equals(id)) {
				item.setTitle(post.getTitle());
				item.setBody(post.getBody());
			}
		});

	}

	@Override
	public void deletePost(String id) {
		postList.removeIf(post -> post.getId().equals(id));

	}

}
