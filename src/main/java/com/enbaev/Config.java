package com.enbaev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    public Cards createCard1() {
        return new Cards("valet", Suit.DIAMONDS);
    }

    @Bean
    public Cards createCard2() {
        return new Cards("king", Suit.CLUBS);
    }

    @Bean
    public Cards createCard3() {
        return new Cards("queen", Suit.CLUBS);
    }

    @Bean
    public Cards createCard4() {
        return new Cards("10", Suit.SPADES);
    }

    @Bean
    public Deck createdDeck(List<Cards> cards) {
        return new Deck(cards);
    }
}
