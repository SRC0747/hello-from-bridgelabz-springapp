package com.bridgelabz.hellofrombridgelabzspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : Print welcome message using REST Controller to respond to the REST Request
 *
 * @author : Sampriti Roy Chowdhury
 * @version : 0.0.1
 * @since : 1-12-2021
 */

@RestController
public class HelloRestController {
    /**
     * Purpose : This method is used to get greeting hello message from BridgeLabz using RestController
     *
     * @return greeting hello message
     */
    @GetMapping("/greeting")
    public String greet() {
        return "Hello From BridgeLabz";
    }
}
