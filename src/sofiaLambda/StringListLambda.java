package sofiaLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringListLambda {

		public static void main(String[] args) {

			// create a list of strings
			List<String> names = Arrays.asList("Adam","Alex", "Vika", "Vaso", "Sonia");

			names.forEach( (String name) ->  System.out.println(name) );
			
			// declare the predicate type as string and use
			// lambda expression to create object
			Predicate<String> predicate1 = name -> name.startsWith("V");
			Predicate<String> predicate2 = name -> name.contains("A");
			Predicate<String> predicate3 = name -> name.endsWith("o");
			Predicate<String> predicate4 = name -> name.equalsIgnoreCase("VIKA");
			
			names.forEach(name -> {
				if (predicate1.test(name)) {
					System.out.println("Starts with V: "+ name);
				}
				if(predicate2.test(name)) {
					System.out.println("Contains A: "+name);
				}
				if(predicate3.test(name)) {
					System.out.println("Ends with o: "+name);
				}
				if(predicate4.test(name)) {
					System.out.println("Find Vika: "+ name);
				}
			});
		}
	
		}
