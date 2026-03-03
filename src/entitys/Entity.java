package entitys;

public class Entity {
    public int coins;

    public void bet(int amount) {

	coins -= amount;

    }

    public void win(int amount) {

	coins += amount;

    }

    public void loose(int amount) {

	coins -= amount;

    }

    public void hit() {

    }

    public void stand() {

    }

    public void doubleDown() {

    }

    public void split() {

    }

}
