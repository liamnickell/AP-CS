/**
* Program Name:       StarsLN.java
* Program Purpose:    To print star (astrisk) patterns.
* Date Created:       9/15/2016
* Last Modified:      9/15/2016
* 
* @author     Liam Nickell
* @version    1.0.0
*/

public class StarsLN {

    /**
    * Name:       printStars
    * Purpose:    print a certain number of stars on one line
    * @param num  number of stars to print
    * @return void
    */
    public static void printStars(int num) {
        for(int i=0; i<num; i++) {
            System.out.print("*");
        }
    }

    /**
    * Name:       printSpaces
    * Purpose:    print a certain number of spaces on one line
    * @param num  number of spaces to print
    * @return void
    */
    public static void printSpaces(int num) {
        for(int i=0; i<num; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String args[]) {
        System.out.println("\na:\n");
        for(int i=0; i<10; i++) {
            printStars(10 - i);
            printSpaces(i);
            System.out.print("\n");
        }

        System.out.println("\n\nb:\n");
        for(int i=1; i<=10; i++) {
            printSpaces(10 - i);
            printStars(i);
            System.out.print("\n");
        }

        System.out.println("\n\nc:\n");
        for(int i=0; i<10; i++) {
            printSpaces(i);
            printStars(10-i);
            System.out.print("\n");
        }

        System.out.println("\n\nd:\n");
        int spaces = 4;
        for(int i=1; i<10; i+=2) {
            printSpaces(spaces);
            printStars(i);
            printSpaces(spaces - 1);
            spaces--;
            System.out.print("\n");
        }

        //print other half of the diamond (design "d")
        spaces = 0;
        for(int i=9; i>0; i-=2) {
            printSpaces(spaces);
            printStars(i);
            printSpaces(spaces - 1);
            spaces++;
            System.out.print("\n");
        }
    }

}