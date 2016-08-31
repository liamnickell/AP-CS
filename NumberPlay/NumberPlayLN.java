/**
* Program Name:				NumberPlayLN.java
* Program Purpose: 		Print out answers to short answer #2.6 in JSS Textbook.
* Date Created: 			8/31/2016
* Date Last Updated:	8/31/2016
*
* @author			Liam Nickell
* @version		1.0.0
*/

public class NumberPlayLN {
	
	public static void main(String args[]){
		int iResult, num1 = 25, num2 = 40, num3 = 17, num4 = 5;
		double fResult, val1 = 17.0, val2 = 12.78;

		System.out.println(iResult = num1 / num4); // a
		System.out.println(fResult = num1 / num4); // b
		System.out.println(iResult = num3 / num4); // c
		System.out.println(fResult = num3 / num4); // d
		System.out.println(fResult = val1 / num4); // e
		System.out.println(fResult = val1 / val2); // f
		System.out.println(iResult = num1 / num2); // g
		System.out.println(fResult = (double) num1 / num2); // h
		System.out.println(fResult = num1 / (double) num2); // i
		System.out.println(fResult = (double) (num1 / num2)); // j
		System.out.println(iResult = (int) (val1 / num4)); // k
		System.out.println(fResult = (int) (val1 / num4)); // l
		System.out.println(fResult = (int) ((double) num1 / num2)); // m
		System.out.println(iResult = num3 % num4); // n
		System.out.println(iResult = num2 % num3); // o
		System.out.println(iResult = num3 % num2); // p
		System.out.println(iResult = num2 % num4); // q
	}

}