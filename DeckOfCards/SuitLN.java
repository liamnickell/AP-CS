public enum SuitLN {
    
    SPADES ("Spades", 1),
    HEARTS ("Hearts", 2), 
    DIAMONDS ("Diamonds", 3), 
    CLUBS ("Clubs", 4);

    private final String name;
    private final int ranking;

    SuitLN(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() { return name; }
    public int getRanking() { return ranking; }

}