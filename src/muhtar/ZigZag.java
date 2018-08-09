package muhtar;

import java.util.Arrays;

public class ZigZag {

	public static int[] arr = { 24, 75, 85, 95, 25, 10, 9, 8 };

	public static void ZigZag() {
		// requirement: //a < b > c < d > e < f

		boolean flag = true;

		/*
		 * flag true indicates relation of two elements, "<" is expected here else ">"
		 * is expected
		 */

		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (flag) {									 // "<" is expected here
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				} else { 								// ">" is expected here

					if (arr[i] < arr[i + 1]) {
						temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;

					}
				}
			}
				flag = !flag;    // flip the flag
		}

	}

	public static void main(String[] args) {
		System.out.println("Before zigzag method :   " + Arrays.toString(arr));
    	ZigZag();
		System.out.println("After zigzag method  :   " + Arrays.toString(arr));

	}

}
