package junkString;

public class SymbolRemove {

	public static void main(String[] args) {

		String str=" ^.,!Selenium,,..:'";     
		
		String newString="";
	    
		System.out.println(str);
		
	    for (int i = 0; i < str.length(); i++) {
	        if(Character.isLetter(str.charAt(i))) {
	            newString+=str.charAt(i);}
	        }
	    System.out.println(newString);}
	}
		
		
		
	
