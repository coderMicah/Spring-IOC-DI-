package com.micah.spring_basics.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
  private GameConsole game;

  public GameRunner(@Qualifier("PacManGameQualifier")GameConsole game){
    this.game = game;
  }

  public void run(){
    game.up();
    game.down();
    game.right();
    game.left();

    System.out.println("Running game" + game);
  }
}
