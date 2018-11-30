package feruza;

public class Multip {

  public static void main(String[] args) {

	  int result=1;
	  
	  for(int outer=1; outer<=10; outer++) {
		  System.out.println("--------------" ); 		  
		  for(int inner=1; inner<=10; inner++) {
			  result = outer*inner;
			  System.out.println("|   " + outer + "*" + inner + "=" + result + "    |"); 
			  
		  }
		  System.out.println("--------------" ); 
	  }
	  
	  
	  
	  
  }
}
