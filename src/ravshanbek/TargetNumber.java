package ravshanbek;

public class TargetNumber {

  public static void main(String[] args) {

	  /*
	   * given 2 box String of array
	   * check if large box have items from small box
	   * 
	   */
	  
	  String [] smallBox = {"apple", "banana", "kiwi"};
	  String [] largeBox = {"apple", "banana", "pineapple"};
	  
	  for(String small : smallBox) {
//		  System.out.println(small );
		  for(String large : largeBox) {
			  if(small.equals(large)) {
				  System.out.println(small + " in a large box as well" );
				  break;
			  }else {
				  System.out.println(small + " is not in large box" ); 
				  break;
			  }
		  }
	  }
  }
}
