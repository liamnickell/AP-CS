public class CardGameLN {
    
    public static void main(String[] args) {
        
        DeckOfCardsLN deckOfCards = new DeckOfCardsLN();
        
        System.out.println();
        for(int i=0; i<52; i++) {
            System.out.print(deckOfCards.deal() + "\t");

            if((i+1) % 4 == 0) {
                System.out.println();
            }
        }

        deckOfCards.shuffle();

        System.out.println();
        for(int i=0; i<52; i++) {
            System.out.print(deckOfCards.deal() + "\t");

            if((i+1) % 4 == 0) {
                System.out.println();
            }
        }

        deckOfCards.shuffle();

        String player1 = "Doge";
        String player2 = "Spagett";
        CardLN player1Card = deckOfCards.deal();
        CardLN player2Card = deckOfCards.deal();

        System.out.println();
        for(int i=0; i<3; i++) {
            System.out.println(player1 + " draws a " + player1Card + "!");
            System.out.println(player2 + " draws a " + player2Card + "!");

            if(player1Card.compareTo(player2Card) < 0) {
                System.out.println(player1 + " wins!\n");
            } else {
                // not possible to tie with 52 card deck
                System.out.println(player2 + " wins!\n");
            }

            player1Card = deckOfCards.deal();
            player2Card = deckOfCards.deal();
        }

        

    }

}