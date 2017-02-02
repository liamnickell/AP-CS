/**
* Program Name:        CardLN.java
* Program Purpose:     Card object blueprint class for card game.
* Date Created:        1/25/2017
* Last Modified:       2/1/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class CardLN implements Comparable {

    private int value;
    private SuitLN suit;

    public int getValue() { return value; }
    public SuitLN getSuit() { return suit; }

    public void setValue(int value) { this.value = (value < 14 && value > 0) ? value : 1;; }
    public void setSuit(SuitLN suit) { this.suit = suit; }

    /**
    * Method Purpose: Constructor for class that sets all variables 
    * to default (random) values.
    */
    public CardLN() {
        this.value = (int) (Math.random() * 13) + 1;
        
        int randomSuit = (int) (Math.random() * 4) + 1;
        if(randomSuit == SuitLN.SPADES.getRanking()) {
            this.suit = SuitLN.SPADES;
        } else if(randomSuit == SuitLN.HEARTS.getRanking()) {
            this.suit = SuitLN.HEARTS;
        } else if(randomSuit == SuitLN.DIAMONDS.getRanking()) {
            this.suit = SuitLN.DIAMONDS;
        } else {
            this.suit = SuitLN.CLUBS;
        }
    }

    /**
    * Method Purpose: Constructor for class that sets all variables 
    * to passed values.
    *
    * @param value  int that sets value of card
    * @param suit  enum SuitLN that sets suit of card
    */
    public CardLN(int value, SuitLN suit) {
        this.value = (value < 14 && value > 0) ? value : 1;
        this.suit = suit;
    }

    /**
    * Method Purpose: Returns value and suit of card when object's toString
    * method is invoked.
    */
    public String toString() {
        return value + " of " + suit.getName();
    }

    /**
    * Method Purpose: Compares one CardLN object to another CardLN object. If both 
    * value and suit are the same, a zero is returned. If values are the same then 
    * the difference of their suit ranking is returned (a negative value indicates 
    * that the CardLN object on which compareTo is being invoked comes first/has a 
    * higher ranking, while a positive value indicates the opposite). If the values
    * are different, then their values are compared (value has priority over suit 
    * when comparing). A negative returned value means that the CardLN object on 
    * which compareTo is being invoked comes first/has a higher ranking, while a 
    * positive value indicates the opposite.
    */
    public int compareTo(Object obj) {
        CardLN card = (CardLN) obj;

        if(this.value == card.getValue() && this.suit == card.getSuit()) {
            // not possible in 52 card deck, but still good to check 
            // (in case someone decides to make a deck with more than 52 cards)
            return 0;
        } else if(this.value == card.getValue()) {
            return this.suit.getRanking() - card.getSuit().getRanking();
        } else {
            // switched due to greater values meaning greater ranking (unlike suit)
            // makes it so if this.value is greater, a negative is returned (comes before)
            return card.getValue() - this.value;
        }
    }
    
}