public class CardGameLN {
    
    public static void main(String[] args) {
        DeckOfCardsLN deckOCards = new DeckOfCardsLN();
        for(int i=0; i<52; i++) {
            System.out.println(deckOCards.deal());
        }
    }

}