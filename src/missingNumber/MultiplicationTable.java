package missingNumber;

public class MultiplicationTable {

	public static void main(String[] args) {

		// first solution to multiplication table question
		for (int i = 0; i < 12; i++) {
		  for (int j = 0; j < 12; j++) {
		    switch (String.valueOf(i*j).length()) {
		    case 1:
		      // if one digit result put 3 spaces in front
		      System.out.print("   " + i*j);
		      break;
		    case 2:
		      // if two digit result put 2 spaces in front
		      System.out.print("  " + i*j);
		      break;
		      case 3:
		        // if three digit result put 1 spaces in front
		        System.out.print(" " + i*j);
		        break;
		    default:
		      break;
		    }
		  }
		  System.out.println();
		}
		
		
	}

}
