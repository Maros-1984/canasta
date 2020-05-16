package com.vranec.canasta;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StockTest {
    @Test
    void newStock_contains108cards() {
        Stock stock = new Stock();

        assertThat(stock.size()).isEqualTo(108);
    }
}