package com.projeto.aplicacao_spring_app.controller;

import com.projeto.aplicacao_spring_app.domain.User;
import com.projeto.aplicacao_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String helloWord(){
        return helloWorldService.helloWorld("Alexandre");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
        return "Hello World" + body.getName();
    }
}
