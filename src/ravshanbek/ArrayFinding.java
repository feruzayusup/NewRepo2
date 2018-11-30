package ravshanbek;

import java.util.Scanner;

public class ArrayFinding {

  public static void main(String[] args) {
  //  rav, fer4, manzura, hotamtoy, osiyo
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter 5 words : ");
	  String [] words = new String [5];
	  
	  String longest ="";
	  int max=1;
	  
	  for (int i = 0; i<5; i++) {
		  words[i] = input.nextLine();
		  int len = words[i].length();  
		  if(len>max) {
			  max = len;
			  longest = words[i];
			 
		  }
		  
	  }
	  System.out.println("The longest string is :: " + longest);

	//  System.out.println("It has  :: " + max + " letters");
	  
	  
	  
	  
	  
  }
}
