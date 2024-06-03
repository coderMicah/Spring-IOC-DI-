package com.micah.spring_basics.beanscopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanScopesAppLauncher {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanScopesAppLauncher.class);

        // for (String beanDefinitionNames : context.getBeanDefinitionNames()) {
        // System.out.println(beanDefinitionNames);
        // }

        // we will get beans with the same hashcode since these are normal beans
        //same hashcode specifies tht the same bean instance is used throuht the application
        //no matter the number how many times the bean is being called
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        // we will get beans with DIFFERENT hashcode since these are PROTOTYPE beans

        //diff hashcodes specifies that with prototype class every bean call will
        //result into new instance
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        context.close();
    }
}
