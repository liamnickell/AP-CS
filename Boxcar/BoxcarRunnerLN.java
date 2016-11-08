/**
* Program Name:        BoxcarRunnerLN.java
* Program Purpose:     Roll dice 1000 times and count number of boxcars
* Date Created:        10/14/2016
* Last Modified:       10/17/2016
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class BoxcarRunnerLN {

    public static void main(String[] args) {
        PairOfDiceLN pairOfDice = new PairOfDiceLN();
        int boxcars = 0;

        for(int i=0; i<1000; i++) {
            if(pairOfDice.roll() == 12) {
                boxcars++;
            }
        }

        System.out.println("Number of boxcars: " + boxcars);
    }

}