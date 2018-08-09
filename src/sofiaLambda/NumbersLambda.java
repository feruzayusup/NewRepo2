package sofiaLambda;

import java.util.Arrays;
import java.util.List;

public class NumbersLambda {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 433, 44, 55, 1);

		for (Integer num : numbers) {
			System.out.print(num + " "); // print all numbers one by one
		}

		numbers.forEach(num -> {
			if (num == 3) {
				System.out.println("three");
			} else {
				System.out.println(num);
			}
		});
		
		List <String> names = Arrays.asList("Osiyo", "Feruza", "Hotamtoy" , "Manzura" , "Ravshanbek");
		names.forEach(name -> {
			if(name.contains("O")) {System.out.print("Achildaq");	}
			else if(name.endsWith("y")) {System.out.print("Ptqtoy");
			}else System.out.print(name + " ");
		});
	}

}
