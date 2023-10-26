package hr.algebra.lovropavlov.rummylovropavlov.Model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    ArrayList<Card> cardList = new ArrayList<Card>();

    public Deck(){initializeDeck();}

    public Card getLastCard(){
        Card card = new Card();
        card.value = cardList.getLast().value;
        card.suit = cardList.getLast().suit;
        return card;
    }
    public Card getFirstCard(){
        Card card = new Card();
        card.value = cardList.getFirst().value;
        card.suit = cardList.getFirst().suit;
        return card;
    }

    public Card getRandomCard(){
        Card card = new Card();
        int randomNum = (int)(Math.random() * ((cardList.size() - 1) + 1));
        card = cardList.get(randomNum);
        cardList.remove(randomNum);
        return card;
    }

    public int getSize(){
        return cardList.size();
    }
    void initializeDeck(){

        //13 clubs
        for (int i=1; i<13; i++){
            Card card = new Card();
            card.value = i;
            card.suit = Suit.Clubs;
            cardList.add(card);
        }
        //13 spades
        for (int i=1; i<13; i++){
            Card card = new Card();
            card.value = i;
            card.suit = Suit.Spades;
            cardList.add(card);
        }
        //13 diamonds
        for (int i=1; i<13; i++){
            Card card = new Card();
            card.value = i;
            card.suit = Suit.Diamonds;
            cardList.add(card);
        }
        //13 hearts
        for (int i=1; i<13; i++){
            Card card = new Card();
            card.value = i;
            card.suit = Suit.Hearts;
            cardList.add(card);
        }
    }
}
