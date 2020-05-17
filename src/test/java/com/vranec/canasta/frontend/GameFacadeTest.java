package com.vranec.canasta.frontend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class GameFacadeTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;

    @Test
    void constructor_canBeCalled() {
        assertThat(new GameFacade()).isNotNull();
    }

    @Test
    void getCurrentPlayerGameView_givenNoPlayerHttpParameter_returnsFirstPlayerGameView() throws IOException {
        CurrentPlayerGameView gameView = GameFacade.getCurrentPlayerGameView(request, response);

        assertThat(gameView.getCurrentPlayerHand()).isEqualTo(
                GameFacade.getCurrentPlayerGameView(request, response).getCurrentPlayerHand());
    }

    @Test
    void getCurrentPlayerGameView_given2ndPlayerHttpParameter_returnsSecondPlayerGameView() throws IOException {
        CurrentPlayerGameView gameView = GameFacade.getCurrentPlayerGameView(request, response);
        Mockito.when(request.getParameter("player")).thenReturn("1");

        assertThat(gameView.getCurrentPlayerHand()).isNotEqualTo(
                GameFacade.getCurrentPlayerGameView(request, response).getCurrentPlayerHand());
    }
}