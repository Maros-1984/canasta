package com.vranec.canasta;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Card {
    SPADES_3("3", "spades", 5),
    DIAMONDS_3("3", "diams", 5),
    CLUBS_3("3", "clubs", 5),
    HEARTS_3("3", "hearts", 5),
    SPADES_4("4", "spades", 5),
    HEARTS_4("4", "hearts", 5),
    CLUBS_4("4", "clubs", 5),
    DIAMONDS_4("4", "diams", 5),
    SPADES_5("5", "spades", 5),
    HEARTS_5("5", "hearts", 5),
    CLUBS_5("5", "clubs", 5),
    DIAMONDS_5("5", "diams", 5),
    SPADES_6("6", "spades", 5),
    HEARTS_6("6", "hearts", 5),
    CLUBS_6("6", "clubs", 5),
    DIAMONDS_6("6", "diams", 5),
    SPADES_7("7", "spades", 5),
    HEARTS_7("7", "hearts", 5),
    CLUBS_7("7", "clubs", 5),
    DIAMONDS_7("7", "diams", 5),
    SPADES_8("8", "spades", 10),
    HEARTS_8("8", "hearts", 10),
    CLUBS_8("8", "clubs", 10),
    DIAMONDS_8("8", "diams", 10),
    SPADES_9("9", "spades", 10),
    HEARTS_9("9", "hearts", 10),
    CLUBS_9("9", "clubs", 10),
    DIAMONDS_9("9", "diams", 10),
    SPADES_10("10", "spades", 10),
    HEARTS_10("10", "hearts", 10),
    CLUBS_10("10", "clubs", 10),
    DIAMONDS_10("10", "diams", 10),
    SPADES_JACK("J", "spades", 10),
    HEARTS_JACK("J", "hearts", 10),
    CLUBS_JACK("J", "clubs", 10),
    DIAMONDS_JACK("J", "diams", 10),
    SPADES_QUEEN("Q", "spades", 10),
    HEARTS_QUEEN("Q", "hearts", 10),
    CLUBS_QUEEN("Q", "clubs", 10),
    DIAMONDS_QUEEN("Q", "diams", 10),
    SPADES_KING("K", "spades", 10),
    HEARTS_KING("K", "hearts", 10),
    CLUBS_KING("K", "clubs", 10),
    DIAMONDS_KING("K", "diams", 10),
    SPADES_ACE("A", "spades", 20),
    HEARTS_ACE("A", "hearts", 20),
    DIAMONDS_ACE("A", "diams", 20),
    CLUBS_ACE("A", "clubs", 20),
    SPADES_2("2", "spades", 20),
    HEARTS_2("2", "hearts", 20),
    CLUBS_2("2", "clubs", 20),
    DIAMONDS_2("2", "diams", 20),
    JOKER("", "joker", 50);

    private final String rank;
    private final String suit;
    private final int value;
}
