package com.javalabs.cliente;

import java.util.List;


import com.javalabs.cliente.entity.Post;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface PostRestClient {
	
	static final String POST = "/POST";
	static final String GET = "/GET";
	static final String PUT = "/PUT";
	static final String DELETE = "/DELETE";
	
	
	static final String CREATE_POST = "/post";
	static final String UPDATE_POST = "/post{id}";
	static final String DELETE_POST = DELETE + "/post{id}";
	static final String GET_ALL_POSTS = GET+ "/posts";
	
	
	
	@Headers("Content-Type: application/json")
	@RequestLine(CREATE_POST)
	Post createPOST(Post post);
	
	
	@Headers("Content-Type: application/json")
	@RequestLine(UPDATE_POST)
	Post updatePOST(Post post);
	
	
	@RequestLine(DELETE_POST)
	void deletePOST(@Param(value ="id") Long id);
	
	@RequestLine(GET_ALL_POSTS)
	List<Post> getAll();
	
	
	

}
