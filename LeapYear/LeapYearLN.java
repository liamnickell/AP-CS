/**
* Program Name:       LeapYearLN.java
* Program Purpose:    To take a year as input and return whether or not it is a leap year.
* Date Created:       9/12/2016
* Last Modified:      9/12/2016
*
* @author     Liam Nickell
* @version    1.0.1
*/

import java.util.*;

public class LeapYearLN {

    public static void isLeapYear() {
        String leapYear = "It is a leap year.";
        String notLeapYear = "It is not a leap year.";
        String noLeapYears = "Leap years don't exist yet.";

        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()) {
            int inputYear = scan.nextInt();
            if(inputYear < 1582) {
                System.out.println(noLeapYears);
            } else if(inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0)) {
                System.out.println(leapYear);
            } else {
                System.out.println(notLeapYear);
            }
        } else {
            System.out.println("Please input a valid year.");
            isLeapYear();
        }
    }

    public static void main(String args[]) {
        System.out.println("Input a year and I'll tell you if it's a leap year or not.");
        isLeapYear();
    }

}