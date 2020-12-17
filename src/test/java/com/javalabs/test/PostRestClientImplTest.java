package com.javalabs.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import com.javalabs.cliente.PostRestClient;
import com.javalabs.cliente.PostRestClientImpl;
import com.javalabs.cliente.entity.Post;
import com.javalabs.config.Configuration;
import com.javalabs.config.ConfigurationImpl;

public class PostRestClientImplTest {
	
	private PostRestClient postRestClient;
	private Configuration conf;
	private String base_url = "https://jsonplaceholder.typicode.com";

	
	@Before
	public void setup() {
		conf =  new ConfigurationImpl();
		conf.setBaseUrl(base_url);
		//conf.setComplementUrl("/posts");
		
		postRestClient = new PostRestClientImpl(conf);
	}
	
	@Test
	public void testGetAllPosts() {
		List<Post> posts = postRestClient.getAll();
		System.out.println(posts);
		assertTrue( posts.size() > 0 );
	}

	@Test
	@Ignore
	public void createPost(){
		Post post = new Post();
		post.setTitle("title roberto sousa");
		post.setBody("body roberto sousa");
		post.setUserId("8334");
		
		
		Post postCriado = postRestClient.createPOST(post);
		assertTrue( postCriado.getId() != null );
	}
	
}
