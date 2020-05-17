package com.vranec.canasta;

import lombok.Getter;
import org.apache.commons.collections4.list.TreeList;

import java.util.List;

public class Player {
    @Getter
    private List<Card> hand = new TreeList<>();

    public void takeCard(Card card) {
        hand.add(card);
    }
}
