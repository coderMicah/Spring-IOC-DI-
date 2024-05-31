package com.micah.spring_basics.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic {

    // Field based injection
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    // constructor injection
    // @Autowired (@Autowired annotation is not mandatory when using construvctor injection)
    // public BusinessLogic(Dependency1 dp1,Dependency2 dp2){
    // this.dependency1 = dp1;
    // this.dependency2 =dp2;
    // }

    // setter injection
    // @Autowired
    // public void setDep1(Dependency1 dp1){
    // this.dependency1 = dp1;
    // }

    // @Autowired
    // public void setDep2(Dependency2 dp2){
    // this.dependency2 = dp2;
    // }

}

@Component
class Dependency1 {
    // Some business logic
}

@Component
class Dependency2 {
    // Some business logic
}

@Configuration
@ComponentScan
public class DependencyInjection {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjection.class)) {
            System.out.println(context.getBeanDefinitionCount());
            System.out.println(context.getBean(BusinessLogic.class));
        }
    }
}
