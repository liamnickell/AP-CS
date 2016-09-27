/**
* Program Name:         MathScanLN.java
* Program Purpose:      Practice using Scanner and Math classes
* Date Created:         9/6/2016
* Last Modified:        9/9/2016
* 
* @author     Liam Nickell
* @version    1.2.2
*/

import java.util.*;

public class MathScanLN {

    public static void scanForNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number and I'll give you its absolute value, square" 
                            + " root, and the result of it to the power of 3 (all"
                            + " decimal numbers are rounded to the ten-thousandths place).");

        if(scan.hasNextInt()) {
            int num = scan.nextInt();
            System.out.printf("Absolute Value: %d\n", Math.abs(num));
            System.out.printf("Square Root: + or - %.3f\n", Math.sqrt(num));
            System.out.printf("Principle Square Root: %.3f\n", Math.sqrt(num));
            System.out.printf("Number to the power of 3: %d\n", (int) Math.pow((double) num, (double) 3));
        } else if(scan.hasNextDouble()) {
            double num = scan.nextDouble();
            System.out.printf("Absolute Value: %.3f\n", Math.abs(num));
            System.out.printf("Square Root: + or - %.3f\n", Math.sqrt(num));
            System.out.printf("Principle Square Root: %.3f\n", Math.sqrt(num));
            System.out.printf("Number to the power of 3: %.3f\n", Math.pow(num, 3));
        } else {
            System.out.println("You were supposed to type a number, stupid.");
            scanForNum();
        }
    }

    public static void randomRange() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer and I will return a random number between "
                            + "1 and your number.");

        if(scan.hasNextInt()) {
            int num = scan.nextInt();
            int randomNum = (int) (Math.random() * num) + 1;
            System.out.printf("Random Number: %d\n", randomNum);
        } else {
            System.out.println("You were supposed to type an integer, stupid.");
            randomRange();
        }
    }

    public static void main(String args[]) {
        scanForNum();
        randomRange();
    }

}