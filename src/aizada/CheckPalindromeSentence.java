package aizada;

import java.util.Scanner;

public class CheckPalindromeSentence {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence : ");
		String s = scan.nextLine();
		String str = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				str = str + s.charAt(i);

			}
		}

		boolean isPalindrome = true;
		
		//Live on time, ||  emit no evil.   dividing the sentence
		
		for (int j=0; j<str.length()/2; j++) {
			if(String.valueOf(str.charAt(j)).equalsIgnoreCase(String.valueOf(str.charAt(str.length()-1-j)))) {
				continue;
			}else {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("Your sentence is Palindrome");
		}else
			System.out.println("Your sentence is not a Palindrome");
	}

}
