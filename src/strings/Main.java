package strings;

import java.util.Arrays;
import java.util.Locale;

public class Main {
	static void main() {
		System.out.println("Strings");
		/*
			String: String is a sequence of Characters.In Java Strings are Object.
			❌ Strings are immutable in Java, meaning once you create a string,you can't change it. Any Modification creates a new string.
		 */

		// Create String Using String Literal
		String str1 = "Hello World";

		// Create String Using new Keyword
		String str2 = new String("Hello World In Java");

		// String Methods
		// length()
		System.out.println("Length of Hello World is "+str1.length());
		// charAt()
		System.out.println(str1.charAt(1)); // return character at index
		// substring(start,end) // if you give
		System.out.println("Substring Method: "+str1.substring(2,9));
		// equals : Compare with another string and return true or false
		System.out.println(str1.equals(str2));
		// indexOf() --> Give me the first occurrence of specific character
		System.out.println(str1.indexOf('l'));
		// lastIndexOf() --> Give me the last occurrence of specific character
		System.out.println(str1.lastIndexOf('l'));
		// toUpperCase() --> convert it into fully upper-case
		System.out.println(str1.toUpperCase());
		// toLowerCase() --> convert it into fully lower-case
		System.out.println(str1.toLowerCase());
		// trim() --> remove all the trailing spaces
		String whiteSpacesWithString = "     Hello World      ";
		System.out.println(whiteSpacesWithString);
		System.out.println(whiteSpacesWithString.trim());
		// split() --> splits string into array
		String SplitArray = Arrays.toString("a,b,c".split(","));
		System.out.println(SplitArray);


		// iterating Over a String
		String sayHello = "Hello,Java";
		for (int i = 0; i < sayHello.length(); i++) {
			System.out.println(sayHello.charAt(i));
		}

		System.out.println("Print Using For-Each Loop");
		// Using For-Each Loop
		for (char ch: sayHello.toCharArray()){
			System.out.println(ch);
		}
	}
}
