package com.javalabs.cliente;

import java.util.List;


import com.javalabs.cliente.entity.Post;
import com.javalabs.config.Configuration;

import feign.Feign;
import feign.Headers;
import feign.Logger;
import feign.RequestLine;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.optionals.OptionalDecoder;
import feign.slf4j.Slf4jLogger;

public class PostRestClientImpl implements PostRestClient {

	private PostRestClient restPostClient;
	
	private String BASE_URL; 
	
	private Configuration config;
	
	
	
	
	public PostRestClientImpl(Configuration configuration) {
		this.config = configuration;
		initBaseUrl();
		
		restPostClient = Feign.builder()
	            .client(new OkHttpClient())
	            .encoder(new GsonEncoder())
	            .decoder(new GsonDecoder())
	            .target(PostRestClient.class, BASE_URL);
	}
	
	
	private void initBaseUrl() {
		BASE_URL = config.getBaseUrl();
		System.out.println("base url : " + BASE_URL);
	}


	public Post createPOST(Post post) {
		return restPostClient.createPOST(post);
	}


	public Post updatePOST(Post post) {
		return restPostClient.updatePOST(post);
	}

	@RequestLine("POST")
    @Headers("Content-Type: application/json")
	public void deletePOST(Long id) {
		restPostClient.deletePOST(id);
		
	}

	@RequestLine("GET")
	@Headers("Content-Type: application/json")
	public List<Post> getAll() {
		return restPostClient.getAll();
	}


	
	
	

}
