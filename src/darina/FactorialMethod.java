package darina;

public class FactorialMethod {
	
		public static int factorial(int i) {
			// base case
			// 0! = 1
			if (i == 0) {
				return 1;
			} else if (i == 1) {
				return 1;

			}
			// recursive case
			else
				return i * factorial(i - 1);

		}

	public static void main(String[] args) {
	
		factorial(3);
	}

}
