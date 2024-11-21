package com.koyeb.examplespringboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/hi")
    public String hello(){
        return "hello.html";
    }
}
