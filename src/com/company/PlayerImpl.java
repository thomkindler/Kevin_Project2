package com.company;

public class PlayerImpl implements Player {
    private String name;
    private String color;



    public PlayerImpl(String name, String color) {
        this.name=name;
        this.color=color;
    }

    @Override
    public String getEatenPieces() {
        return null;
    }

    @Override
    public String getColor() {

        return this.color;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
