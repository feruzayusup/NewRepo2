package narinahon;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {

		int [] arr = new int [] {12, 34, 65, 34, 12, 98, 1,1,1,2,2,3,3,3,};
		
		ArrayList <Integer> unique = new ArrayList <>  ();
		
	lebel:	for(int i =0; i<arr.length; i++) {
				for (int j = 0; j<arr.length; j++) {
					if(arr[i]==arr[j] && i!=j)
						continue lebel;
			}
				
		unique.add(arr[i]);
		
	
	}
	System.out.println(unique.toString());
}
}
