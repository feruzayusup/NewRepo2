package ravshanbek;

import java.util.Scanner;

public class Palundrome {

  public static void main(String[] args) {

	  Scanner scan = new Scanner(System.in);
	  System.out.println("Please enter a word ");
	  
	  String word = scan.next().toLowerCase();
	  String reversed = "";
	  
	  for(int i = word.length()-1; i>=0; i--) {
		  reversed = reversed + word.charAt(i);
		  
	  }
	  	 
	  if(word.equals(reversed)) {
		  System.out.println("Input is Palindrome." ); 
	  }
	  else System.out.println("Input is not Palindrome.");
	  
	  
  }
}
