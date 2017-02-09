package com.edimoto.spring4.controller;

import com.edimoto.spring4.mongodb.document.Person;
import com.edimoto.spring4.mongodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by edicson on 26/1/17.
 */
@Controller
@RequestMapping(value = {"/main"})
public class MainController {

    //    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    PersonRepository personRepository;
//
//    @Autowired
//    MongoOperations mongo;

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
//        System.out.println(String.format("%s", userRepository.findBySSO("edicsonm@gmail.com")));
//        System.out.println(String.format("%s", userRepositoryTest.findAll()));
//        System.out.println(String.format("%s", personRepository.findAll()));
        System.out.println(String.format("%s", personRepository.findByFirstName("Edicson")));
        System.out.println(String.format("%s", personRepository.findByName("tutorials point")));
        return "main";
    }


}
