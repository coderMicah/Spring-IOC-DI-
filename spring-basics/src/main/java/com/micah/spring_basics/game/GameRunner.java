package com.micah.spring_basics.game;

public class GameRunner {
  private GameConsole game;

  public GameRunner(GameConsole game){
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
