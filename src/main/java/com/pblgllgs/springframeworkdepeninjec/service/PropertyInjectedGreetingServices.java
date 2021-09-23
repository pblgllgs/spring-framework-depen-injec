package com.pblgllgs.springframeworkdepeninjec.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServices implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello------Property";
    }
}
