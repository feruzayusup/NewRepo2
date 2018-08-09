package victoria;

public class Reverse {

	public static void main(String[] args) {

		
		String string="whatever";
		

			//1 st option 

		StringBuilder str = new StringBuilder(string);
		String reverse = str.reverse().toString();
        //String reverse = new StringBuilder(string).reverse().toString();
		System.out.println(reverse);

    
        
        //2 nd option
		
        String result="";
        for(int i = string.length()-1; i>=0; i--){
            result = result+ string.charAt(i);
        }
        System.out.println(result);
		
	}		
	}



