package com.micah.spring_basics.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {
    
    @Bean
    public GameConsole game(){
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(){
        var gameRunner = new GameRunner(game());
        return gameRunner;

    }

}
