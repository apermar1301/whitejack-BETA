package carts;

public enum Suit {
    HEARTS("♥"), DIAMONDS("♦"), CLUBS("♣"), SPADES("♠");

    private final String symbol;
    private Color Color;

    Suit(String symbol) {
	this.symbol = symbol;
	this.Color = getColor();
    }

    public String getSymbol() {
	return symbol;
    }

    public Color getColor() {
	return switch (this) {
	case HEARTS, DIAMONDS -> Color.RED;
	case CLUBS, SPADES -> Color.BLACK;
	};
    }

}
