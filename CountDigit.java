
package Maths;
import java.util.*;
public class CountDigit {
	static int digit(int n) {
		int c=0;
		while(n>0) {
			n=n/10;
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		System.out.print(digit(n));
	}
}
