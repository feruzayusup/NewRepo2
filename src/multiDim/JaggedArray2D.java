package multiDim;

public class JaggedArray2D {   //arrays of array

	public static void main(String[] args) {

		/* task:
		 * 
		 * Create 2D array: 1st row has to have 1 element 2nd row has to have 
		 * 2 elements,  3rd row has to have 3 elements and so on...
		 */

		// here we are declaring the BASE array/rows
		int r = 34;
		int arr[][] = new int[r][];

		// creating 2D array
		for (int i = 0; i < arr.length; i++)
			arr[i] = new int[i + 1]; // declaring array of arrays//

		// initializing array -- count is which number do you want to start with
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;

		// printing the value
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

	}

}
