package victoria;

public class Palindrome {

	public static boolean isPalindrome (String str) {
        if(str==null)
            return false;
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
        
    }
    public static void main(String[] args) {
        String str = "feruza";
        System.out.println(isPalindrome(str));
    }
}
