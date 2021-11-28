package com.enbaev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contextFromXML = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext contextFromJava = new AnnotationConfigApplicationContext(Config.class);
        Deck deckFromXML = contextFromXML.getBean(Deck.class);
        Deck deckFromJava = contextFromJava.getBean(Deck.class);
        deckFromJava.mixCards();
        deckFromXML.mixCards();
        System.out.println(deckFromJava);
        System.out.println(deckFromXML);

    }
}
