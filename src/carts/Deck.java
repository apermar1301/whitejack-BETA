package carts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public final List<Card> cards = new ArrayList<>();

	public Deck() {
		fill();
		shuffle();
	}

	private void fill() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card card = new Card(suit, rank);
				cards.add(card);
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card dealCard() {
		if (cards.isEmpty()) {
			fill();
			shuffle();
		}

		return cards.remove(0);
	}

	public int size() {
		return cards.size();
	}
}
