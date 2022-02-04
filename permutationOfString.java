package Recursion;
import java.util.Scanner;
public class permutationOfString {
static void permute(String s,String ans ) {
	
	  if (s.length() == 0) {
          System.out.print(ans + " ");
          return;
      }

      for (int i = 0; i < s.length(); i++) {

          // ith character of s
          char ch = s.charAt(i);

          // Rest of the string after excluding 
          // the ith character
          String ros = s.substring(0, i) + 
                       s.substring(i + 1);

          // Recursive call
        permute(ros, ans + ch);
      }
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		permute(s,"");

	}

}
