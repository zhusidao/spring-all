package com.example.eurekaclientdemo1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhusidao855
 * @version 1.0
 * @date 2020/4/29 17:34
 */

public class ProducerController {

    @RequestMapping(value = "index")
    public String commonRequest() {
        return "hello eureka";
    }
}
