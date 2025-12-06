package conditionals;

import java.util.Scanner;

public class Main {
	static void main() {
		System.out.println("Conditionals");
		/*
		A conditional is a statement that executes a block of code only if a specified condition is true
		 */
		/*
		Taking Input in Java

		Scanner: Scanner is a class in Java to take input from the user

		import java.utils.Scanner --> We must add it to use Scanner Class
		sc = variable name
		System.in --> Input Stream (Keyboard Input)
		 */

		/*
		 * Multiple Reading Input
		 * 1. nextInt() --> reads whole line as integer
		 * 2. nextDouble() --> reads whole line as a double
		 * 3. next() --> Read a single word (Space ends then input)
		 * 4. nextBoolean() --> Reads a boolean value
		 */
		System.out.println("Enter Your Age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Your Age is "+age);

		/*
		 * 1. If Statement
		 * 2. If-else Statement
		 * 3. If-elseif-else Statement
		 */
//	1. If Statement
		if(age>=18) {
			System.out.println("You are Eligible For 🚕 Driving");
		}
//	2. If-else Statement
		if(age>=18){
			System.out.println("You are Eligible For 🚕 Driving");
		}else{
			System.out.println("You are Not Eligible For 🚕 Driving");
		}
//	3. If-elseif-else State
		if (age>0 && age<=10){
			System.out.println("You are a 👶");
		} else if (age>=11 && age<=18) {
			System.out.println("You are a teen 👦🏻");
		}else if(age>=18 && age<=60){
			System.out.println("You are an adult 👨🏻‍🦱");
		}else if (age>=60 && age<=100){
			System.out.println("You are Senior citizen👴🏻");
		}else{
			System.out.println("Your are is out of this program");
		}

		// Ternary Operator:
		/*
		 initialization  -->  condition ? "Condition if True" : "If Condition false"
		 */
		int num = 85;
		boolean result = (num >=0) ? true : false;
		System.out.println(result);
	}
}
