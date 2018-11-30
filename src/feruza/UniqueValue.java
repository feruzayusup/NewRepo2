package feruza;

import java.util.Arrays;

public class UniqueValue {

  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5, 4, 3, 4, 3, 3, 2, 3, 4, 4, 3, 2};

    Arrays.sort(array);
    for (int i = 0; i < array.length; i++) {
      if (array[i] != array[i + 1]) {
        System.out.println(array[i]);
      }
    }
  }
}
