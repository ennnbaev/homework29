package com.enbaev;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    List<Cards> objectsCards;

    public Deck(List<Cards> cards) {
        objectsCards = new LinkedList<>(cards);
    }

    @Override
    public String toString() {
        return "Deck" + objectsCards;
    }

    public void mixCards() {
        Collections.shuffle(objectsCards);
    }
}

