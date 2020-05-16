package com.vranec.canasta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Stock {
    private final Queue<Card> cards;

    public Stock() {
        List<Card> cards = new ArrayList<>();
        cards.addAll(EnumSet.allOf(Card.class));
        cards.addAll(EnumSet.allOf(Card.class));
        cards.add(Card.JOKER);
        cards.add(Card.JOKER);
        Collections.shuffle(cards);
        this.cards = new LinkedList<>(cards);
    }

    public Card getTopCard() {
        return cards.poll();
    }

    public int size() {
        return cards.size();
    }
}
