/**
* Program Name:        PairOfDiceLN.java
* Program Purpose:     Class blueprint for PairOfDiceLN object
* Date Created:        10/14/2016
* Last Modified:       10/17/2016
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class PairOfDiceLN {

    private Die d1;
    private Die d2;

    private int d1Value;
    private int d2Value;
    private int total;

    /**
    * Method purpose: Constructor for PairOfDiceLN object
    *
    * @return void
    */
    public PairOfDiceLN() {
        d1 = new Die();
        d2 = new Die();
        
        roll();
    }

    /**
    * Method purpose: toString method for PairOfDiceLN object
    *
    * @return string describing object
    */
    public String toString() {
        return "Die 1 value: " + d1Value + "\nDie 2 value: " 
                + d2Value + "\nTotal: " + total;
    }

    /**
    * Method purpose: accessor method for d1Value
    *
    * @return face value of d1 die (int)
    */
    public int getD1Value() { return d1Value; }

    /**
    * Method purpose: accessor method for d2Value
    *
    * @return face value of d2 die (int)
    */
    public int getD2Value() { return d2Value; }

    /**
    * Method purpose: rolls both d1 and d2 dice
    *
    * @return total of d1 and d2 face values (int)
    */
    public int roll() {
        d1.roll();
        d2.roll();

        d1Value = d1.getFaceValue();
        d2Value = d2.getFaceValue();
        total = d1Value + d2Value;

        return total;
    }

}