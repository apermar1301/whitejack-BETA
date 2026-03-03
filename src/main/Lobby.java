package main;

import java.util.ArrayList;

import carts.Deck;
import entitys.Bot;
import entitys.Dealer;
import entitys.Player;

public class Lobby {
    private Dealer dealer;
    private Deck deck;
    private ArrayList<Bot> bots = new ArrayList<Bot>();
    private Player player;

    private int playerCount;

    public Lobby(Player player) {

	this.dealer = new Dealer();
	this.deck = new Deck();
	this.player = player;

	fillLobby();

    }

    private void fillLobby() {

	for (int i = 0; i < playerCount - 1; i++) {

	    bots.add(new Bot());

	}

    }

    public void setPlayerCount(int playerCount) {
	this.playerCount = playerCount;
    }

}
