/**
* Program Name:        CookieSalesLN.java
* Program Purpose:     Track cookie sales for girl scouts.
* Date Created:        1/9/2017
* Last Modified:       1/11/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class CookieSalesLN {

    public static void main(String[] args) {
        String[] names = {"Anika", "Beatriz", "Cosima", "Delphine", "Esmerelda", "Fia", "Gemma", "Irina", "Jamila", "Katya"};
        int[] sales = new int[10];

        for(int i=0; i<10; i++) {
            sales[i] = (int) (Math.random()*11);
        }

        System.out.println("\nWeek 1");
        printCookies(names, sales);
        topThree(names, sales);

        System.out.println("Week 2");
        logCookies("Beatriz", 12, names, sales);
        logCookies("Delphine", 4, names, sales);
        logCookies("Fia", 8, names, sales);
        logCookies("Jamila", 15, names, sales);
        topThree(names, sales);

        System.out.println("Week 3");
        logCookies("Anika", 14, names, sales);
        logCookies("Cosima", 6, names, sales);
        logCookies("Esmerelda", 2, names, sales);
        logCookies("Katya", 11, names, sales);
        topThree(names, sales);

        System.out.println("Week 4");
        logCookies("Gemma", 18, names, sales);
        logCookies("Irina", 9, names, sales);
        logCookies("Beatriz", 7, names, sales);
        logCookies("Jamila", 13, names, sales);
        topThree(names, sales);
        printCookies(names, sales);

        int sum = 0;
        for(int i=0; i<10; i++) {
            sum += sales[i];
        }

        System.out.println("Total boxes sold: " + sum);

        if(sum >= 150*1.1) {
            System.out.println("Congratulations, you get a pizza party!");
        } else {
            System.out.println("Sorry, you don't get a pizza party.");
        }
    }

    /**
    * Method Purpose:   lists top three girl scouts (by cookie sales)
    *
    * @param    names  string array containing girl scout names
    * @param    sales  int array containing number of boxes for each girl scout (parallel array to names)
    */
    public static void topThree(String[] names, int[] sales) {
        int firstPlaceIndex = 0;
        int secondPlaceIndex = 0;
        int thirdPlaceIndex = 0;
        int store1 = 0;
        int store2 = 0;

        for(int i=1; i<10; i++) {
            if(sales[i] > sales[firstPlaceIndex]) {
                store1 = firstPlaceIndex;
                store2 = secondPlaceIndex;

                firstPlaceIndex = i;
                secondPlaceIndex = store1;
                thirdPlaceIndex = store2;
            } else if(firstPlaceIndex == secondPlaceIndex || sales[i] > sales[secondPlaceIndex]) {
                store1 = secondPlaceIndex;

                secondPlaceIndex = i;
                thirdPlaceIndex = store1;
            } else if(firstPlaceIndex == thirdPlaceIndex || sales[i] > sales[thirdPlaceIndex]) {
                thirdPlaceIndex = i;
            }
        }

        System.out.println("Top Three");
        System.out.println("\tFirst: " + names[firstPlaceIndex] + " -- " + sales[firstPlaceIndex] + " boxes");
        System.out.println("\tSecond: " + names[secondPlaceIndex] + " -- " + sales[secondPlaceIndex] + " boxes");
        System.out.println("\tThird: " + names[thirdPlaceIndex] + " -- " + sales[thirdPlaceIndex] + " boxes\n");
    }

    /**
    * Method Purpose:   add new sales to total sales for given girl scout
    *
    * @param    name  girl scout to add sales to
    * @param    additionalSales  number of new sales to add
    * @param    names  string array containing girl scout names
    * @param    sales  int array containing number of boxes for each girl scout (parallel array to names)
    *
    * @return   new total sales for given girl scout
    */
    public static int logCookies(String name, int additionalSales, String[] names, int[] sales) {
        for(int i=0; i<10; i++) {
            if(names[i].equals(name)) {
                sales[i] += additionalSales;
                return sales[i];
            }
        }

        System.out.println("Name Not Found.");
        return 0;
    }

    /**
    * Method Purpose:   print all girl scouts and their sales
    *
    * @param    names  string array containing girl scout names
    * @param    sales  int array containing number of boxes for each girl scout (parallel array to names)
    */
    public static void printCookies(String[] names, int[] sales) {
        for(int i=0; i<10; i++) {
            if(names[i].length() <= 7) {
                System.out.println(names[i] + "\t\t" + sales[i]);
            } else {
                System.out.println(names[i] + "\t" + sales[i]);
            }
        }

        System.out.println();
    }

}