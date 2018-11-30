package ravshanbek;

import java.util.Scanner;

public class MaxMin {

  public static void main(String[] args) {
    int min = 0;
    int max = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scan.nextInt();
    
    min = num;
    max = num;

//    System.out.println("Largest number : " + max);
//    System.out.println("Smallest number : " + min);

    for (int i = 0; i < 10; i++) {
    	
      System.out.println("Do you want to continue y/n ? ");
      char yesno = scan.next().charAt(0);
      if (yesno == 'y') {
        System.out.println("Enter a  number: ");
        num = scan.nextInt();

        if (num > max) {
          max = num;
        } else 
          min = num;
        }
       
        	
        else {
        	System.out.println("Largest number : " + max);
            System.out.println("Smallest number : " + min);	
            break;
      }
    }
  }
}
