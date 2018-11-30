package ravshanbek;

import java.util.Scanner;

public class CatDog {

  public static void main(String[] args) {

	 
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a word: ");
	  String catDog = scan.next();
	  
	  String str[] = catDog.split("");
	  for(String s : str) {
	  System.out.print(s+" ");
	  
			  
	  
	  }	  
	  
  }
}
