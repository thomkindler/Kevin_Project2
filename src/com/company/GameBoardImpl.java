package com.company;

import java.util.HashSet;

public class GameBoardImpl implements GameBoard {

    private HashSet<Square> mySquares= new HashSet<>();


    GameBoardImpl() {
        for (int row=0; row<8;row++) {
            for (int col=0; col<8;col++) {
                mySquares.add(new SquareImpl(row, col));
            }
        }
    }

    @Override
    public void addSquares() {

    }

    @Override
    public String getStatusSquares() {
        return null;
    }

    @Override
    public String getStatusPlayers() {
        return null;
    }
}
