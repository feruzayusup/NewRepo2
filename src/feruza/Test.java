package feruza;

public class Test {

  public static void main(String[] args) {

	  
	//  int num = 12345;
	  int [] array = {1,2,3,4,5,4,3,2,2,3};
	  
	  int count = 0;
      for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array.length; j++) {
              if (array[i] == array[j]) {
                  count++;
              }
          }
          if (count == 1)
              System.out.print(array[i] + " ");
          count = 0;
      }
  }

}