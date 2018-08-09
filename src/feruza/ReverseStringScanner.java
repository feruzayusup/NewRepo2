package feruza;

import java.util.Scanner;

public class ReverseStringScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a whole Sentence : ");
		String original = scan.nextLine();   //i got the sentence in here
		System.out.println("Original sentence is : " + original);
		
		//now I need to reverse it
		//to do that i need to split and save it in a String array
		
		String array [] = original.split(" ");   //here my sentence is splitted into  words
		String reversed = "";
		
		for(int i = array.length-1; i>=0; i--) {   //starting from the last word
			reversed = reversed + array[i] + " ";
			
		}
		
		System.out.println("Reversed Sentence is : " + reversed);
		
		
		
	}

}
