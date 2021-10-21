package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoClassTests {

    @Autowired
    private DemoClass demoClass;

    @Test
    void sayHello() {
        Assertions.assertEquals("Hello Thomas!", demoClass.sayHello("Thomas"));
    }

}
