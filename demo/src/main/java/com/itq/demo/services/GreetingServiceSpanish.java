package com.itq.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class GreetingServiceSpanish implements GreetingService
{
    @Override
    public String sayHello() {
        return "Hola Mundo!";
    }
}
