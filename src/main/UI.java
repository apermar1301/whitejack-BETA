package main;

public class UI {
    // Reset
    public static final String RESET = "\033[0m";

    // Colores básicos
    public static final String BLACK = "\033[30m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String PURPLE = "\033[35m";
    public static final String CYAN = "\033[36m";
    public static final String WHITE = "\033[37m";

    // Colores brillantes
    public static final String BRIGHT_RED = "\033[91m";
    public static final String BRIGHT_GREEN = "\033[92m";
    public static final String BRIGHT_YELLOW = "\033[93m";
    public static final String BRIGHT_BLUE = "\033[94m";
    public static final String BRIGHT_PURPLE = "\033[95m";
    public static final String BRIGHT_CYAN = "\033[96m";

    // Estilos
    public static final String BOLD = "\033[1m";

    public UI() {

    }

    void showMessage(String text) {
	System.out.println(text);
    }

    void showMenu() {
	System.out.println("\033[2J\033[H" + // limpia pantalla

		BRIGHT_GREEN + BOLD + "██████╗ ██╗      █████╗  ██████╗██╗  ██╗     ██╗ █████╗  ██████╗██╗  ██╗\n"
		+ "██╔══██╗██║     ██╔══██╗██╔════╝██║ ██╔╝     ██║██╔══██╗██╔════╝██║ ██╔╝\n"
		+ "██████╔╝██║     ███████║██║     █████╔╝      ██║███████║██║     █████╔╝ \n"
		+ "██╔══██╗██║     ██╔══██║██║     ██╔═██╗ ██   ██║██╔══██║██║     ██╔═██╗ \n"
		+ "██████╔╝███████╗██║  ██║╚██████╗██║  ██╗╚█████╔╝██║  ██║╚██████╗██║  ██╗\n"
		+ "╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n" + RESET +

		BRIGHT_YELLOW + "\n══════════════════════════════════════════════════════════════════\n" + RESET +

		CYAN + "Jugador: " + WHITE + "\n" + CYAN + "Saldo actual: " + BRIGHT_GREEN + "$ \n" + CYAN
		+ "Partidas jugadas: " + WHITE + "\n" + CYAN + "Partidas ganadas: " + BRIGHT_GREEN + "\n" + CYAN
		+ "Mejor victoria: " + BRIGHT_GREEN + "$" + "\n" + CYAN + "Última victoria: " + BRIGHT_GREEN + "$"
		+ "\n" + RESET +

		BRIGHT_YELLOW + "\n══════════════════════════════════════════════════════════════════\n" + RESET +

		BRIGHT_GREEN + "[1] " + WHITE + "Nueva partida\n" + BRIGHT_GREEN + "[2] " + WHITE + "Continuar\n"
		+ BRIGHT_GREEN + "[3] " + WHITE + "Estadísticas detalladas\n" + BRIGHT_GREEN + "[4] " + WHITE
		+ "Configuración\n" + BRIGHT_RED + "[5] " + WHITE + "Salir\n" +

		BRIGHT_YELLOW + "\nSelecciona una opción → " + RESET);
    }

    void showNewGame() {
	System.out.println("\033[2J\033[H" +

	// Título
		BRIGHT_GREEN + BOLD + "╔════════════════════════════════════════════════════╗\n"
		+ "║                 NUEVA PARTIDA                     ║\n"
		+ "╚════════════════════════════════════════════════════╝\n" + RESET +

		"\n" + CYAN + "Jugador: " + WHITE + "\n" + CYAN + "Saldo disponible: " + BRIGHT_GREEN + "$ \n" + RESET +

		BRIGHT_YELLOW + "\n════════════ CONFIGURACIÓN DE MESA ════════════\n" + RESET +

		WHITE + "\nSelecciona número de bots en la mesa:\n\n" +

		BRIGHT_YELLOW + "\n════════════════════════════════════════════════\n" + RESET +

		BRIGHT_GREEN + "[ENTER] " + WHITE + "Confirmar partida\n" + BRIGHT_RED + "[ESC]   " + WHITE
		+ "Volver al menú principal\n" +

		BRIGHT_YELLOW + "\n\nUsa ↑ ↓ para cambiar la selección\n" + RESET);
    }

}
