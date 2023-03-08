package com.examplege.example.test;

public class GameRuner {
    MarioGame game;

    public GameRuner(MarioGame game) {
        this.game = game;
    }

    public String  run() {
        return "Game is running"+game; // game.toString()
    }

}
