package com.example.api.model;

import lombok.Value;

@Value
public class Post extends CreatePostInput {

    Post(Long id, Long userId, String title, String body) {
        super(userId, title, body);
        this.id = id;
    }

    Long id;
}
