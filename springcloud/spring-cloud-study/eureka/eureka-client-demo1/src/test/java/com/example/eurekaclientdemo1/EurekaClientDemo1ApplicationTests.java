package com.example.eurekaclientdemo1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = EurekaClientDemo1Application.class)
class EurekaClientDemo1ApplicationTests {

    @Autowired
    private ProducerController producerController;

    @Test
    void contextLoads() {
        System.out.println(producerController);
    }

}
