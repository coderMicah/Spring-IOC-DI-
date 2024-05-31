package com.micah.spring_basics.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GameConsole {
   public void up(){
    System.out.println("Jump up");
   }
   public void down(){
    System.out.println("Go into a hole");
   }
   public void left(){
    System.out.println("Turn left");
   }
   public void right(){
    System.out.println("Turn right");
   }
}
