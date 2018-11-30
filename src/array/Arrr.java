package array;

public class Arrr {
          
		   public static void main(String[] args) {
		   
		     int [] values = new int [] {5, 12, 25, 7, 9};
		    
		     MaxWindowTotal(values, 3);
		     
		    
		   }
		   
		   public static int  MaxWindowTotal(int[] values, int windowSize) {
			     int sum = 0;
			      for(int i =0; i<3; i++) {
			       sum = sum + values[i];  
			      }
			       return sum;
			     }  
			     
}
   
		     
//		      ArrayList<String> strings = new ArrayList<String>();
//		      strings.add("Hello, World!");
//		      strings.add("Welcome to CoderPad.");
//		      strings.add("This pad is running Java " + Runtime.version().feature());

//		      for (String string : strings) {
//		        System.out.println(string);
//		     
//		   }
//		  } }


//		 /* 
//		 Your previous Plain Text content is preserved below:
//
//		 /*
//
//		 Given the following method signature,
//
//		 int MaxWindowTotal(int[] values, int windowSize);
//
//		 MaxWindowTotal will take an array of integers and a windowSize, and return the maximum total of any consecutive sequence of integers of length windowSize.
//
//		 For example, given (array =  [5, 12, 25, 7, 9], windowSize = 3), the method will return 44 (the sum of 12, 25, and 7 is the greatest total of any 3 consecutive integers in the array). 
//
//		 Implement MaxWindowTotal
//
//  }
//}
