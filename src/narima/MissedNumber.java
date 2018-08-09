package narima;

import java.util.ArrayList;

public class MissedNumber {

	public static void main(String[] args) {
			int [] arr=new int [] {1, 2, 3, 5, 10};

			ArrayList <Integer>missed = new ArrayList();
			int j= arr[0];
				for(int i = 0; i<arr.length; i++) {
					if(j==arr[i]) {
						j++;
							//continue;
				}else {
					missed.add(j);
					i--;
					j++;
					
				}
					
			}
			System.out.println("Missing number");
				for(int i : missed) {
					System.out.print(" "+ i);
			}
		}
	}
	