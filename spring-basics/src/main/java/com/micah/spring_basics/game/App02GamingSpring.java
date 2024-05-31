package com.micah.spring_basics.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(GamingConfig.class);
        context.refresh();

       context.getBean(GameConsole.class).up();
       context.getBean(GameRunner.class).run();

       context.close();

    }

 
}
