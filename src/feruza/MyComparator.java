package feruza;

import java.util.Comparator;

public class MyComparator implements Comparator {
	
	
	@Override
	public int compare(Object obj1, Object obj2) {
	
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		
		if(str1.compareTo(str2)>0)
		
			return 1;
		
		if(str1.compareTo(str2)<0)
		
			return -1;
		
		else return 0;
		
		
	
	
	
	
	
	
	

//	@Override
//	public int compare(Object obj1, Object obj2) {
//	
//		Integer num1 = (Integer) obj1;
//	
//		Integer num2 = (Integer) obj2;
//
//			
//
//		
//		if (num1 > num2) {  
//			return -1;
//		} else if (num1 < num2) {
//			return 1;      
//		} else
//			return 0;      

		
		
	}

}
