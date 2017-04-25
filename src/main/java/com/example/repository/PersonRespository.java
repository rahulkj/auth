package com.example.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Person;

@Repository
public interface PersonRespository extends PagingAndSortingRepository<Person, Long> {

	Person findByLastName(String lastName);

	Person findByFirstName(String firstName);

	List<Person> findByAgeGreaterThan(Integer age);

}
