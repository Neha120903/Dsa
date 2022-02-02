package Recursion;
import java.util.*;
public class sumOfDigit {     //iterative solution is better because of less overhead
static int sum(int n) {
	if(n==0)
		return 0;            //123
	return sum(n/10)+n%10;   //123/10=12 123%10=3
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(sum(n));
	}
}
