package lambda;

public class RomanToInteger {

	//Task Convert Roman numbers to integer
    //Roman numerals are represented by seven different symbols: I,  V,  X,   L,    C,    D,      M.
	//                                                           1,  5,  10,  50,   100   500,    1000
	
	
	// This method initialize char 'ch' by using value() Method
    int value(char ch) {
		if (ch == 'I')
			return 1;  
		if (ch == 'V')
			return 5;
		if (ch == 'X')
			return 10;
		if (ch == 'L')
			return 50;
		if (ch == 'C')
			return 100;
		if (ch == 'D')
			return 500;
		if (ch == 'M')
			return 1000;
		return -1;
	}

	// this method finds integer value of a given roman number
	int romanToNumber(String str) {
		// Initialize result
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			                                        // Getting value of symbol s1[i]
			int s1 = value(str.charAt(i));

			                                        // Getting value of symbol s1[i+1]
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));

				// Comparing both values
				if (s1 >= s2) {
					// Value of current symbol is greater
					// or equal to the next symbol
					result = result + s1;
				} else {
					result = result + s2 - s1;
					i++; // Value of current symbol is
					// less than the next symbol
				}
			} else {
				result = result + s1;
				i++;
			}
		}

		return result;
	}

	// main method
	public static void main(String args[]) {
		RomanToInteger romtoint = new RomanToInteger();

		//assuming these letters are correct
		String str = "viii";
		System.out.println("Integer form of Roman Numbers is " + romtoint.romanToNumber(str.toUpperCase()));
	}

}
