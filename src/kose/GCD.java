package kose;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int number2 = scanner.nextInt();
		System.out.println("Greates Common Divisor of : " + number1 + " and " + number2 + " is " + findGCD(number1, number2));
		
	}

	static int findGCD(int number1, int number2) {
		if(number2 == 0) {
			return number1;
		}
		
		return findGCD(number2,number1 % number2);
		
	}
}
