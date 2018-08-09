package feruza;

public class TwoDLooping {

	public static void main(String[] args) {

		int[][] a = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 }, };

		System.out.println("For loop: ");
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.print(a[i][j] + ",");
			}
		}

		System.out.println();
		int[][] a1 = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 }, };
		System.out.println("For each loop : ");
		for (int[] innerArray : a1) {
			for (int data : innerArray) {
				System.out.print(data + ",");
			}
		}
	}
}
