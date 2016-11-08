/**
* File Name:        ParameterPlayLN.java
* File Purpose:     class for testing methods (method library)
* Date Created:     10/11/2016
* Last Updated:     10/12/2016
*
* @author   Liam Nickell
* @version  1.0.1
*/

public class ParameterPlayLN {

    /**
    * Method Purpose:   finds sum of numbers from n to 100 (inclusive)
    *
    * @param    n  number (int) to sum from to 100
    * @return   sum of numbers from n to 100 (0 if n > 100)
    */
    public static int sum(int n) {
        int sum = 0;
        for(int i = n; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    /**
    * Method Purpose:   finds the bigger of two numbers (integers)
    *
    * @param    a  first of the inputted numbers (int)
    * @param    b  second of the inputted numbers (int)
    * @return   the bigger of the two numbers
    */
    public static int maxOfTwo(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
    * Method Purpose:   confirms if the first number is larger than the second
    *
    * @param    larger   first of the inputted numbers (double)
    * @param    smaller  second of the inputted numbers (double)
    * @return   true if first number is larger than the second, false if otherwise
    */
    public static boolean larger(double larger, double smaller) {
        if(larger > smaller) {
            return true;
        } else {
            return false;
        }
    }

    /**
    * Method Purpose:   checks if one of two numbers is divisible by the other
    *
    * @param    a  first of the inputted numbers (int)
    * @param    b  second of the inputted numbers (int)
    * @return   true if a is divisble by b or vice versa, false if otherwise
    */
    public static boolean evenlyDivisible(int a, int b) {
        if(a != 0 && b != 0) {
            if(a % b == 0 || b % a == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
    * Method Purpose:   concatenates a given string n times
    *
    * @param    str  string to concatenate
    * @param    n    times to concatenate given string (int)
    * @return   a string with str concatenated n times
    */
    public static String multiConcat(String str, int n) {
        String concat = str;
        for(int i = n; i > 1; i--) {
            concat += str;
        }

        return concat;
    }

    /**
    * Method Purpose:   checks if given char is a letter (lower or uppercase)
    *
    * @param    c  given char to be checked
    * @return   true if char c is a lower or uppercase letter, false if otherwise
    */
    public static boolean isAlpha(char c) {
        if((c > 64 && c < 91) || (c > 96 && c < 123)) {
            return true;
        } else {
            return false;
        }
    }

}