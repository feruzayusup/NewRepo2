package asli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizBuzzz {

	
		//Write method that will perform division without using the Divide operator or the modulus operator  / %
		public static String division(int divident, int divisor) {
			int quotient = 0;
			int remainder = 0;
			while(divident >= divisor) {
				divident = divident - divisor;
				quotient++;
				remainder = divident; 
			}
			return "quotient = " + quotient + " remainder = " + remainder;
		}

		
		//How to count number of vowels and consonants in a string
		public static String numbers(String word) {
			int countVowels = 0;
			int countConsonants = 0;
			
			List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
			List<Character> consonants = new ArrayList<>();
			
			for(char i = 'a'; i <= 'z'; i++) {
				if(!vowels.contains(i)) {
					consonants.add(i);
				}
			}
			
			word = word.toLowerCase();
			
			for( int i = 0; i < word.length(); i++) {
				if(vowels.contains(word.charAt(i))) {
					countVowels++;
				}else {
					countConsonants++;
				}
					
					
			}
			
			
			return "number of vowels is " + countVowels + " and number of consonants is " + countConsonants;
		}
//		FizzBuzz problem : Write a Java program that prints the numbers from 1 to
//		50. But for multiples of three print "Fizz" instead of the number and for the
//		multiples of five print "Buzz". For numbers which are multiples of both three
//		and five print "FizzBuzz" 

		public static void fizzBuzz() {
			for(int i = 1; i <= 50; i++) {
				if(i % 15 == 0 ) {
					System.out.print("FizzBuzz ");
				}else if (i % 3 == 0) {
					System.out.print("Fizz ");
				}else if(i % 5 == 0) {
					System.out.print("Buzz ");
				}else {
					System.out.print(i + " ");
				}
			}
		}
		
//		4. Write a Java program to check if a number is Armstrong or not ? 
//		An Armstrong number of three digits is an integer such that
//		the sum of the cubes of its digits is equal to the number itself. 
//		For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371. 
//		Write a program to find all Armstrong number in the range of 0 and 999.
		//371 / 10 = 37,  371 % 10 = 1; 
		//37 / 10 = 3, 37 % 10 = 7
		

		public static void armstrong(int number) {
			
			int divident = number;
			int remainder = 0;
			int total = 0;
			
			while(divident > 10) {
				remainder = divident % 10;
				total += Math.pow(remainder, 3);
				divident = divident / 10;
			}
			
			total += Math.pow(divident, 3);
			
			if(total == number) {
				System.out.println("This number is armstrong");
			}else {
				System.out.println("This number is NOT armstrong");

			}

		}
		
		// You have a sentence in a String : ''Mom and dadad in a racecar '' -->
			// find and return the biggest palindrome 

		public static String biggestPalindrome(String str) {
			str = str.toLowerCase();
			String biggestPalindrome = "";
			String[] arr = str.split(" ");
			
			for(String each : arr) {
				String reverse = "";
				for(int i = each.length() - 1; i >= 0; i--) {
					reverse += each.charAt(i);
				}
				if(each.equals(reverse) &&  each.length() > biggestPalindrome.length()){
					biggestPalindrome = each;
				}
			}
			return biggestPalindrome;
		}
		
		
		public static void main(String[] args) {
			
			System.out.println("Palindroem method ");
			System.out.println(biggestPalindrome("Mom and dadad in a racecar"));
			
			System.out.println();	
			System.out.println("armstrong method : ");

			armstrong(371);
			
			System.out.println();

			System.out.println("fizz buzz method : ");
			fizzBuzz();
			System.out.println();
			
			System.out.println(numbers("carpediem"));
			
			
			System.out.println();
			System.out.println(division(45, 6));
			/*
			 *45 - 6 = 39   count = 1 
			 *39 - 6 = 33 count = 2
			 *33 - 6 = 27 count = 3
			 * 27 - 6 =21 count =4 
			 * 21 - 6 = 15 count = 5
			 * 15 -6 = 9 count = 6
			 * 9 - 6 = 3 count = 7
			 * remainder = 3
			 * quotient = 7
			 *
			 *
			45 / 6 =7;
			
			
			
			*/
			

			String a = "carpediem";
			
			System.out.println(a.lastIndexOf(""));
			
			char[] arr = a.toCharArray();
			
			int count = 0;
			for(char each : arr) {
				count++;
			}
			System.out.println("count " + count);
		}

	}
		
		
		
	
