public class DeckOfCardsLN {

    private CardLN[] deck;
    private int cardsDrawn;

    public int getCardsDrawn() { return cardsDrawn; }

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
        shuffle(); // third time's the charm
    }

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