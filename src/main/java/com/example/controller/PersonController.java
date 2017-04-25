package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;
import com.example.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public Person createUser(@RequestBody Person person) {
		return personService.register(person);
	}

	@RequestMapping(value = "/person/lastName", method = RequestMethod.GET)
	public Person findUserByLastName(@RequestParam String lastName) {
		return personService.getPersonByLastName(lastName);
	}

	@RequestMapping(value = "/person/firstName", method = RequestMethod.GET)
	public Person findByFirstName(@RequestParam String firstName) {
		return personService.getPersonByFirstName(firstName);
	}

	@RequestMapping(value = "/person/age", method = RequestMethod.GET)
	public List<Person> createUser(@RequestParam int age) {
		return personService.getPersonsByAgeGreaterThan(age);
	}
}
