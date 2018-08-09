package ahmetKose;

public class  BubbleSortMethod {

	static void pushZero(int arr [], int n) {
		int count = 0;
		for(int i = 0; i<n; i++)
			if(arr[i]!=0)
				arr[count++] = arr[i];
		while(count<n) 
			arr[count++] = 0;
	}
	
	static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i =0; i<n-1; i++)
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
	}
	
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,0,0,0,03,4,2,1,10};
		
		bubbleSort(arr);
		int n=arr.length;
		pushZero(arr,n);
		for(int i = 0 ; i<n; i++)
		System.out.print(arr[i]);
	}

}
