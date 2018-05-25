package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by geoda on 2018-05-26.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonRepository repository;

    @RequestMapping("/")
    public String home() {
        Person p = this.repository.findAll().iterator().next();
        return "Hello " + p.getName() + "!";
    }
}
