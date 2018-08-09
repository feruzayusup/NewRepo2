package missingNumber;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 5, 6, 8 , 32, 43};// do we have to find only one or many missing numbers?
		// int[] arr2=new int[arr.length+1];

		int missingNumber = 0;

		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1] + 1) {
				missingNumber = arr[i - 1] + 1;
				System.out.println(missingNumber);
			}
		}

	}

}
