package com.company;

import java.util.Map;

public interface Pieces {
    void createNewPieces(GameBoard myBoard);
    boolean moveSyntaxOK(String move);

    boolean makeMove(String move, String color);

}
