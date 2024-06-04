package com.micah.spring_basics.preConstructPostDestroy;

import org.springframework.stereotype.Component;

@Component
public class SomeDependencyClass {
    public void getReady(){
        System.out.println("Some logic using some dependencies");
    }
}
