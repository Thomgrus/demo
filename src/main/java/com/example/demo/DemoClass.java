package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DemoClass {

    @Value("${spring.application.name}")
    private String appName;

    static {
        System.out.println(DemoClass.class);
    }

    @PostConstruct
    void init() {
        System.out.println("Demo class with App Name set to %s".formatted(appName));
    }

    public String getAppName() {
        return appName;
    }

    public String sayHello(String name) {
        return "Hello %s!".formatted(name);
    }

}
