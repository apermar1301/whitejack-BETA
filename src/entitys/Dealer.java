package entitys;

import java.util.List;

import carts.Deck;
import carts.Card;

public class Dealer extends Entity {

    public void dealInitialCards(Player player, List<Bot> bots, Deck deck) {
        player.receiveCard(deck.dealCard());
        player.receiveCard(deck.dealCard());

        for (Bot bot : bots) {
            bot.receiveCard(deck.dealCard());
            bot.receiveCard(deck.dealCard());
        }

        receiveCard(deck.dealCard());
        receiveCard(deck.dealCard());
    }

    public Card getUpCard() {
        if (getHand().isEmpty()) {
            return null;
        }
        return getHand().get(0);
    }

    public void play(Deck deck) {
        while (getScore() < 17) {
            receiveCard(deck.dealCard());
        }
    }
}
