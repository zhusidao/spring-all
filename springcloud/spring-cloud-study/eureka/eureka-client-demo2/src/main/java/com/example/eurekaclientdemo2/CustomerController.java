package com.example.eurekaclientdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhusidao855
 * @version 1.0
 * @date 2020/4/29 16:40
 */
@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String APPLICATION_NAME = "desktop-8mlp1r3:8763";

    @RequestMapping(value = "get")
    public String commonRequest() {
        String url = "http://" + APPLICATION_NAME + "/index";
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}
