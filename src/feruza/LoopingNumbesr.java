package feruza;

import java.util.Scanner;

public class LoopingNumbesr {

  public static void main(String[] args) {

	  
	  Scanner scan = new Scanner (System.in);
	  System.out.println("Enter 2 numbers. ");
	  int start = scan.nextInt();
	  int end = scan.nextInt();
	  
	  if(start<end) {
		  for(int num=start; num<=end; num++) {
			  System.out.println("Step " + num ); 
			  
		  }
			  } else
	  if(start>end) {
		  for(int num1=start; num1>=end; num1--) {
			  System.out.println("Step "  + num1); 
			  
		  }
	  }
	  
	  
	  
	  
	  
  }
}
