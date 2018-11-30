package arslanbob;

public class CharProject1 {

	public static void main(String[] args) {

		String word = "abbbbcaaaccdg";
		int[] letterCounts = new int[26]; // this is alphabet
		for (int i = 0; i < word.length(); i++) {
			letterCounts[word.charAt(i) - 'a']++;
		}
		for (int i = 0; i < letterCounts.length; i++) {
			if (letterCounts[i] > 0) {
				System.out.println((char) (i + 'a') + " : " + letterCounts[i]);
			}
		}
	}

}
