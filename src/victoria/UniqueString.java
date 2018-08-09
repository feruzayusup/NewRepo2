package victoria;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {

	public static void main(String[] args) {
		
		//looking for unique characters from the String using SET 

		String str = "Feruzahonhon";
		Set<Character> set = new HashSet<>();
		for (int i =0; i<str.length()-1; i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
		
		//option 2 we are not using set here just using regular way
		
		String unique="";
		for(int i=0; i<str.length()-1;i++) {
			
			if(unique.contains(str.charAt(i) + "")){
				
			}	
		}
		System.out.println(unique);

	}

}