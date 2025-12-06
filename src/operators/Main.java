package operators;

public class Main {
	static void main() {
		System.out.println("operators in Java");
		/*
		 * Operators:  An Operator is a symbol that tells the computer to perform a specific operation on one or multiple operands
		 */
		/*
		 * Type Of Operators:
		 * 1. Assignment Operator
		 * 2. Arithmetic Operator
		 * 3. Relational Operator
		 * 4. Logical Operator
		 * 5. Bitwise Operator
		 */

		// 1. Assignment Operator
		// Equals Operator (=)
		int a = 10;
		// Plus-Equals Operator (+=)
		a = a + 10 ; // shorthand a+=10
		// Minus-Equals Operator (-=)
		a-=5;
		// Multiply-Equals Operator (*=)
		a*=10;
		// Divide-Equals Operator (/=)
		a/=5;

		// 2. Arithmetic Operator
		int num1 = 10;
		int num2 = 8;
		// Addition (+)
		System.out.println(num1 + num2);
		// Subtraction (-)
		System.out.println(num1 - num2);
		// Subtraction (*)
		System.out.println(num1 * num2);
		// Subtraction (/)
		System.out.println(num1 / num2);
		// Modulo (%)
		System.out.println(num1 % num2);

//		3. Relational Operator
		int num_1 = 10;
		int num_2 = 6;
		// Greater Than (>)
		System.out.println(num_1>num_2);
		// Greater Than Or Equals (>=)
		System.out.println(num_1>=num_2);
		// Less Than  (<)
		System.out.println(num_1<num_2);
		// Less Than Or Equals (<=)
		System.out.println(num_1<=num_2);
		// Equals (==)
		System.out.println(num_1==num_2);
		// Not Equals (!=)
		System.out.println(num_1!=num_2);

		// 4. Logical Operator
		// (&&) --> If Both Condition Becomes true
		System.out.println(num_1 < num_2 && num_1!=num_2);
		// (||) --> If Single Condition Becomes true
		System.out.println(num_1 > num_2 || num_1!=num_2);
		// (!) --> Turn into Opposite
		System.out.println(!true);

		// 5. Bitwise
		// (&) -> Bitwise And
		System.out.println(num_1&num_2);
		// (|) -> Bitwise Or
		System.out.println(num_1|num_2);
		// (~) -> Bitwise Not
		System.out.println(~num_1);





		}
}
