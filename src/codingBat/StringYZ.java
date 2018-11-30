package codingBat;

public class StringYZ {

  public static int countYZ(String str) {
    int limit = str.length() - 1;
    int count = 0;
    str.toLowerCase();
    char ch = str.charAt(0);

    for (int i = 0; i < limit; i++) {

      if (ch == 'y' || ch == 'z') {
        ch = str.charAt(i);
        if (!(Character.isLetter(ch))) {
          count++;
        } else ch = str.charAt(i);
      }
      if (ch == 'y' || ch == 'z') {
        ch = str.charAt(i);
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    countYZ("hhhyfez");

    // Given a string, count the number of words
    // ending in 'y' or 'z' -- so the 'y' in "heavy" and the
    // 'z' in "fez" count, but not the 'y' in "yellow"
    // (not case sensitive). We'll say that a y or z is at the end of
    // a word if there is not an alphabetic letter immediately following it.
    // (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

  }
}
