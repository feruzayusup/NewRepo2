package feruza;

public class ReversingString {

  public static void main(String[] args) {

	  String str = "Feruzahon";
	  String reversed = "";
	  
	  String array [] = str.split("");
	  for(int i=array.length-1; i>=0; i--) {
		 reversed  = reversed + array[i];
		  
	  }
	  System.out.println(reversed);
	  
	  
	  
	  
  }
}
