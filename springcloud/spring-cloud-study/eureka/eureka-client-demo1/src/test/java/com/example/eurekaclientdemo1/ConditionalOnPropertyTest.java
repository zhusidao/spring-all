package com.example.eurekaclientdemo1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhusidao855
 * @version 1.0
 * @date 2020/6/17 14:13
 */
public class ConditionalOnPropertyTest extends EurekaClientDemo1ApplicationTests {
    @Autowired
    private ProducerController producerController;

    @Test
    public void testMatchIfMissing() {
        System.out.println(producerController);
    }
}
