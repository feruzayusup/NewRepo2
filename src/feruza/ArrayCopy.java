package feruza;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		 int[] n1 = {2, 3, 12, 4, 12, -2};
	      
	      int[] n3 = new int[5];

	      // Creating n2 array of having length of n1 array
	      int[] n2 = new int[n1.length];
	      
	      // copying entire n1 array to n2
	      System.arraycopy(n1, 0, n2, 0, n1.length);
	      System.out.println("n2 = " + Arrays.toString(n2));  
	      
	      // copying elements from index 2 on n1 array
	      // copying element to index 1 of n3 array
	      // 2 elements will be copied
	      System.arraycopy(n1, 2, n3, 1, 2);
	      System.out.println("n3 = " + Arrays.toString(n3));  
	      
	      System.out.println("======================================================");
	      
	      int[] source = {2, 3, 12, 4, 12, -2};
	      
	      // copying entire source array to destination
	      int[] destination1 = Arrays.copyOfRange(source, 0, source.length);      
	      System.out.println("destination1 = " + Arrays.toString(destination1)); 
	      
	      // copying from index 2 to 5 (5 is not included) 
	      int[] destination2 = Arrays.copyOfRange(source, 2, 5); 
	      System.out.println("destination2 = " + Arrays.toString(destination2));  
	      
	      
	      
	      
	      
	      
		
		
	}

}
