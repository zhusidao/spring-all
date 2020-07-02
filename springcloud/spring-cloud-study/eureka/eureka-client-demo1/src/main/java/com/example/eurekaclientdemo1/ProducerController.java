package com.example.eurekaclientdemo1;

import org.springframework.web.bind.annotation.RequestMapping;

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
