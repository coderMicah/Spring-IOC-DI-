package com.micah.spring_basics.game;


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
