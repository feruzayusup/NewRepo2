package ravshanbek;

import java.util.Scanner;

public class Frequency {

  public static void main(String[] args) {
	  int count = 0;
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a word : ");
	  String word = scan.next();
	  System.out.println("Enter a character : ");
	  char c = scan.next().charAt(0);
	  
	  for(int i=0; i<=word.length()-1; i++) {
		  if(word.charAt(i)==(c)) {
			  count++;
		  }
	  }
	  System.out.println("This character occurs " + count + " times");
	  
	  
	  
  }
}
