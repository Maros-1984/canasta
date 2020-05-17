package com.vranec.canasta;

import java.util.List;

public class GameRound {
    private static final int INITIAL_COUNT_OF_CARDS_IN_HAND = 14;
    private final Stock stock = new Stock();

    public GameRound(List<Player> players) {
        for (Player player : players) {
            player.getHand().clear();
            for (int c = 0; c < INITIAL_COUNT_OF_CARDS_IN_HAND; c++) {
                player.takeCard(stock.getTopCard());
            }
        }
    }
}
