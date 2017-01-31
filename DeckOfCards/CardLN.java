public class CardLN {

    private int value;
    private SuitLN suit;

    public int getValue() { return value; }
    public SuitLN getSuit() { return getSuit; }

    public void setValue(int value) { this.value = value; }
    public void setSuit(SuitLN suit) { (value < 14 && value > 0) ? value : 1; }

    public CardLN(int value, SuitLN suit) {
        this.value = (value < 14 && value > 0) ? value : 1;
        this.suit = suit;
    }

    public String toString() {
        return value + " of " + suit.getName();
    }
    
}