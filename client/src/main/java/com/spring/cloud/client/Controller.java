package com.spring.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceClient serviceClient;

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return serviceClient.sayHiFromClientOne(name);
    }
}
