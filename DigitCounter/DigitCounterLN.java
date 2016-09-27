/**
* Program Name:        DigitCounterLN.java
* Program Purpose:     Return the number of even, odd, and zero digits in an inputted integer.
* Date Created:        9/13/2016
* Last Modified:       9/14/2016
*
* @author     Liam Nickell
* @version    1.0.1
*/

import java.util.*;

public class DigitCounterLN {
    
    public static void main(String args[]) {
        int evens = 0;
        int odds = 0;
        int zeros = 0;
        int digit = 0;

        System.out.println("Please enter an integer. I'll return the number"
                            + " of odd, even, and zero digits in it.");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        //if statement handles possibily of user entering "0"
        if(input != 0) {
            while(Math.abs(input) > 0) {
                digit = input % 10;
                input /= 10;
                if(digit % 2 == 0 && digit != 0) {
                    evens++;
                } else if(digit == 0) {
                    zeros++;
                } else {
                    odds++;
                }
            }

            System.out.println("Evens: " + evens);
            System.out.println("Odds: " + odds);
            System.out.println("Zeros: " + zeros);
        } else {
            System.out.println("Your input was zero.");
        }
    }

}