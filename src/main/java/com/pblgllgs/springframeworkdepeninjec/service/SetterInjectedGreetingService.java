package com.pblgllgs.springframeworkdepeninjec.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements  GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello------Setter";
    }
}
