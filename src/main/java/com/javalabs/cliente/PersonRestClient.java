package com.javalabs.cliente;

import java.util.List;

import com.javalabs.cliente.entity.Person;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface PersonRestClient {
	
	static final String POST = "/POST";
	static final String GET = "/GET";
	static final String PUT = "/PUT";
	static final String DELETE = "/DELETE";
	
	
	static final String CREATE_PERSON = "/create";
	static final String UPDATE_PERSON = "/update{id}";
	static final String DELETE_PERSON = DELETE + "/delete{id}";
	static final String GET_ALL_PERSONS = GET+ "/all";
	static final String GET_ALL_PERSONS_BY_NAME = GET+ "/all/by/name{name}";
	
	
	@Headers("Content-Type: application/json")
	@RequestLine(CREATE_PERSON)
	Person createPerson(Person person);
	
	
	@Headers("Content-Type: application/json")
	@RequestLine(UPDATE_PERSON)
	Person updatePerson(Person person);
	
	
	@RequestLine(DELETE_PERSON)
	void deletePerson(@Param(value ="id") Long id);
	
	@RequestLine(GET_ALL_PERSONS)
	List<Person> getAll();
	
	List<Person> getByName(String name);
	
	

}
