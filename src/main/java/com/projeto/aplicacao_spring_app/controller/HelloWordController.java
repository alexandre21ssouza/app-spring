package com.projeto.aplicacao_spring_app.controller;

import com.projeto.aplicacao_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String helloWord(){
        return helloWorldService.helloWorld("Alexandre");
    }
}
