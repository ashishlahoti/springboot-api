package com.example.api.client;

import com.example.api.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "postFeignClient", url = "https://jsonplaceholder.typicode.com/posts")
public interface PostFeignClient {
    @GetMapping
    List<Post> getAllPosts();

    @GetMapping("/{postId}")
    Post getPostById(@PathVariable Long postId);

    @GetMapping
    List<Post> getPostByUserId(@RequestParam Long userId);

    @PostMapping
    Post createPost(Post post);

    @PutMapping
    Post updatePost(Post post);

    @DeleteMapping("/{postId}")
    Post deletePost(@PathVariable Long postId);
}
