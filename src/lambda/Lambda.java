package lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

	//Task:
	//print all fruits using forEach () loop and iterator
	
	
	public static void main(String[] args) {

		List<String>  fruits = Arrays.asList("apple", "cherry", "grapes", "peach", "mango");

		// printing list with for loop

		System.out.println("for loop----------------------------");
		for(int i= 0; i< fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		System.out.println("for each loop---------------------------");

		
		// printing the list using for each loop
		
		for ( String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// printing using forEach()
		System.out.println("forEach() loop---------------------------");

		fruits.forEach(i -> System.out.println(i));
	
		
		// printing list using iterator
		System.out.println("iterator---------------------------");

		Iterator it = fruits.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
		}

	}


