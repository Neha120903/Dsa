package Maths;
import java.util.*;
//Palindrome number is same when reversed
public class Palindrome {
		static boolean Pallindrome(int n) {
			int rev =0;
			int t=n;
			while(n>0) {
				int ld=n%10; 
				rev = rev*10+ld;
				n=n/10;
			}
			return (rev==t);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		System.out.print(Pallindrome(n));
	}

}

