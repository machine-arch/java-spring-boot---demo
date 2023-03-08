package com.examplege.example.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, String address, int age, String id) {
}

@Configuration
public class configurationClass {
    @Bean
    public String Name() {
        return "Mario";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person Person() {
        return new Person(Name(),"madagaskari",age(),"123");
    }
}
