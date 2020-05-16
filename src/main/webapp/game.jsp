    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
        <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
        <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>CSS Playing Cards</title>
        <link rel="stylesheet" type="text/css" href="cards.css" media="screen" />
        </head>
        <body>
        <div class="playingCards rotateHand">
        <ul class="hand">
            <% for(com.vranec.canasta.Card card: new com.vranec.canasta.Game().getPlayers().get(0).getHand()) { %>
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