package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GameBoardImpl implements GameBoard {

    Map<String, Square> mySquares = new HashMap<String, Square>();

    private static int num_rows=8;
    private static int num_cols=8;


    GameBoardImpl() {
        String id;
        for (int row=0; row<num_rows;row++) {
            for (int col=0; col<num_cols;col++) {
                id=String.format("%1s%1s", Character.toString((char) (97+col)), row+1 );
                mySquares.put(id, new SquareImpl(id, row, col));
            }
        }

    }

    @Override
    public void addSquares() {

    }

    @Override
    public String getStatusSquares() {
        String out="";
        String adress;
        for (int row=num_rows; row>0;row--) {
            for (int col = 0; col < num_cols; col++) {
                adress=String.format("%1s%1s", Character.toString((char) (97+col)),row );
                out= out.concat(mySquares.get(adress).getPieceHeld());
            }
            out=out.concat("\n");
        }
        return (out);
    }

    @Override
    public String getStatusPlayers() {
        return null;
    }

    @Override
    public void putPiece(String adr, Piece thePiece) {
        mySquares.get(adr).putPieceHeld(thePiece);
    }
}
