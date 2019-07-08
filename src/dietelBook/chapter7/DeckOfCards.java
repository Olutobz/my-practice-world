/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */

package dietelBook.chapter7;

import java.util.Random;

//DeckOfCards class represents a deck of playing cards
public class DeckOfCards {
    private Card[] deck; //array of card objects
    private int currentCard; //index of next card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; //constants # of cards
    //random number generator
    private static final Random randomNumbers = new Random();

    //constructor fills deck of cards
    private DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; //create array of card objects
        currentCard = 0; //set currentCard so first card dealt is deck[0]

        //populate deck with card objects
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }

    //shuffles deck of cards with one-pass algorithm
    private void shuffle() {
        //after shuffling dealing should start at deck[0] again
        currentCard = 0; //reinitialize currentCard

        //for each card, pick another random card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
            //select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //swap current card with randomly selected card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //deal one card
    private Card dealCard() {
        //determine whether cards remain to be dealt
        if (currentCard < deck.length) {
            return deck[currentCard++]; //return current card in array
        } else return null; //return null to indicate that all cards were dealt
    }

    //method main begins program execution
    public static void main(String[] args) {
        DeckOfCards test = new DeckOfCards();
        test.shuffle(); //place cards in random number

        //print all 52 cards in the order in which they are dealt
        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", test.dealCard());

            //output a new line after every fourth card
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
