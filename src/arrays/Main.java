package arrays;

public class Main {
	static void main() {
		System.out.println("Arrays");
		/*
		 Array: Array is a Linear Data-Structure. Array is stored to similar types of data in contiguous way
		 */
		// Initialization Of Array
		int[] initializeArray = new int[0];
		System.out.println("initialized array "+initializeArray);
		// Declare an Array
		/*
		  int[] nameOfArray = new int[sizeOfArray]
		*/
		int[] declareArray = new int[5];
		System.out.println("declare Array"+declareArray); // Give some Random Value: [I@27716f4


		// Declare Array With Values
		int[] arr = {1,2,5,4,8};

		// Accessing Array Elements
		System.out.println(arr[2]);

		// Iterating an Array Using Normal For Loop
		 for (int i = 0;i < declareArray.length;i++){
			 System.out.print(declareArray[i]+" ");
		 }

		 // Iterating array using For-Each Loop
		System.out.println("Using For-Each Loop");
		for (int item:declareArray){
			System.out.print(item+" ");
		}
	}
}
