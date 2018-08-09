package junkString;

public class RemoveSymbol {

	public static void main(String[] args) {

		// Remove all characters that are not letters from string
		
		String str = "^.,!Selenium,,..:' ,";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
		  if(str.toUpperCase().charAt(i) >= 'A' && str.toUpperCase().charAt(i) <= 'Z') {
		    result += str.charAt(i);
		  }
		}
		System.out.println(result);

		
		
		
	}

}
