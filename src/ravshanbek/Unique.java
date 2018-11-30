package ravshanbek;

import java.util.Scanner;

public class Unique {

  public static void main(String[] args) {
	  String unique = "";
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a word : ");
	  
	  String word = scan.next();
	  
	  for(int i=0; i<=word.length()-1; i++) {
		  	  
		  if(!(unique.contains(word.charAt(i)+""))) {
			  unique = unique + word.charAt(i);
		  }
		  
	  }
	  System.out.println(unique);
	  
	  
	  
  }
}
