package com.edimoto.spring4.mongodb.repository;

import com.edimoto.spring4.mongodb.document.Person;

import java.util.List;

/**
 * Created by edicson on 9/2/17.
 */
public interface PersonRepositoryOperations {
    Person findByFirstName(String firstName);
    Person findByName(String name);
    List<Person> findByLastName(String lastName);
}
