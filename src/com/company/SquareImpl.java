package com.company;


public class SquareImpl implements Square {
    private int row;
    private int col;
    private String adress;
    private String color;
    private Piece myPiece;

    SquareImpl(String id, int row, int col) {
        this.row=row;
        this.col= col;
        this.adress=id;

        myPiece=null;

        if (row%2 == 1) {
            if (col%2==1) color= "black";
            else color="white";
        }
        else {
            if (col%2==1) color= "white";
            else color="black";
        }
    }

    @Override
    public String getPieceHeld() {
        String out="";
        if (this.myPiece==null) {
            out=out.concat("[]");
        }
        else {
            out=out.concat(String.format("[%s]",this.myPiece.toString()));

        }

        return out;
    }

    @Override
    public void putPieceHeld(Piece thePiece) {
        this.myPiece=thePiece;
    }
}
