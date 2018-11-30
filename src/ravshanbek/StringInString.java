package ravshanbek;

import java.util.Arrays;

public class StringInString {

  public static void main(String[] args) {

	  
	String [] arr = new String [] {"apples", "banana", "kiwi", "cherries"};
	for( String fruit : arr) {
		System.out.println(fruit.substring(0,3) ); 
	}
	
	
	System.out.println("--------------"+arr[0].substring(0, 4));
	
	System.out.println("for loop");
	for(int i =0 ; i<arr.length;i++ ) {
		System.out.println( ); 
	}
		 
	 }
  }

