package loops;

public class Main {
	static void main() {
		System.out.println("Loops");
		/*
		 * Loop: Loop is a Programming Construct that allows to repeat a block code multiple times
		*/

		/*
		 * 1. For Loop
		 * 2. While Loop
		 * 3. Do-While Loop
		 */
//	1. For Loop
		/*
		Syntax of For Loop
			for(initialization,condition,updatation){
			// Code to be executed
			}
		 */
		System.out.println("Print Using For Loop");
		for (int i=0;i<10;i++){
			System.out.print(i+" ");
		}
		System.out.println();
//	2. While Loop
		/*Syntax Of While Loop
		initialization
		while(condition){
			// Code to be executed
		}
		*/
		System.out.println("Using While Loop");
		int i = 10;
		while(i<=15){
			System.out.print(i+" ");
			i++; //🚨 If You Don't Increment Loop will be Infinite
		}
		System.out.println();
		//	3. Do-While Loop --> 🚨 Do-While Run At-least one time if the condition become false
		/*Syntax Of While Loop
		initialization
		do{
			// Code to be executed
			updation
		}
		while(condition);
		*/
		System.out.println("Do While Loop");
		do{
			System.out.print(i+" ");
			i++;
		}while(i<1);
	}
}
