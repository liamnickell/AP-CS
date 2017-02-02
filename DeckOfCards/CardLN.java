public class CardLN implements Comparable {

    private int value;
    private SuitLN suit;

    public int getValue() { return value; }
    public SuitLN getSuit() { return suit; }

    public void setValue(int value) { this.value = (value < 14 && value > 0) ? value : 1;; }
    public void setSuit(SuitLN suit) { this.suit = suit; }

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

    public CardLN(int value, SuitLN suit) {
        this.value = (value < 14 && value > 0) ? value : 1;
        this.suit = suit;
    }

    public String toString() {
        return value + " of " + suit.getName();
    }

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
            return card.getValue() - this.value;
        }
    }
    
}