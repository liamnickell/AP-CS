/**
* Program Name:        DeckOfCardsLN.java
* Program Purpose:     DeckOfCards object blueprint class.
* Date Created:        1/25/2017
* Last Modified:       2/1/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class DeckOfCardsLN {

    private CardLN[] deck;
    private int cardsDrawn;

    public int getCardsDrawn() { return cardsDrawn; }

    /**
    * Method Purpose: Constructor for class that sets all variables 
    * to default values in order, then shuffles 3 times (gotta make 
    * sure it's shuffled enough ;P). 
    */
    public DeckOfCardsLN() {
        cardsDrawn = 0;
        deck = new CardLN[52];

        for(int i=0; i<deck.length; i++) {
            SuitLN suit;
            if(i % 2 == 0 && i % 4 == 0) {
                suit = SuitLN.SPADES;
            } else if(i % 2 == 0) {
                suit = SuitLN.HEARTS;
            } else if((i+1) % 2 == 0 && (i+1) % 4 == 0) {
                suit = SuitLN.DIAMONDS;
            } else {
                suit = SuitLN.CLUBS;
            }

            deck[i] = new CardLN((i % 13) + 1, suit);
        }

        shuffle();
        shuffle();
        shuffle(); // third time's the charm :)
    }

    /**
    * Method Purpose: Shuffles [randomizes the order of] the deck array.
    */
    public void shuffle() {
        CardLN store;
        int randNum;
        cardsDrawn = 0;

        for(int i=0; i<deck.length; i++) {
            randNum = (int) (Math.random() * 52);
            store = deck[i];
            deck[i] = deck[randNum];
            deck[randNum] = store;
        }
    }

    /**
    * Method Purpose: Picks a card from deck array (next in line) and
    * returns it (as CardLN object).
    *
    * @return CardLN object that is picked from deck array.
    */
    public CardLN deal() {
        if(cardsDrawn <= 52) {
            CardLN card = deck[cardsDrawn];
            cardsDrawn++;

            return card;
        } else {
            System.out.print("Out of Cards... Returning random card...");
            return new CardLN();
        }
    }
}