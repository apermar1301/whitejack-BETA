package main;

import entitys.Player;
import tools.Console;

public class GamePanel {

    Console console;
    Player player = new Player();

    public GamePanel() {
        this.console = new Console();
        this.player = new Player();
    }

    public void start() {
        while (true) {
            int option = console.showMenu();
            switch (option) {
                case 1:
                    createLobby();
                    break;
                case 2:
                    console.showMessage("Saliendo...");
                    return;
                default:
                    console.showMessage("Opción no válida");
            }
        }
    }

    public void createLobby() {
        console.showMessage("Creando lobby...");
        Lobby lobby = new Lobby(player, this);
        console.clear();
        lobby.start();
    }
}
