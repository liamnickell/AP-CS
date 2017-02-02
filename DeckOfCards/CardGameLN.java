/**
* Program Name:        CardGameLN.java
* Program Purpose:     Runner class for card game.
* Date Created:        1/25/2017
* Last Modified:       2/1/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class CardGameLN {
    
    public static void main(String[] args) {
        
        DeckOfCardsLN deckOfCards = new DeckOfCardsLN();
        int count = 1;

        System.out.println();
        for(int i=0; i<52; i++) {
            System.out.print(deckOfCards.deal() + "\t");

            if(count == 4) {
                System.out.println();
                count = 0;
            }

            count++;
        }

        deckOfCards.shuffle();
        count = 1;

        System.out.println();
        for(int i=0; i<52; i++) {
            System.out.print(deckOfCards.deal() + "\t");

            if(count == 4) {
                System.out.println();
                count = 0;
            }

            count++;
        }

        deckOfCards.shuffle();

        String player1 = "Doge";
        String player2 = "Spagett";
        CardLN player1Card = deckOfCards.deal();
        CardLN player2Card = deckOfCards.deal();

        System.out.println();
        for(int i=0; i<4; i++) {
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

        CardLN[] player1Hand = new CardLN[5];
        CardLN[] player2Hand = new CardLN[5];

        for(int i=0; i<player1Hand.length; i++) {
            player1Hand[i] = deckOfCards.deal();
            player2Hand[i] = deckOfCards.deal();
        }

        System.out.print(player1 + "\'s hand: ");
        for(int i=0; i<player1Hand.length; i++) {
            if(i < player1Hand.length-1) {
                System.out.print(player1Hand[i] + ", ");
            } else {
                System.out.print("and " + player1Hand[i]);
            }
        }

        System.out.println();
        System.out.print(player2 + "\'s hand: ");
        for(int i=0; i<player2Hand.length; i++) {
            if(i < player2Hand.length-1) {
                System.out.print(player2Hand[i] + ", ");
            } else {
                System.out.print("and " + player2Hand[i]);
            }
        }

        // used to prevent another pair of greater value not being used in comparison
        int player1PairValue = 0;
        int player2PairValue = 0;

        // changes as higher cards are encountered
        CardLN player1HighestCard = player1Hand[0];
        CardLN player2HighestCard = player2Hand[0];

        System.out.println();
        for(int current=0; current<player1Hand.length; current++) {
            for(int i=0; i<player1Hand.length; i++) {
                // doesn't equal zero checks for if it is the same card being compared
                if(player1Hand[current].compareTo(player1Hand[i]) != 0 && player1Hand[current].getValue() == player1Hand[i].getValue()) {
                    player1PairValue = player1Hand[current].getValue();
                }
            }

            if(player1Hand[current].compareTo(player1HighestCard) < 0) {
                player1HighestCard = player1Hand[current];
            }
        }

        for(int current=0; current<player2Hand.length; current++) {
            for(int i=0; i<player2Hand.length; i++) {
                // doesn't equal zero checks for if it is the same card being compared
                if(player2Hand[current].compareTo(player2Hand[i]) != 0 && player2Hand[current].getValue() == player2Hand[i].getValue()) {
                    player2PairValue = player2Hand[current].getValue();
                }
            }

            if(player2Hand[current].compareTo(player2HighestCard) < 0) {
                player2HighestCard = player2Hand[current];
            }
        }

        if(player1PairValue > player2PairValue) {
            System.out.println(player1 + " wins with a pair of " + player1PairValue + "'s!");
        } else if(player1PairValue < player2PairValue) {
            System.out.println(player2 + " wins with a pair of " + player2PairValue + "'s!");
        } else if(player1HighestCard.compareTo(player2HighestCard) < 0) {
            System.out.println(player1 + " wins with a " + player1HighestCard + "!");
        } else {
            System.out.println(player2 + " wins with a " + player2HighestCard + "!");
        }

        int cardsDrawn = deckOfCards.getCardsDrawn();
        count = 1;

        System.out.println();
        System.out.println("Remaining cards:");
        for(int i=cardsDrawn; i<52; i++) {
            System.out.print(deckOfCards.deal() + "\t");
            
            if(count == 4) {
                System.out.println();
                count = 0;
            }
            
            count++;
        }

    }

}