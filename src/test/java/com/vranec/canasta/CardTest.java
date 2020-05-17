package com.vranec.canasta;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardTest {
    @Test
    void getRank_returnsFrontendRank() {
        assertThat(Card.CLUBS_6.getRank()).isEqualTo("6");
    }

    @Test
    void getSuit_returnsFrontendSuit() {
        assertThat(Card.CLUBS_6.getSuit()).isEqualTo("clubs");
    }

    @Test
    void getValue_returnsCardValue() {
        assertThat(Card.CLUBS_6.getValue()).isEqualTo(5);
    }
}