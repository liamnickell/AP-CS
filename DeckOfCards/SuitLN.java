/**
* Program Name:        SuitLN.java
* Program Purpose:     Enum for suits of cards in card game.
* Date Created:        1/25/2017
* Last Modified:       2/1/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public enum SuitLN {
    
    SPADES ("Spades", 1),
    HEARTS ("Hearts", 2), 
    DIAMONDS ("Diamonds", 3), 
    CLUBS ("Clubs", 4);

    private final String name;
    private final int ranking;

    /**
    * Method Purpose: Constructor for SuitLN enum that allows for the
    * setting of the name (String) and ranking (int) constants of each
    * enum element.
    *
    * @param name  name of suit as string
    * @param ranking  ranking of suit as int (from 1-4)
    */
    SuitLN(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() { return name; }
    public int getRanking() { return ranking; }

}