package com.vranec.canasta;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    @Test
    void newGame_shouldHave4Players() {
        Game game = new Game();

        assertThat(game.getPlayers()).hasSize(4);
    }

    @Test
    void newGame_shouldDeal14CardsToEachPlayer() {
        Game game = new Game();

        assertThat(game.getPlayers().get(0).getHand()).hasSize(14);
    }
}
