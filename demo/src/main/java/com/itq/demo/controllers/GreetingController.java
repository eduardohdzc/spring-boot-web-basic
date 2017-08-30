package com.itq.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping
    String sayHello() {
        return "Hello World from Greeting Controller!";
    }

}
