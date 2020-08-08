package com.kran.demo.dto;

import lombok.Data;

@Data
public class Greeting {
    private String greeting;

    public Greeting() {
    }

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

}