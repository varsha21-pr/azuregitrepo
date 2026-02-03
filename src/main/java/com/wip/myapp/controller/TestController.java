package com.wip.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return " Hello Varsha! Spring Boot App is LIVE on Azure ";
    }
}
