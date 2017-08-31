package com.itq.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
public class GreetingServiceEnglish implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
