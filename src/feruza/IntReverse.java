package feruza;

public class IntReverse {

  public static void main(String[] args) {

	  
	  int num = 12436745;
	  int reversedNum=0;
	  while (num != 0) {
		                      //  5*10     + 1234 % 10
		    reversedNum = reversedNum * 10 + num % 10;//i get 5 //4    //3   //2   //1
		    					//     0   +  5
		    				    //     50  +  4
		                       //     540  +  3
		                       //     5430 +  2
		                       //     54320 + 1
		    
		    
		    num = num / 10;   //1234    //123     //12          //1
		}
	  System.out.println(reversedNum);
	  
  }
  }

