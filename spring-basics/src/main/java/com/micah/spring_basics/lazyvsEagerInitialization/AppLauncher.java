package com.micah.spring_basics.lazyvsEagerInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
}

/**
 * @Lazy annotation prevents eager initialization of spring beans i.e Spring
 *       Beans to be
 *       initialized whe the Spring Context or IOC Container is launched
 * 
 *       By default spring initializes Beans(objects) as soon as the context is
 *       launched
 *       this enables to discover errors immediately during application startup
 * 
 *       Although we used @Lazy BUT ITS NOT RECOMMENDED
 * 
 *       The spring context will initialize beans with @Lazy annotation when the
 *       initialization
 *       of all the other beans have completed
 */
@Component
@Lazy
class ClassB {
    private ClassA classInst;

    public ClassB(ClassA classA) {
        System.out.println("Some Initialization logic");
        this.classInst = classA;
    }

    public void doSomething() {
        System.out.println("Do something");
    }
}

@Configuration
@ComponentScan
public class AppLauncher {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppLauncher.class);

        System.out.println("Initialization of all other Beans(since are initialized eager)");
        
        context.getBean(ClassB.class).doSomething();
       

        context.close();
    }

}
