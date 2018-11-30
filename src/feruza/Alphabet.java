package feruza;

import java.util.Scanner;

public class Alphabet {

  public static void main(String[] args) {

	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter a letter from the Alphabet : ");
	  String letter = scan.next().toLowerCase();
	  
	  if(letter.length()>1) {
		  System.out.println("Please enter only 1 letter " ); 
	  }
	  char letter1 = letter.charAt(0);
	  
	  if(!((letter1>='a' && letter1<='z') || (letter1>='A' && letter1<='Z')) ){
		  System.out.println("Please enter an alphabetical letter " ); 
		  
	  }else
		   if(letter1=='a' || letter1=='u' || letter1=='i' || letter1=='e' || letter1=='o') {
			  System.out.println("Input is Vowel. " ); 
		  }
		  else System.out.println("Input is Consonant. ");
	  	  
	  
  }
}
