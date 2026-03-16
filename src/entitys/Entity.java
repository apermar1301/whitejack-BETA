package entitys;

import java.util.ArrayList;
import java.util.List;

import carts.Card;
import carts.Rank;

public class Entity {
    public int coins;
    private final List<Card> hand = new ArrayList<>();

    public Entity() {
        this.coins = 100;
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public void clearHand() {
        hand.clear();
    }

    public List<Card> getHand() {
        return new ArrayList<>(hand);
    }

    public String handToString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hand.size(); i++) {
            sb.append(hand.get(i));
            if (i < hand.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public int getScore() {
        int total = 0;
        int aces = 0;
        for (Card card : hand) {
            total += card.getValue();
            if (card.getRank() == Rank.ACE) {
                aces++;
            }
        }

        while (total > 21 && aces > 0) {
            total -= 10; // Count Ace as 1 instead of 11
            aces--;
        }

        return total;
    }

    public boolean isBusted() {
        return getScore() > 21;
    }

    public boolean isBlackjack() {
        return hand.size() == 2 && getScore() == 21;
    }

    public void bet(int amount) {
        coins -= amount;
    }

    public void win(int amount) {
        coins += amount;
    }

    public void loose(int amount) {
        coins -= amount;
    }

    public void lose(int amount) {
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
