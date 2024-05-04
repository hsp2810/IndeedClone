package com.indeed.server.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indeed.model.PostModel;

public interface PostDao extends MongoRepository<PostModel, String>{
	
}
