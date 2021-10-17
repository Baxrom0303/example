package com.baha.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String getIndexPage(Model model){
        logger.debug("Welcome to mkyong.com...");
        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        return "index";
    }

    private String getMessage(){
        return "Hello World!";
    }
}
