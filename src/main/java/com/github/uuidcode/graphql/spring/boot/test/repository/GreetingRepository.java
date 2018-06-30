package com.github.uuidcode.graphql.spring.boot.test.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.github.uuidcode.graphql.spring.boot.test.model.Greeting;

@Component
public class GreetingRepository {
    private Map<Long, Greeting> greetings;

    public GreetingRepository() {
        greetings = new HashMap<>();
    }

    public Greeting save(Greeting greeting) {
        greetings.put(greeting.getId(), greeting);
        return greeting;
    }

    public Greeting find(Long id) {
        return greetings.get(id);
    }
}