package com.micah.spring_basics.wiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String country, String city) {};

@Configuration
public class ConfigClass {

    @Bean
    public String name() {
        return "micah";
    }

    @Bean
    public int age() {
        return 48;
    }

    @Bean
    public String country() {
        return "Tanzania";
    }
    @Bean
    public String city() {
        return "Dar es Salaam";
    }

    @Bean
    public Person person() {
        return new Person("John", 55);
    }

    @Bean
    public Person person2() {
        return new Person(name(), age());
    }
  

    @Bean(name = "country-city-address")
    public Address mycity() {
        return new Address("Kenya", "Nairobi");
    }

    @Bean
    @Qualifier("city2Qualifier")
    public Address city2(String country,String city) {
        return new Address(country,city);
    }

}
