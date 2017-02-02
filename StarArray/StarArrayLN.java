/**
* Program Name:        StarArrayLN.java
* Program Purpose:     Makes an int array of size 25 that stores the
*                      occurances of numbers 1-25 from loop that
*                      generates a random number from 1-25 100 times.
*                      This is the exact same program as RandomArrayLN,
*                      except that this program prints stars to show 
*                      the number of occurances in each range of numbers
*                      from 1-25 (instead of each number's occurance as 
*                      a decimal value).
* Date Created:        1/26/2017
* Last Modified:       2/2/2017
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class StarArrayLN {

    public static void main(String[] args) {
        
        int[] occurances = new int[25];
        int num = 0;

        for(int i=0; i<100; i++) {
            num = (int)(Math.random()*25) + 1;
            occurances[num-1]++;
        }

        int[] ranges = new int[5];

        for(int i=0; i<occurances.length; i++) {
            if(i < 5) {
                ranges[0] += occurances[i];
            } else if(i < 10) {
                ranges[1] += occurances[i];
            } else if(i < 15) {
                ranges[2] += occurances[i];
            } else if(i < 20) {
                ranges[3] += occurances[i];
            } else {
                ranges[4] += occurances[i];
            }
        }

        System.out.print("1-5: \t");
        for(int i=0; i<ranges[0]; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("6-10: \t");
        for(int i=0; i<ranges[1]; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("11-15: \t");
        for(int i=0; i<ranges[2]; i++) {
            System.out.print("*");
        }        

        System.out.println();
        System.out.print("16-20: \t");
        for(int i=0; i<ranges[3]; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("21-25: \t");
        for(int i=0; i<ranges[4]; i++) {
            System.out.print("*");
        }

        System.out.println();

    }

}