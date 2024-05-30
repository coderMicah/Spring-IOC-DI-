package com.micah.spring_basics;

import java.io.Serializable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// PLAIN OLD JAVA OBJECT --> any java object
// It doesn’t strictly adhere to conventions like JavaBeans.
public class POJOClass {
    private int age;
    private String name;

    public String toString() {
        return name + ":" + age;
    }

}

// JAVABEAN MUST implements Serializable or Externalizable interface
//must have a public no-arg constructor
//must have gettrs and setters
class JavaBean implements Serializable {

    // MUST HAVE A PUBLIC NO-ARG CONSTRUCTOR
    public JavaBean() {
    }

    private int age;
    private String name;

    // MUST HAVE GETTERS AND SETTERS

    // getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}


@Configuration
class ApplicationConfig{

    //anything that is managed by spring is a Spring Bean
    @Bean
    public String city(){
        return "Kyoto";
    }
}