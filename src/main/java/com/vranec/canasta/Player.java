package com.vranec.canasta;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;

public class Player {
    @Getter
    private Collection<Card> hand = new ArrayList<>();

    public void takeCard(Card card) {
        hand.add(card);
    }
}
