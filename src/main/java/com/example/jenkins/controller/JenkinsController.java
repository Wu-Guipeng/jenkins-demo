package com.example.jenkins.controller;

import com.example.jenkins.entity.Jenkins;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {


    @GetMapping("/hello")
    private String hello(){
        Jenkins jenkins = new Jenkins();
        jenkins.setName("hello");
        return jenkins.getName();
    }
}
