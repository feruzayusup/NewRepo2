package recursive;

public class Fibonacci {

		public static int nthFibNumber(int n) {
			// base cases
			if (n<=0) {
				return 0;
			}else if (n==1) {
				return 1;
				
			// recursive case
			}else
				return nthFibNumber(n-1) + nthFibNumber(n-2);
		}
		
		public static void main(String[] args) {
			
			System.out.println(nthFibNumber(8));

		}


	}
