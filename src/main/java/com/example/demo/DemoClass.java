package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoClass {

    @Value("${spring.application.name}")
    private String appName;

    static {
        System.out.println(DemoClass.class);
        System.out.println(appName);
    }

    public String getAppName() {
        return appName;
    }

    public String sayHello(String name) {
        return "Hello %s!".formatted(name);
    }

}
