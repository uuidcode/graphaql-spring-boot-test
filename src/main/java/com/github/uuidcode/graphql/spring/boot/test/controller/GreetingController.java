package com.github.uuidcode.graphql.spring.boot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.uuidcode.graphql.spring.boot.test.model.Greeting;
import com.github.uuidcode.graphql.spring.boot.test.repository.GreetingRepository;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @Autowired
    private GreetingRepository greetingRepository;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Object view(Long id) {
        return this.greetingRepository.find(id);
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public Object save(String message) {
        Greeting greeting = Greeting.of().setId(System.currentTimeMillis()).setMessage(message);
        return this.greetingRepository.save(greeting);
    }
}
