package feruza;

import java.util.Arrays;

public class TwoD {

	public static void main(String[] args) {

		
		int[][] a = {
	            {1, 2, 3}, 
	            {4, 5, 6, 9}, 
	            {7}, 
	      };
	      
	      System.out.println("Length of row 1: " + a[0].length);
	      System.out.println("Length of row 2: " + a[1].length);
	      System.out.println("Length of row 3: " + a[2].length);
		
		
		System.out.println("-=====================================================");
		
		
		
		   int[][] source = {
		            {1, 2, 3, 4}, 
		            {5, 6},
		            {0, 2, 42, -4, 5}
		            };

		      int[][] destination = new int[source.length][];

		      for (int i = 0; i < destination.length; ++i) {

		         // allocating space for each row of destination array
		         destination[i] = new int[source[i].length];

		         for (int j = 0; j < destination[i].length; ++j) {
		            destination[i][j] = source[i][j];
		         }
		      }
		     
		      // displaying destination array
		      System.out.println(Arrays.deepToString(destination));  
	}

}
