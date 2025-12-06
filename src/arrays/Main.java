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

		/*
		 2D Array: A 2D Array is basically an Array of Array Think like as table with row and column
		 1 2 3 4
		 5 6 7 8
		 9 10 11 12
		 */
		// Initialize a 2D Array
		int[][] twoDArr;
		// Declare a 2D Array
		int[][] twoDArr2 = new int[3][4];
		// Declare a 2D Array With Values
		int[][] matrix = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};

		System.out.println();
		// Accessing 2D Array Elements
		System.out.println(matrix[1][2]);

		// Iterating on 2D Array Using Normal For loop
		System.out.println("Print 2D Array Using Normal For Loop");
		for (int i=0;i< matrix.length;i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Using For Each Loop");
		// Iterating Using For-Each Loop
		for(int[] row:matrix){
			for (int col : row){
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}
}
