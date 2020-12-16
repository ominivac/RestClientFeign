package com.javalabs.cliente;

import java.util.List;

import com.javalabs.cliente.entity.Person;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.optionals.OptionalDecoder;
import feign.slf4j.Slf4jLogger;

public class PersonRestClientImpl implements PersonRestClient {

	private PersonRestClient restClient;
	private final String BASE_URL_1 = "https://jsonplaceholder.typicode.com/posts";
	
	public PersonRestClientImpl() {
		restClient = Feign.builder()
	            .client(new OkHttpClient())
	            .encoder(new GsonEncoder())
	            .decoder(new GsonDecoder())
	            .target(PersonRestClient.class, BASE_URL_1);
	}
	
	
	public Person createPerson(Person person) {
	
		return null;
	}

	public Person updatePerson(Person person) {
		
		return null;
	}

	public void deletePerson(Long id) {
		
		
	}

	public List<Person> getAll() {
		
		return null;
	}

	public List<Person> getByName(String name) {
		
		return null;
	}

}
