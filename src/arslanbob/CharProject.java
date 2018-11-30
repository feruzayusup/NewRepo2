package arslanbob;

public class CharProject {

	public static void main(String[] args) {
		countChar("abbc");
	}

	public static void countChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			int idx = str.lastIndexOf(str.charAt(i));
			for (int j = 0; j < idx; j++) {
				if (str.charAt(j) == str.charAt(i))
					count++;
			}

			if (i == str.lastIndexOf(str.charAt(i)))
				System.out.println(str.charAt(i) + ": " + count);

		}
	}
}
