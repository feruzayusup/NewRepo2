package multiDim;

import java.util.Arrays;

public class ArrayToString {
	
	 public static void print2D(int matrix[][])
	    {
	        // Loop through all rows
	        for (int[] row : matrix)
	 
	            // converting each row as string
	            // and then printing in a separate line
	        	
	            System.out.println(Arrays.toString(row));
	    }
	 
	    public static void main(String args[]) 
	    {
	        int matrix[][] = { { 11, 22, 33, 44 },
	                        { 55, 66, 77, 88 },
	                        { 99, 10, 11, 12 } };
	        print2D(matrix);
	    }

}
