package ahmetKose;

public class PrimeNumber {

	static boolean isPrime (int n, int i) {
		if(n<=2)
			return (n==2)? true : false;
		if(n%i==0) 
			return false;
		if(i*i>n)
			return true;
		return isPrime(n, i+1);
	}
	public static void main(String[] args) {

		int n=11;
		if(isPrime(n,1))
			System.out.println("yes");
		else
			System.out.println("no");
		
		
		
	}

}
