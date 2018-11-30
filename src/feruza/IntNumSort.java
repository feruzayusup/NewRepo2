package feruza;

import java.util.Arrays;

public class IntNumSort {

  public static void main(String[] args) {

	  int[] array = {0,0,0,1,2,2,2,1,1,1,1,4,4,4,5,5,5,6,6,6};

	    Arrays.sort(array);
	    for(int i = 0 ; i< array.length ; i++)  {
	    	if(array[i] != array [i+1]) {
	      System.out.print(array[i] +" ");
	       
	    	}   } 
  }
}
  

