package com.micah.spring_basics.preConstructPostDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppLauncher {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppLauncher.class);

        for (String beanDefinitionNames : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionNames);
        }
        context.close();
    }
}
