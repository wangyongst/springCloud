package com.spring.cloud.client;

import org.springframework.stereotype.Component;

@Component
public class ServiceClientHystric implements ServiceClient {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
