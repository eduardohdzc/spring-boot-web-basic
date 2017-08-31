package com.itq.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
public class GreetingServiceEnglish implements GreetingService {

    @Value("${greeting}")
    private String greeting;

    @Override
    public String sayHello() {
        return greeting;
    }

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
