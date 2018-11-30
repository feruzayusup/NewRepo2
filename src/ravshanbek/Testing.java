package ravshanbek;

public class Testing {

  public static void main(String[] args) {

	  
	  System.out.println(30/100); //0
	  System.out.println(78/10); //7
	  System.out.println(88/10); //8


	  
	  
	  
	  
	  System.out.println(30%100); //30
	  System.out.println(21%10); //1
	  System.out.println(103%100); //30

	  int number = 56;
	  if(number > 19 && number < 100)
      {
         int result = number / 10; //finding tens
          System.out.println("Result" + result ); 
         number = number % 10; //finding single digits
          System.out.println("Num" + number);
	  
          
          System.out.println("----------------"+2%10 ); 
          
      }	  
  }
}
