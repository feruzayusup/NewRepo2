package letter_freq;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterFrequency {
	
	public static void main(String[] args) {

		// Letter frequency while using TreeMap
		
		Scanner scanner = new Scanner(System.in);
		//create scanner object
		System.out.print("enter a sentence : ");

		String sentence = scanner.nextLine();

		Map<Character, Integer> frequency = new TreeMap<Character, Integer>();
			// K V
		for (int i = 0; i < sentence.length(); i++) {
			
			char c = sentence.charAt(i);

			if (frequency.containsKey(c)) {

				frequency.replace(c, frequency.get(c) + 1);

			} else {
				frequency.put(c, 1);

			}
		}

		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}
}


