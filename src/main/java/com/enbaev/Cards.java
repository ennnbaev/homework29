package com.enbaev;

public class Cards {
  private final String value;
  private final Suit suit;

    public Cards(String value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "value='" + value + '\'' +
                ", suit=" + suit +
                '}';
    }
}
