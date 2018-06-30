package com.github.uuidcode.graphql.spring.boot.test.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.uuidcode.graphql.spring.boot.test.model.Greeting;
import com.github.uuidcode.graphql.spring.boot.test.repository.GreetingRepository;

@Component
public class GreetingMutation implements GraphQLMutationResolver {
    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting newGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);
        greeting.setId(System.currentTimeMillis());
        return greetingRepository.save(greeting);
    }
}
