package com.company;

public interface GameBoard {
    void addSquares();
    String getStatusSquares();
    String getStatusPlayers();
    void putPiece(String adr, Piece thePiece);
    boolean isPlayerChessMate();
}
