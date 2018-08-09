package victoria;

public class String1rev {

	public static void main(String[] args) {

		String[] words = "Life is wonderful".split(" ");
        
        //option 1
		
        String reversedSent = "";
        for(int i=words.length-1; i>=0; i--) {
            reversedSent += words[i] + " ";
        }
        System.out.println(reversedSent);
        
        //option 2
        
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--) {
        sb.append(words[i]);
        sb.append(" ");
    } 
        System.out.println(sb);
		
		
		
	}

}
