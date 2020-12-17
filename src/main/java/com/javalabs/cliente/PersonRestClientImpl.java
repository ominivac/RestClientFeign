package com.javalabs.cliente;

import java.util.List;

import com.javalabs.cliente.entity.Person;
import com.javalabs.config.Configuration;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.optionals.OptionalDecoder;
import feign.slf4j.Slf4jLogger;

public class PersonRestClientImpl implements PersonRestClient {

	private PersonRestClient restClient;
	
	private String BASE_URL; 
	
	private Configuration config;
	
	
	
	
	public PersonRestClientImpl(Configuration configuration) {
		this.config = configuration;
		initBaseUrl();
		
		restClient = Feign.builder()
	            .client(new OkHttpClient())
	            .encoder(new GsonEncoder())
	            .decoder(new GsonDecoder())
	            .target(PersonRestClient.class, BASE_URL);
	}
	
	
	private void initBaseUrl() {
		BASE_URL = config.getBaseUrl();
	}
	
	public Person createPerson(Person person) {
		return restClient.createPerson(person);
	}

	public Person updatePerson(Person person) {
		return restClient.updatePerson(person);
	}

	public void deletePerson(Long id) {
		restClient.deletePerson(id);
	}

	public List<Person> getAll() {
		return restClient.getAll();
	}

	public List<Person> getByName(String name) {
		return restClient.getByName(name);
	}

}
