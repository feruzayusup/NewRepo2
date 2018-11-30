package narinahon;

public class PrimeNumber {

	public boolean prime(int number) {
		for( int i = 2; i<number; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		PrimeNumber name = new PrimeNumber() ;
		System.out.println(name.prime(17));
		
		
		
		
		
	}

}
