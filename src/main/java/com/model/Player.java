package com.model;

/**
 * <p>
 * This is the player entity class.
 * </p>
 * 
 * @author KOTBI Abderrahmane
 * @version 1.0
 */

public class Player {

    String name;
    int highScore;

    public Player() {
        this.name = "";
        this.highScore = 0;
    }

    public Player(String name, int highScore) {
        this.name = name;
        this.highScore = highScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}
