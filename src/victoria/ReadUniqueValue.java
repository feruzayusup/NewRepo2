package victoria;

import java.util.HashSet;
import java.util.Set;

public class ReadUniqueValue {

	public static void main(String[] args) {

		//option 1 
		
		int [] array = { 11, 2, 11, 3, 44, 3};
		
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		System.out.println(set);
		
		//option 2
		String unique = "";
		for (int num : array) {
			if(!unique.contains(String.valueOf(num)))
					unique =unique + " , " + num;
		}
		System.out.println(unique);
		}
	}