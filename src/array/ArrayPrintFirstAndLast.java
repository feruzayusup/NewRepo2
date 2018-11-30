package array;

public class ArrayPrintFirstAndLast {

  public static void main(String[] args) {
                       //01234    012    01    01234
	  String[] words = {"hello", "why", "by", "apple", "note", "water"};
	  
//	  for(String word : words) {
//		  
//		  System.out.print(word.charAt(0) );
//		  System.out.println(word.charAt(word.length()-1) ); 
//	  }
	  
	  
	  for(String word : words) {     
		 		  //5
		  System.out.println(word.substring(0,1)+word.substring(word.length()-1) ); 
	  }
	  
	  
  }
}
