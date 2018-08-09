package feruza;

import java.util.TreeSet;

public class StringSorting {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator());
		
		t.add("apple");
		t.add("pear");
		t.add("grapes");
		t.add("cherry");
		t.add("mango");
		t.add("pear");
		
	//	[apple, cherry, grapes, mango, pear]
		
		
		
		System.out.println(t);
	}

}
