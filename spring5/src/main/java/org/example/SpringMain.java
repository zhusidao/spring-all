package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhusidao855
 * @version 1.0
 * @date 2020/6/28 9:24
 */
public class SpringMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        MainConfig mainConfig = context.getBean(MainConfig.class);
        mainConfig.sayHello();
    }
}
