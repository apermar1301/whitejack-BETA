package tools;

import java.util.Scanner;

public class Console {

    private final Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. New Game");
        System.out.println("2. Quit");
        return getInt("Selecciona una opción:");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int getInt(String message) {
        while (true) {
            showMessage(message);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                showMessage("Entrada no válida. Intenta de nuevo.");
            }
        }
    }

    public String getString(String message) {
        showMessage(message);
        return sc.nextLine();
    }

    public void clear() {
        try {
            Thread.sleep(2000); // 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
