package com.example.api.model;

import lombok.Value;

@Value
public class Comment {

	Long postId;
	Long id;
	String name;
	String email;
	String body;
}
