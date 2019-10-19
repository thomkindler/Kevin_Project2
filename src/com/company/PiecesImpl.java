package com.company;

import java.util.*;

enum Piece {
    WHITE_PAWN_1("W","P") ,WHITE_PAWN_2("W","P") ,WHITE_PAWN_3("W","P") ,WHITE_PAWN_4("W","P") ,WHITE_PAWN_5("W","P") ,
    WHITE_PAWN_6("W","P") ,WHITE_PAWN_7("W","P") ,WHITE_PAWN_8("W","P"),
    WHITE_TOWER_1("W","T"), WHITE_TOWER_2("W","T"), WHITE_KNIGHT_1("W","K"), WHITE_KNIGHT_2("W","K"), WHITE_BISHOP_1("W","B"),
    WHITE_BISHOP_2("W","B"), WHITE_QUEEN("W","Q"),WHITE_KING("W","K"),
    BLACK_PAWN_1("B","P") ,BLACK_PAWN_2("B","P") ,BLACK_PAWN_3("B","P") ,BLACK_PAWN_4("B","P") ,BLACK_PAWN_5("B","P") ,
    BLACK_PAWN_6("B","P") ,BLACK_PAWN_7("B","P") ,BLACK_PAWN_8("B","P"),
    BLACK_TOWER_1("B","T"), BLACK_TOWER_2("B","T"), BLACK_KNIGHT_1("B","K"), BLACK_KNIGHT_2("B","K"), BLACK_BISHOP_1("B","B"),
    BLACK_BISHOP_2("B","B"), BLACK_QUEEN("B","Q"), BLACK_KING("B","K");

    private int row_pos;
    private String col_pos;
    private String adr;
    private String color;
    private String type;

    Piece(String color, String type) {
        this.color=color;
        this.type=type;
    }

    public void setPos(String col_pos, int row_pos) {
        this.row_pos=row_pos;
        this.col_pos=col_pos;
        this.adr=String.format("%1s%1d",this.col_pos, this.row_pos );

    }
    String getPos() {
        return(adr);
    }



    public String toString() {
        String out="";
        out=out.concat(this.color);
        out=out.concat(this.type);

        return(out);
    }


}


public class PiecesImpl implements Pieces {
    //Map to hold all White Pieces
    Map<String, Piece> whitePieces = new HashMap<String, Piece>();
    //Map to hold all Black Pieces
    Map<String, Piece> blackPieces = new HashMap<String, Piece>();
    List<Character> listOfFigures = new ArrayList<Character>();


    PiecesImpl() {
        listOfFigures.add('P');
        listOfFigures.add('T');
        listOfFigures.add('N');
        listOfFigures.add('Q');
        listOfFigures.add('K');
        listOfFigures.add('B');
    }

    @Override
    public boolean moveSyntaxOK(String move) {
        if (move.isEmpty()) return(false);
        if (move.length()!=3) return(false);

        char[]  cArray = move.toCharArray();
        if ( ! listOfFigures.contains(cArray[0]))
            return (false) ;
        if ( (cArray[1] < 'a') || (cArray[1] >'h') )
            return (false) ;
        if ( (cArray[2] < '0') || (cArray[2] >'8') )
            return (false) ;

        return true;
    }

    @Override
    public boolean makeMove(String move, String color) {

        return true;
    }


    @Override
    public void createNewPieces(GameBoard myBoard) {
        Piece a;

        a= Piece.WHITE_TOWER_1 ;
        a.setPos("a",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_KNIGHT_1);
        a.setPos("b",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_BISHOP_1);
        a.setPos("c",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_QUEEN);
        a.setPos("d",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_KING);
        a.setPos("e",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_BISHOP_2);
        a.setPos("f",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_KNIGHT_2);
        a.setPos("g",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_TOWER_2);
        a.setPos("h",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);


        a= (Piece.BLACK_TOWER_1);
        a.setPos("a",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_KNIGHT_1);
        a.setPos("b",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_BISHOP_1);
        a.setPos("c",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_QUEEN);
        a.setPos("d",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_KING);
        a.setPos("e",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_BISHOP_2);
        a.setPos("f",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_KNIGHT_2);
        a.setPos("g",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_TOWER_2);
        a.setPos("h",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);
        a= (Piece.WHITE_TOWER_1);
        a.setPos("a",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_KNIGHT_1);
        a.setPos("b",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_BISHOP_1);
        a.setPos("c",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_QUEEN);
        a.setPos("d",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_KING);
        a.setPos("e",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_BISHOP_2);
        a.setPos("f",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_KNIGHT_2);
        a.setPos("g",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_TOWER_2);
        a.setPos("h",1);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);


        a= (Piece.BLACK_TOWER_1);
        a.setPos("a",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_KNIGHT_1);
        a.setPos("b",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_BISHOP_1);
        a.setPos("c",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_QUEEN);
        a.setPos("d",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_KING);
        a.setPos("e",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_BISHOP_2);
        a.setPos("f",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_KNIGHT_2);
        a.setPos("g",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_TOWER_2);
        a.setPos("h",8);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);



        a= (Piece.WHITE_PAWN_1);
        a.setPos("a",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_PAWN_2);
        a.setPos("b",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_PAWN_3);
        a.setPos("c",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_PAWN_4);
        a.setPos("d",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_PAWN_5);
        a.setPos("e",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_PAWN_6);
        a.setPos("f",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_PAWN_7);
        a.setPos("g",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.WHITE_PAWN_8);
        a.setPos("h",2);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);


        a= (Piece.BLACK_PAWN_1);
        a.setPos("a",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_PAWN_2);
        a.setPos("b",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_PAWN_3);
        a.setPos("c",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_PAWN_4);
        a.setPos("d",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_PAWN_5);
        a.setPos("e",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_PAWN_6);
        a.setPos("f",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_PAWN_7);
        a.setPos("g",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);

        a= (Piece.BLACK_PAWN_8);
        a.setPos("h",7);
        whitePieces.put(a.getPos(), a);
        myBoard.putPiece(a.getPos(),a);
    }
}
