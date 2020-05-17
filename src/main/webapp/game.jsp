<%@ page import="com.vranec.canasta.Card" %>
<%@ page import="com.vranec.canasta.frontend.CurrentPlayerGameView" %>
<%@ page import="com.vranec.canasta.frontend.GameFacade" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>Canasta Multiplayer Game</title>
    <link rel="stylesheet" type="text/css" href="cards.css" media="screen"/>
</head>
<body>
<div class="playingCards rotateHand">
    <ul class="hand">
        <% CurrentPlayerGameView game = GameFacade.getCurrentPlayerGameView(request, response);
            for (Card card : game.getCurrentPlayerHand()) { %>
        <li>
            <a class="card rank-<%=card.getRank() %>
            <%=card.getSuit() %>" href="#">
                <span class="rank"><%=card.getRank() %></span>
                <span class="suit">&<%=card.getSuit() %>;</span>
            </a>
        </li>
        <% } %>
    </ul>
</div>
</body>
</html>