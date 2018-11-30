package recursive;

public class SumOfNum {

	// regular or normal method
		public static int regularSum(int i) {
			int sum = 0;

			for (int j = 0; j <= 5; j++) {
				sum += j;
			}

			return sum;
		}

		// recursive method
		public static int recursiveSum(int i) {

			// we declared an integer variable "n"
			// and initialized it to a value of "i";
			int n = i;

			// this is called a base case,
			// which will eventually stop the method from calling itself;

			if (n == 0) {
				return 0;

				// this is recursive case, which will allow us
				// to call our method till n would become "0";
			} else
				return i + recursiveSum(i - 1);
		}

		public static void main(String[] args) {

			// so if we check it here

			System.out.println(regularSum(5));

			System.out.println(recursiveSum(5));

			// and we calculate by ourselves it will show that
			// we have a correct result;

			// 0 + 1 + 2 + 3 + 4 + 5 = 15;

			// we could break our problem into
			// smaller problem like
			// sum(5) is equal to sum(4) + 5, right?
			// which is equal to sum(3) + 4 + 5 and so on...

		}
	}
