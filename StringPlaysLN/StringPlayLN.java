/*
* Program Name: StringPlayLN.java
* Program Purpose: Practice using a variety of string methods/properties.
*
* @author		Liam Nickell
* @date			8/26/2016
* @version		1.0.0
*/

public class StringPlayLN {

	public static void main(String args[]){
		String str1 = "banana";
		String str2 = "Banana";
		String str3 = "Anna";

		System.out.println("Printing string stuff...");
		System.out.println(str1.charAt(5));
		System.out.println(str3.charAt(str3.length() - 1));
		System.out.println(str1.concat(str2));
		System.out.println(str1);
		System.out.println(str3 = str3.concat(str2));
		System.out.println(str3);
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.toUpperCase());
	}

}