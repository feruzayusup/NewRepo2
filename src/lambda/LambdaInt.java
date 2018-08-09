package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaInt {

	public static void main(String[] args) {

		// Task: print even numbers using lambda and forEach()

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for(int i =1 ; i<numbers.size(); i++) {
			if(i%2 ==0) 
				System.out.println(i);
		}
		
		System.out.println("-----------------------------------------");
		for (Integer number : numbers) {
			if(number%2 ==0) 
				System.out.println(number);
		}
		
		System.out.println("-----------------------------------------");

		
		
		numbers.forEach(i -> {
			                   if(i%2==0)
		                       System.out.println(i);
		                      }
		
		                );
		
		
		
		
	}

}
