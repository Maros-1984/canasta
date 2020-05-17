package com.vranec.canasta;

import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {
    @Getter
    private final List<Player> players;
    private final LinkedList<GameRound> rounds = new LinkedList<>();

    public Game() {
        this(4);
    }

    public Game(int countOfPlayers) {
        players = new ArrayList<>();
        for (int i = 0; i < countOfPlayers; i++) {
            players.add(new Player());
        }
        rounds.add(new GameRound(players));
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }
}
