package com.projeto.aplicacao_spring_app.configuration;

import org.springframework.context.annotation.Bean;

public class HelloConfiguration {

    @Bean
    public String helloWorld(){
        return "Hello world";
    }
    
}
