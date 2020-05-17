package com.vranec.canasta.frontend;

import com.vranec.canasta.Game;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GameFacade {
    private static final Game game = new Game();

    GameFacade() {
        // This is a utility class.
    }

    public static CurrentPlayerGameView getCurrentPlayerGameView(
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        return new CurrentPlayerGameView(
                game,
                getPlayerIndex(request, response));
    }

    private static int getPlayerIndex(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String player = request.getParameter("player");
        if (StringUtils.isBlank(player)) {
            player = "0";
            response.sendRedirect(request.getRequestURI() + "?player=0");
        }
        return Integer.parseInt(player);
    }
}
