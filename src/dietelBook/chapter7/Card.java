/**
 * <p> Created by Onikoyi Damola Olutoba  06/04/19 </p>
 */

package dietelBook.chapter7;

//card class represents playing a card
public class Card {
    private String face; // face of card ("Ace", "Deuce", ...)
    private String suit; // suit of card ("Hearts", "Diamonds", ...)

    public Card(String cardFace, String cardSuit) {
        face = cardFace; //initialize face of card
        suit = cardSuit; //initialize suit of card\
    }

    //return String representation of Card
    public String toString() {
        return face + " of " + suit;
    }
}
