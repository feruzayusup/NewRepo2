package recursive;

public class ReversingString {

	
	public static void teskari (String s) {
		
		// base case and one condition
				if ((s == null) || (s.length() <= 1)) {
					System.out.println(s);

					// recursive case
				} else {
					System.out.print(s.charAt(s.length() - 1));
					teskari(s.substring(0, s.length() - 1));
				}
			}

			public static void main(String[] args) {

				teskari("Cybertek Institute");

			}
	}


