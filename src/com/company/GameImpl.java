package com.company;

import java.util.Scanner;

public class GameImpl implements Game {

    @Override
    public void initialize() {
        Scanner myInput = new Scanner( System.in );

        GameBoard myBoard= new GameBoardImpl();
        Players myPlayers = new PlayersImpl();
        System.out.print("Add Name of player Nr. 1: ");
        myPlayers.addPlayer( myInput.next() );
        System.out.print("Add Name of player Nr. 2: ");
        myPlayers.addPlayer( myInput.next() );
    }

    @Override
    public boolean nextMove() {

        return true;
    }

    @Override
    public void gameStatus() {

    }

    @Override
    public void finalGameStatus() {

    }
}
