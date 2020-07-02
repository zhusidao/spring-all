package com.example.eurekaclientdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientDemo1Application.class, args);
    }

    @ResponseBody
    @GetMapping("index")
    public String sayHello() {
        return "this is a first server";
    }

    /**
     * matchIfMissing是否进行条件匹配如果属性不存在
     */
    @Bean
    @ConditionalOnProperty(value = "abc", matchIfMissing = true)
    public ProducerController test() {
        return new ProducerController();
    }
}
