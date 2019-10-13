package com.company;


public class SquareImpl implements Square {
    private int row;
    private int col;
    private String adress;
    private String color;

    SquareImpl(int row, int col) {
        this.row=row;
        this.col= col;
        this.adress=String.format("%1s%1s",row, Character.toString((char) (96+col)) );

        if (row%2 == 1) {
            if (col%2==1) color= "black";
            else color="white";
        }
        else {
            if (col%2==1) color= "white";
            else color="black";
        }
    }
}
