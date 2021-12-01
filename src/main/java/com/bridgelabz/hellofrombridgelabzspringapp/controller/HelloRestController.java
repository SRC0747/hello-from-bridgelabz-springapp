package com.bridgelabz.hellofrombridgelabzspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/greeting")
    public String greet() {
        return "Hello From BridgeLabz";
    }
}
