package missingNumber;

public class MultTable {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 12; i++) {
			for (int j = 0; j <= 12; j++) {
				switch (String.valueOf(i * j).length()) {

				case 1:
					System.out.print("    " + i * j);
					break;

				case 2:
					System.out.print("   " + i * j);
					break;

				case 3:
					System.out.print("  " + i * j);
					break;

				}

			}
			System.out.println();
		}

	}

}
