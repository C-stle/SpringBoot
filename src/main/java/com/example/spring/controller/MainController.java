package com.example.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
 
    @GetMapping("/home")
    public String homePage(HttpServletRequest request) {
        return "content/home";
    }
    
}
