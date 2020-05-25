package com.example.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.api.model.Comment;

@FeignClient(value = "commentFeignClient", url = "https://jsonplaceholder.typicode.com/")
public interface CommentFeignClient {

	@GetMapping("/comments")
    List<Comment> getAllComments();
 
    @GetMapping("/comments/{commentId}")
    Comment getCommentById(@PathVariable Long commentId);
    
    @GetMapping("/comments")
    List<Comment> getCommentsByPostId(@RequestParam Long postId);
}
