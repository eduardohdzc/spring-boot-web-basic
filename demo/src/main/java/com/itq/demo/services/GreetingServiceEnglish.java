package com.itq.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceEnglish implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
