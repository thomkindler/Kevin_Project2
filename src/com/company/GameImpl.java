package com.company;

import java.util.Scanner;

public class GameImpl implements Game {
    private GameBoard myBoard;
    private Players myPlayers;
    private Pieces myPieces;
    @Override
    public void initialize() {
        Scanner myInput = new Scanner( System.in );

        myBoard= new GameBoardImpl();
        myPlayers = new PlayersImpl();
        System.out.print("Add Name of player Nr. 1 playing with white pieces: ");
        myPlayers.addPlayer( myInput.next() );
        System.out.print("Add Name of player Nr. 2 playing with black pieces: ");
        myPlayers.addPlayer( myInput.next() );
        myPieces = new PiecesImpl();
        myPieces.createNewPieces(myBoard);
    }

    @Override
    public boolean nextMove() {

        return true;
    }

    @Override
    public void gameStatus() {

        System.out.println(this.myBoard.getStatusSquares());
        System.out.println();

    }

    @Override
    public void finalGameStatus() {

    }
}
