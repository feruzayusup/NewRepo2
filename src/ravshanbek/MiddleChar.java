package ravshanbek;

import java.util.Scanner;

public class MiddleChar {

  public static void main(String[] args) {
	  int index = 0;
	  Scanner scan = new Scanner (System.in);
	  System.out.println("Enter a word : ");
	  String word = scan.next();
	 
	  if(word.length()%2 != 0) {
		  index = word.length()/2;
		  System.out.println(word.charAt(index) ); 
	  }else if(word.length()%2 == 0) {
		  index = word.length()/2;
	  	 System.out.println(word.charAt(index-1) + ""+ word.charAt(index) ); 
	  	 
	  }
  }	  
		  
		 
  }

