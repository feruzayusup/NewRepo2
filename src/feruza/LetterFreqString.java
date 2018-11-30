package feruza;

public class LetterFreqString {

	public static void main(String[] args) {

		String str = "Feruzahonksdbfksbdvksvvsb";
		int countLetter = 0;
		String unique = "";

		for (int i = 0; i < str.length(); i++) {
			if (!unique.contains(str.charAt(i) + "")) { // adding "" just to compile
				unique += str.charAt(i);
				countLetter++;
			}

		}
		System.out.println("Unique word : " + unique);
		System.out.println("Letter frequency : " + countLetter);
	}

}
