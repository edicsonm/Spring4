package com.edimoto.spring4.mongodb.repository;

import com.edimoto.spring4.mongodb.document.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by edicson on 8/2/17.
 */
@Repository
public class PersonRepositoryImpl implements PersonRepositoryOperations {

    @Autowired
    private MongoOperations mongo;

    @Override
    public Person findByFirstName(String firstName) {
        Criteria where = Criteria.where("firstName").is(firstName);
        Query query = Query.query(where);
        return mongo.findOne(query, Person.class);
    }

    @Override
    public Person findByName(String name) {
        Criteria where = Criteria.where("name").is(name);
        Query query = Query.query(where);
        return mongo.findOne(query, Person.class);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return null;
    }
}
