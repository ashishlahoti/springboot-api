package com.example.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.api.model.Post;

@Service
public class PostServiceImpl implements PostService {

	private List<Post> postList = new ArrayList<>(
			Arrays.asList(new Post[] { new Post(1l, 1l, "Spring Boot", "All about Spring boot microservice"),
					new Post(1l, 2l, "Java", "Learn Streams in Java"),
					new Post(1l, 3l, "JavaScript", "Whats new in ES6") }));
	
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Post> getAllPosts() {
		return postList;
	}

	@Override
	public Post getPostById(Long id) {
		return postList.stream().filter(post -> id == post.getId()).findFirst().orElse(null);
	}
	
	@Override
	public List<Post> getAllPostsByUserId(Long userId) {
		Post[] posts = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts?userId=" + userId, Post[].class);
		return Arrays.asList(posts);
	}

	@Override
	public Long addPost(Post post) {
		Long id = Long.valueOf(this.postList.size() + 1);
		postList.add(post);
		return id;
	}

	@Override
	public void updatePost(Long id, Post post) {
		postList.forEach(item -> {
			if (item.getId().equals(id)) {
				item.setTitle(post.getTitle());
				item.setBody(post.getBody());
			}
		});

	}

	@Override
	public void deletePost(Long id) {
		postList.removeIf(post -> post.getId() == id);

	}

}
