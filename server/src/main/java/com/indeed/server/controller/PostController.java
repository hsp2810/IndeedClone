package com.indeed.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.indeed.model.PostModel;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.service.PostService;

@RestController
@Slf4j
@CrossOrigin
@RequiredArgsConstructor
public class PostController {
	final PostService postService;
	
	@PostMapping("/post")
	public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
		return this.postService.savePost(postDTORequest);
	}
	
	@GetMapping("/posts")
	public List<PostModel> getAllPosts() {
		return this.postService.fetchAllPosts();
	}
}
