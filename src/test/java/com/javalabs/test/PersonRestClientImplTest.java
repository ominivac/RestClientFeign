package com.javalabs.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.javalabs.cliente.PersonRestClient;
import com.javalabs.cliente.PersonRestClientImpl;
import com.javalabs.cliente.entity.Person;

public class PersonRestClientImplTest {
	
	private PersonRestClient restClient;
	

	@Before
	public void setup() {
		restClient = new PersonRestClientImpl();
	}
	
	@Test
	public void testGetAllPersons() {
		List<Person> persons = restClient.getAll();
		assertTrue( persons.size() > 0 );
	}

}
