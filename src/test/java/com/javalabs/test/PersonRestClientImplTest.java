package com.javalabs.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.javalabs.cliente.PersonRestClient;
import com.javalabs.cliente.PersonRestClientImpl;
import com.javalabs.cliente.entity.Person;
import com.javalabs.config.Configuration;
import com.javalabs.config.ConfigurationImpl;

public class PersonRestClientImplTest {
	
	private PersonRestClient restClient;
	private Configuration conf;
	private String base_url = "";

	
	@Before
	public void setup() {
		conf =  new ConfigurationImpl();
		conf.setBaseUrl(base_url);
		
		restClient = new PersonRestClientImpl(null);
	}
	
	@Test
	public void testGetAllPersons() {
		List<Person> persons = restClient.getAll();
		System.out.println(persons);
		assertTrue( persons.size() > 0 );
	}

	@Test
	public void createPerson(){
		Person person = new Person();
		person.setName("Roberto Sousa");
		person.setEmail("roberto@gmail.com");
		person.setEndereco("endereco");
		person.setFone("85555555454");
		
		Person pessoaCriada = restClient.createPerson(person);
		assertTrue(pessoaCriada.getIdPerson()!= null );
	}
	
}
