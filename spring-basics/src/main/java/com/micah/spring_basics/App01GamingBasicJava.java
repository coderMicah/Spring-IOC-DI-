package com.micah.spring_basics;

import com.micah.spring_basics.game.GameRunner;
import com.micah.spring_basics.game.MarioGame;
import com.micah.spring_basics.game.PacManGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var pacmanGame = new PacManGame();


        var gameRunner = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(pacmanGame);

        gameRunner.run();
        gameRunner2.run();

    }
}
