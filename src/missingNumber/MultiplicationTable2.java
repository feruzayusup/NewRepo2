package missingNumber;

public class MultiplicationTable2 {

	public static void main(String[] args) {

		
		int row = 12;
		int col = 12;

		for (int i = 0; i < row; i++) {
		  for (int j = 0; j < col; j++) {
		    int length = String.valueOf(row*col).length();
		    for (int k = 0; k <= length-String.valueOf(i*j).length(); k++) {
		      System.out.print(" ");
		    }
		    System.out.print(i*j);
		  }
		  System.out.println();
		}

	}

}
