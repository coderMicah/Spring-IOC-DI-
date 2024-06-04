package com.micah.spring_basics.preConstructPostDestroy;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class SomeClass {
   private SomeDependencyClass someDependency;

   public SomeClass(SomeDependencyClass someDependency) {
      super();
      this.someDependency = someDependency;
      System.out.println("All dependencies are ready");
   }

   // method is called just after DI is completed.
   // This method must be invoked b4 the class is put to service
   @PostConstruct
   public void initialize() {
      someDependency.getReady();
   }


   //This method is used to show that the instance is 
   // in the process of being reoved from the container
   // USED TO RELEASE RESOURCES
   @PreDestroy
   public void cleanup() {
      System.out.println("cleanup");
   }

}