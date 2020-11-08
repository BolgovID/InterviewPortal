package com.ws.bolhov.interview_portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


}
