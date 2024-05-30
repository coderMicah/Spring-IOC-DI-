package com.micah.spring_basics.game;

public class PacManGame implements GameConsole {
   public void up(){
    System.out.println("Jump up");
   }
   public void down(){
    System.out.println("Crawl");
   }
   public void left(){
    System.out.println("Go back");
   }
   public void right(){
    System.out.println("Accelerate");
   }
}
