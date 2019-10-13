package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // chess project
        // Assignment 2

        //implement new Game instance
        Game myGame = new GameImpl();

        //initialize Game
        myGame.initialize();

        //run game until return is true: game finsihed or user wants to abort
        while (!myGame.nextMove()) {
            //print game status
            myGame.gameStatus();
        }

        //print final game status
        myGame.finalGameStatus();
    }
}
