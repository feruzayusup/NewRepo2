package recursive;

public class ToktorovFactorial {

	public static int factorial(int n) {
		// base cases
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;

		// recursive case
		} else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
}