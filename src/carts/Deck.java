package carts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
	for (Suit suit : Suit.values()) {
	    for (Rank rank : Rank.values()) {
		cards.add(new Card(suit, rank));
	    }
	}
    }

    public void shuffle() {
	Collections.shuffle(cards);
    }

    public Card dealCard() {
	if (cards.isEmpty()) {
	    throw new IllegalStateException("No quedan cartas en el mazo");
	}
	return cards.remove(0);
    }

    public int size() {
	return cards.size();
    }
}
