package com.itq.demo.controllers;

import com.itq.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/greeting")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping
    String sayHello() {
        return greetingService.sayHello();
    }

}
