package hondarina;

public class FizzBuzzMethod {
	
	public static  String[] fizzBuzz(int start, int end) {
		  
		String[] result= new String[100];
		  for(int i=start; i<end; i++)
		    {
		      int index= i-start;
		      if(i%3 ==0 && i%5==0)
		        result[index]="FizzBuzz";
		      else if(i%3==0)
		        result[index]= "Fizz";
		      else if(i%5==0)
		        result[index]= "Buzz";
		      else
		        result[index]=(i)+"??";
		    }
		return result;
		}

	public static void main(String[] args) {

		fizzBuzz(15,5);
	}

}
