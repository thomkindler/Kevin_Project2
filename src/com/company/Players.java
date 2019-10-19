package com.company;

public interface Players {
    void addPlayer(Player player);
    void addPlayer(String name, String color);
    Player getNextPlayer();
}
