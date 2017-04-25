package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Person;
import com.example.repository.PersonRespository;

@Service
public class PersonService {

	@Autowired
	PersonRespository personRespository;

	public Person getPersonByLastName(String lastName) {
		return personRespository.findByLastName(lastName);
	}

	public Person getPersonByFirstName(String lastName) {
		return personRespository.findByLastName(lastName);
	}

	public List<Person> getPersonsByAgeGreaterThan(int age) {
		return personRespository.findByAgeGreaterThan(age);
	}

	public Person register(Person person) {
		return personRespository.save(person);
	}
}
