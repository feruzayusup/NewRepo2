package recursive;

public class FindingMaxInArray {
	
	public static int findMax(int [] a, int l) {
		//l is length of our array
		
		
		//base case
		
		if(l==1) {
			return a[0];
		}
		
		//recursive case 
		return Math.max(a[l-1], findMax(a, l-1));
	}
	
	
	public static void main(String[] args) {

		int[] arr = {2,3,4,5,6,7,8,9,21,32,54,6,76,87,9,8};
		System.out.println(findMax(arr, arr.length));
	}

}
