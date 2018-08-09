package feruza;

import java.util.Arrays;

public class ThreeD {

	public static void main(String[] args) {
       
		        int [] numbers = {1, 2, 3, 4, 5, 6};
		        int [] positiveNumbers = numbers;    // copying arrays

		        for (int number: positiveNumbers) {
		           System.out.print("F " + number + ", ");
		        }
		        
		        
		        
		        System.out.println();
		        
		        
		        int [] numbers1 = {1, 2, 3, 4, 5, 6};
		        int [] positiveNumbers1 = numbers1;    // copying arrays
		        
		        numbers1[0] = -1;

		        for (int number1: positiveNumbers1) {
		           System.out.print("S "+number1 + ", ");
		        }
		
		System.out.println();
		
		  int [] source = {1, 2, 3, 4, 5, 6};
	      int [] destination = new int[6];

	      for (int i = 0; i < source.length; ++i) {
	         destination[i] = source[i];
	         System.out.print(destination[i]);
	      }
	      System.out.println();
	      // converting array to string
	      System.out.println(Arrays.toString(destination));
		    }
		
		
		
	}


