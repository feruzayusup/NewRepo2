package primenumber;

public class PrimeNumber {

	public static void primeNumber(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {

				System.out.println("Given number " + x + " is not a Prime Number");
				return;
			}
		}
		System.out.println("Given number " + x + " is Prime number");

	}

	public static void main(String[] args) {
		primeNumber(199);

	}

}
