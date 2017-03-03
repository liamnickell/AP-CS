/**
* Program Name:        LoopyFunLN.java
* Program Purpose:     Demonstrates for each loops and ArrayLists along 
*                      with normal for loops and normal arrays.
* Date Created:        2/7/2017
* Last Modified:       2/7/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

import java.util.ArrayList;

public class LoopyFunLN {

    public static void main(String[] args) {
        
        int[] evens = new int[10];
        int[] odds = new int[10];

        ArrayList<Integer> primes = new ArrayList<Integer>();
        ArrayList<Integer> squares = new ArrayList<Integer>();
        ArrayList<Integer> powersOfTwo = new ArrayList<Integer>();

        int countEven = 0, countOdd = 0;
        for(int i=1; i<=evens.length*2; i++) {
            if(i % 2 == 0) {
                evens[countEven] = i;
                countEven++;
            } else {
                odds[countOdd] = i;
                countOdd++;
            }
        }

        for(int i=1; i<=100; i++) {
            if(isPrime(i)) {
                primes.add(i);
            }

            if(Math.sqrt(i) % 1 == 0) {
                squares.add(i);
            }

            if(Math.log10(i) / Math.log10(2) % 1 == 0) {
                powersOfTwo.add(i);
            }
        }

        System.out.println("Evens:");
        for(int num : evens) {
            System.out.println(num);
        }

        System.out.println();

        System.out.println("Odds:");
        for(int num : odds) {
            System.out.println(num);
        }

        System.out.println();

        System.out.println("Primes:");
        for(int num : primes) {
            System.out.println(num);
        }

        System.out.println();

        System.out.println("Squares:");
        for(int num : squares) {
            System.out.println(num);   
        }

        System.out.println();

        System.out.println("Powers of Two:");
        for(int num : powersOfTwo) {
            System.out.println(num);
        }

        System.out.println();

        String[] memes = {"doge", "pepe", "sloth", "spagett", "dj khaled", "vape nation"};
        int[] values = {55, 23, 71, 6, 19, 34, 12, 47, 68};

        boolean found = false;
        for(int i=0; i<memes.length; i++) {
            if(memes[i].compareTo("spagett") == 0) {
                found = true;
                System.out.println("spagett found: " + i);
            }
        }

        if(!found) {
            System.out.println("spagett not found: " + -1);
        }

        found = false;
        for(int i=0; i<values.length; i++) {
            if(values[i] == 39) {
                found = true;
                System.out.println("39 found: " + i);
            }
        }

        if(!found) {
            System.out.println("39 not found: " + -1);
        }

        System.out.println();

        // reusing memes and values for sorting and binary search
        int key, position;
        for(int index=1; index<values.length; index++) {
            key = values[index];
            position = index;

            while(position > 0 && values[position-1] > key) {
                values[position] = values[position-1];
                position--;
            }

            values[position] = key;
        }

        String strKey;
        for(int index=1; index<memes.length; index++) {
            strKey = memes[index];
            position = index;

            while(position > 0 && memes[position-1].compareTo(strKey) > 0) {
                memes[position] = memes[position-1];
                position--;
            }

            memes[position] = strKey;
        }

        int low = 0, high = values.length-1, middle = (low + high) / 2;
        while(values[middle] != 47 && low <= high) {
            if(values[middle] < 47) {
                low = middle;
                middle = (low + high) / 2;
            } else {
                high = middle;
                middle = (low + high) / 2;
            }
        }

        if(values[middle] == 47) {
            System.out.println("47 found: " + middle);
        } else {
            System.out.println("47 not found: " + -1);
        }

        low = 0; 
        high = memes.length-1; 
        middle = (low + high) / 2;
        while(!memes[middle].equals("dat boi") && low <= high) {
            if(memes[middle].compareTo("dat boi") < 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }

            middle = (low + high) / 2;
        }

        if(memes[middle].equals("dat boi")) {
            System.out.println("dat boi found: " + middle);
        } else {
            System.out.println("dat boi not found: " + -1);
        }

        System.out.println();
        
    }

    /**
    * Method Purpose: Checks if number is prime or not.
    *
    * @param num  int to be checked if prime
    * @return true if num is prime, otherwise false
    */
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }

        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

}