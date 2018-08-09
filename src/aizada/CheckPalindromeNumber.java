package aizada;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int original = 127;
		int reverse = 0;
		int temp = original;
		
		while(temp != 0) {
			reverse = reverse * 10;
			reverse = reverse + (temp % 10 );
			temp = temp / 10;
		}
		
		if(reverse == original)
		System.out.println(reverse + " is a Palindrome");
		else 
			System.out.println(reverse + " is not a Palindrome");
	}

}
