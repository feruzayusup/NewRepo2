package ravshanbek;

import java.util.Scanner;

public class NegativePositive {

  public static void main(String[] args) {
    
	  int positive = 0;
	  int negative = 0;
	  int zero  = 0;
		  
	  Scanner scan = new Scanner (System.in);
	  System.out.println("Enter a number: "); 
	  int num = scan.nextInt();
	  if(num>0) {
		  positive++;
	  }else if(num<0) {
		  negative++;
	  }else 
		  zero++;
	  
	  
	  for(int i =0; i<10; i++) {
	  System.out.println("Do you want to continue y/n ?");
	  char yesno = scan.next().charAt(0);
	  if(yesno=='y') {
		  System.out.println("Enter a  number : " );
		  num = scan.nextInt();
		  if(num>0) {
			  positive++;
		  }else if(num<0) {
			  negative++;
		  }else 
			  zero++;
	  }else {
		  System.out.println("Positive numbers : " + positive ); 
		  System.out.println("Negative numbers : " + negative); 
		  System.out.println("Zero numbers : " + zero ); 
	      break;
	  }
	  }
	  
	 }
    }
  

