package com.github.uuidcode.graphql.spring.boot.test.model;

public class Greeting {
    private Long id;
    private String message;

    public static Greeting of() {
        return new Greeting();
    }

    public String getMessage() {
        return this.message;
    }

    public Greeting setMessage(String message) {
        this.message = message;
        return this;
    }

    public Long getId() {
        return this.id;
    }

    public Greeting setId(Long id) {
        this.id = id;
        return this;
    }
}
