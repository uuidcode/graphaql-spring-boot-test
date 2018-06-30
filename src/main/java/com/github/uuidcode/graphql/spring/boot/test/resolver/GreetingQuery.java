package com.github.uuidcode.graphql.spring.boot.test.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.uuidcode.graphql.spring.boot.test.model.Greeting;
import com.github.uuidcode.graphql.spring.boot.test.repository.GreetingRepository;

@Component
public class GreetingQuery implements GraphQLQueryResolver {
    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting getGreeting(Long id) {
        return greetingRepository.find(id);
    }
}