package com.vranec.canasta;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Card {
    SPADES_2("2", "spades"),
    SPADES_3("3", "spades"),
    SPADES_4("4", "spades"),
    SPADES_5("5", "spades"),
    SPADES_6("6", "spades"),
    SPADES_7("7", "spades"),
    SPADES_8("8", "spades"),
    SPADES_9("9", "spades"),
    SPADES_10("10", "spades"),
    SPADES_JACK("J", "spades"),
    SPADES_QUEEN("Q", "spades"),
    SPADES_KING("K", "spades"),
    SPADES_ACE("A", "spades"),
    HEARTS_2("2", "hearts"),
    HEARTS_3("3", "hearts"),
    HEARTS_4("4", "hearts"),
    HEARTS_5("5", "hearts"),
    HEARTS_6("6", "hearts"),
    HEARTS_7("7", "hearts"),
    HEARTS_8("8", "hearts"),
    HEARTS_9("9", "hearts"),
    HEARTS_10("10", "hearts"),
    HEARTS_JACK("J", "hearts"),
    HEARTS_QUEEN("Q", "hearts"),
    HEARTS_KING("K", "hearts"),
    HEARTS_ACE("A", "hearts"),
    DIAMONDS_2("2", "diams"),
    DIAMONDS_3("3", "diams"),
    DIAMONDS_4("4", "diams"),
    DIAMONDS_5("5", "diams"),
    DIAMONDS_6("6", "diams"),
    DIAMONDS_7("7", "diams"),
    DIAMONDS_8("8", "diams"),
    DIAMONDS_9("9", "diams"),
    DIAMONDS_10("10", "diams"),
    DIAMONDS_JACK("J", "diams"),
    DIAMONDS_QUEEN("Q", "diams"),
    DIAMONDS_KING("K", "diams"),
    DIAMONDS_ACE("A", "diams"),
    CLUBS_2("2", "clubs"),
    CLUBS_3("3", "clubs"),
    CLUBS_4("4", "clubs"),
    CLUBS_5("5", "clubs"),
    CLUBS_6("6", "clubs"),
    CLUBS_7("7", "clubs"),
    CLUBS_8("8", "clubs"),
    CLUBS_9("9", "clubs"),
    CLUBS_10("10", "clubs"),
    CLUBS_JACK("J", "clubs"),
    CLUBS_QUEEN("Q", "clubs"),
    CLUBS_KING("K", "clubs"),
    CLUBS_ACE("A", "clubs"),
    JOKER("", "joker");

    private final String rank;
    private final String suit;
}
