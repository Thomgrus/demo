package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoClass {

    @Value("${spring.application.name}")
    private String appName;

    static {
        System.out.println(DemoClass.class);
    }

    public String getAppName() {
        return appName;
    }

}
