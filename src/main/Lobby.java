package main;

import java.util.ArrayList;
import java.util.List;

import carts.Card;
import carts.Deck;
import entitys.Bot;
import entitys.Dealer;
import entitys.Player;
import tools.Console;

public class Lobby {

    private final GamePanel gp;
    private final Console console;
    private final Dealer dealer;
    private Deck deck;
    private final List<Bot> bots = new ArrayList<>();
    private final Player player;

    private int playerCount;

    public Lobby(Player player, GamePanel gp) {
        this.gp = gp;
        this.console = gp.console;
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.player = player;

        setPlayerCount();
        fillLobby();
    }

    private void fillLobby() {
        for (int i = 0; i < playerCount - 1; i++) {
            bots.add(new Bot());
        }
    }

    public void setPlayerCount() {
        int option = console.getInt("¿Cuántos jugadores quieres en la partida? (1-4)");
        if (option < 1 || option > 4) {
            console.showMessage("Opción no válida, se establecerá el número de jugadores a 2.");
            this.playerCount = 2;
        } else {
            this.playerCount = option;
        }
    }

    public void start() {
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
