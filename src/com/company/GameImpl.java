package com.company;

import java.util.Scanner;

public class GameImpl implements Game {
    private GameBoard myBoard;
    private Players myPlayers;
    private Pieces myPieces;
    private Scanner myInput;

    @Override
    public void initialize() {
        myInput = new Scanner( System.in );
        myBoard= new GameBoardImpl();
        myPlayers = new PlayersImpl();
        System.out.print("Add Name of player Nr. 1 playing with white pieces: ");
        myPlayers.addPlayer( myInput.next(), "White" );
        System.out.print("Add Name of player Nr. 2 playing with black pieces: ");
        myPlayers.addPlayer( myInput.next(), "Black" );
        myPieces = new PiecesImpl();
        myPieces.createNewPieces(myBoard);
    }

    @Override
    public boolean nextMove() {
        Player currentPlayer=this.myPlayers.getNextPlayer();
        System.out.print(String.format("Which move for player %s playing with %s pieces: ",currentPlayer.getName(),currentPlayer.getColor()));
        String move= myInput.next();
        while (!myPieces.moveSyntaxOK(move)) {
            error_text_format(currentPlayer);
            move= myInput.next();
        }

        while (!myPieces.makeMove(move,currentPlayer.getColor() ) ) {
            error_text_move(currentPlayer);
            move= myInput.next();
        }

        myPlayers.addPlayer(currentPlayer);

        if (myBoard.isPlayerChessMate()) {
            return true;
        }

        return false;
    }

    @Override
    public void gameStatus() {

        System.out.println(this.myBoard.getStatusSquares());
        System.out.println();

    }

    @Override
    public void finalGameStatus() {
        System.out.println("Final status of game");
        System.out.println(this.myBoard.getStatusSquares());
        System.out.println();

    }

    @Override
    public boolean quit() {
        System.out.print("Do you want to quit game? (y / n)");
        if ( myInput.next().equals("y")) {
            return true;
        }
        return(false);
    }

    private void error_text_move(Player currentPlayer) {
        System.out.println("Move not possible");
        System.out.println("Try again");
        System.out.println(String.format("Which move for player %s playing with %s pieces: ",currentPlayer.getName(),currentPlayer.getColor()));
    }

    private void error_text_format(Player currentPlayer) {
        System.out.println("Input was in wrong format!");
        System.out.println("Proper format!: Xyn, with");
        System.out.println("\tX being the shortcut for the piece you want to move (P=Pawn, T=Tower, N=Knight, Q=Queen, K=King)");
        System.out.println("\ty being the column (a .. h");
        System.out.println("\tn being the row (1 .. 8");
        System.out.println("Try again");
        System.out.println(String.format("Which move for player %s playing with %s pieces: ",currentPlayer.getName(),currentPlayer.getColor()));
    }
}
