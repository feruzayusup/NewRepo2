package narima;

public class JunkChar {

	public static void main(String[] args) {

		String junk = "645Manzura  38Fe  *&^%$$# ruzahon! @##$Osiyo hon$%%^^";
		
		char [] ch = junk.toCharArray();

		String answer = "";
		
		for(char charEach : ch ) {
			if(Character.isLetter(charEach)) 
			answer = answer + charEach;
				
		}
		System.out.println(answer);
	}

}
