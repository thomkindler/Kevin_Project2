package com.company;

import java.util.LinkedList;
import java.util.Queue;
public class PlayersImpl implements Players {

    private Queue<Player> myPlayers = new LinkedList<Player>();

    @Override
    public void addPlayer(Player myPlayer) {
        this.myPlayers.add(myPlayer);
    }

    @Override
    public void addPlayer(String name, String color) {
        Player myPlayer= new PlayerImpl(name, color);
        this.myPlayers.add(myPlayer);
    }

    @Override
    public Player getNextPlayer() {
        return this.myPlayers.remove();
    }

}
