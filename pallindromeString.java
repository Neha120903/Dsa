package Recursion;
import java.util.*;
public class pallindromeString {
static boolean isPalindrome(String s,int strt, int end) {
	if(strt>=end)
		return true;
	return (s.charAt(strt)==s.charAt(end) && isPalindrome(s,strt+1,end-1));
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(isPalindrome(s,0,s.length()-1));
	}

}
