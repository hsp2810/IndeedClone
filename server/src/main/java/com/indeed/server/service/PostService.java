package com.indeed.server.service;

import java.util.List;

import com.indeed.model.PostModel;
import com.indeed.server.dto.PostDTO;

public interface PostService {
	public PostModel savePost(PostDTO postDTO);
	public List<PostModel> fetchAllPosts();
}
