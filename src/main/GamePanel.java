package main;

import entitys.Player;

public class GamePanel {

    Player player = new Player();

    public void start() {
	createLobby();
    }

    public void createLobby() {
	Lobby lobby = new Lobby(player);
    }

}
