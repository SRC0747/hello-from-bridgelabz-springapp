package com.bridgelabz.hellofrombridgelabzspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Purpose : Print greeting and welcome message using MVC Controller on web service page
 *
 * @author : Sampriti Roy Chowdhury
 * @version : 0.0.1
 * @since : 1-12-2021
 */

@Controller
public class HelloWebController {
    /**
     * Purpose : This method is used to access the Greeting request from hello.html web page
     *
     * @return hello as greeting
     */
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    /**
     * Purpose : This method is used to access Custom Greeting Hello message from Bridgelabz
     *
     * @param model is used as a container storing the message attribute value in MVC architecture
     * @return the Greeting Custom Hello message from Bridgelabz
     */
    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message",
                "This is a custom message Hello from Bridgelabz");
        return "message";
    }
}
