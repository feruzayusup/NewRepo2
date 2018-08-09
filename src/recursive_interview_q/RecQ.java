package recursive_interview_q;

public class RecQ {

		public static int recursiveMethod(int[] ar, int size, int v) {

			if (size == 0) {
				return 0;
			}

			int count = 0;
			int i = 0;
			size = size - 1 - i;

			if (ar[size] == v) {
				count = 1;
			}

			i++;

			return count + recursiveMethod(ar, size, v);
		}

		public static void main(String[] args) {
			
			int[] ar = {1,2,3,1,5,1};
			
			System.out.println(recursiveMethod(ar, ar.length, 1));

		}

	}


