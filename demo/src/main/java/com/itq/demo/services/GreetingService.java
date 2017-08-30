package com.itq.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello() {
        return "Hello World from Greeting Controller!";
    }
}
