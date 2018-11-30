package ravshanbek;

public class MethodsWithConditions {
	
	//2 num prints the largest one
	//if equal prints "numbers are equal
	
	public static void getLarger(int a, int b) {
		if(a==b) {
			System.out.println("Numbers are equal numbers. " ); 
		}
		else {
			if(a>b) {
				System.out.println("The larger number is " + a ); 
			}
			else
				System.out.println("The larger number is " + b ); 
		}
		
	}
	
	
	
	
	
	
	
	

  public static void main(String[] args) {

	  getLarger(3,4);
	  
	  
	  
	  
	  
  }
}
