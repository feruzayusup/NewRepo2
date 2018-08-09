package muhtar;

public class Palindrome {

	public static boolean isPalindrome(int i) {
		if (i < 0) {
			return false;
		}
		if (i == 0) {
			return true;
		}

		if (i > 0) {
			String s = "" + i;
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			String t = sb.toString();
			if (s.equals(t)) {
				return true;
			}
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean check = isPalindrome(1553);
		System.out.println(check);

	}

}
