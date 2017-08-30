package com.itq.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSpanish implements GreetingService
{
    @Override
    public String sayHello() {
        return "Hola Mundo!";
    }
}
