package com.vranec.canasta.frontend;

import com.vranec.canasta.Card;
import com.vranec.canasta.Game;
import lombok.Getter;

import java.util.Collection;

public class CurrentPlayerGameView {
    @Getter
    private final Collection<Card> currentPlayerHand;

    public CurrentPlayerGameView(Game game, int playerIndex) {
        this.currentPlayerHand = game.getPlayer(playerIndex).getHand();
    }
}
