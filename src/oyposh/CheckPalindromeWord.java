package oyposh;

import java.util.Scanner;

public class CheckPalindromeWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a word: ");
		String word = scan.next();
		String s = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			s = s + word.charAt(i);
		}

		if (word.equals(s)) {
			System.out.println(word + " is a Palindrome");
		} else {
			System.out.println(word + " is not a Palindrome");
		}
	}
}
