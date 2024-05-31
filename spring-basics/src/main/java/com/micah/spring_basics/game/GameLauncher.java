package com.micah.spring_basics.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.micah.spring_basics.game")
public class GameLauncher {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(GameLauncher.class);
        context.refresh();

       context.getBean(GameConsole.class).up();
       context.getBean(GameRunner.class).run();

       context.close();

    }

 
}
