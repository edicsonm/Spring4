package com.edimoto.spring4.mongodb.repository;

import com.edimoto.spring4.mongodb.document.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by edicson on 8/2/17.
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, String>, PersonRepositoryOperations {

}
