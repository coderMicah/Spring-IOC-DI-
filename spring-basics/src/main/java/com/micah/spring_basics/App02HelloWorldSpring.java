package com.micah.spring_basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.micah.spring_basics.wiring.ConfigClass;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigClass.class);

        // retrieving beans using name
        System.out.println(context.getBean("name"));
        // System.out.println(context.getBean("age"));
        // System.out.println(context.getBean("person"));
        // System.out.println(context.getBean("person2"));
        // System.out.println(context.getBean("country"));
        // System.out.println(context.getBean("city"));
        // System.out.println(context.getBean("city2"));
        // System.out.println(context.getBean("country-city-address"));

        // retrieving beans using type
        // System.out.println(context.getBean(Address.class));

        // get list of beans by name or by count
        System.out.println(context.getBeanDefinitionCount());
    

        String[] allBeanNames = context.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            System.out.println("Bean name: " + beanName);
        }

        context.close();

    }
}
