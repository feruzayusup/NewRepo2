package array;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiAttack1 {

  public static void main(String[] args) {

	  Scanner input = new Scanner(System.in) ;
	  int [] inhabitants = new int [8];
	  System.out.println("Please enter 8 positive numbers : ");
	  //user: 24, 45, 67, 8, 5, 4, 12, 48 
	  //Day 0 [24, 45, 67, 8, 5, 4, 12, 48]
	  //Day 1 [12, 22, 33, 4, 2, 2, 6, 24]
	  //Arrays.toString
	  
	  int divided [] = new int [8];
	  for(int j = 0; j<inhabitants.length;j++) {
	  for(int i = 0; i<inhabitants.length; i++) {
		  inhabitants[i] = input.nextInt();

		  int div = inhabitants[i]/2;  //12
		  
		  divided [i] = div;
//		  System.out.println(Arrays.toString(divided) ); 

		  	 
	  }
	  System.out.println(Arrays.toString(divided) ); 
	  }
	  System.out.println(Arrays.toString(divided) ); 
 
	  
	  
  }
}
