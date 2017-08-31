package com.itq.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class GreetingServiceSpanish implements GreetingService
{
    @Value("${greeting}")
    private String greeting;

    @Override
    public String sayHello() {
        return greeting;
    }
}
