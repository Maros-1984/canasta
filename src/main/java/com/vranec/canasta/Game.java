package com.vranec.canasta;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final int INITIAL_COUNT_OF_CARDS_IN_HAND = 14;
    @Getter
    private final List<Player> players;
    private final Stock stock = new Stock();

    public Game() {
        this(4);
    }

    public Game(int countOfPlayers) {
        players = new ArrayList<>();
        for (int i = 0; i < countOfPlayers; i++) {
            Player newPlayer = new Player();
            for (int c = 0; c < INITIAL_COUNT_OF_CARDS_IN_HAND; c++) {
                newPlayer.takeCard(stock.getTopCard());
            }
            players.add(newPlayer);
        }
    }
}
