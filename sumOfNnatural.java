package Recursion;
import java.util.*;
public class sumOfNnatural {
static int getSum(int n) {
	if(n==0)
		return 0;
	return n+getSum(n-1);
}
public static void main(String[] main) {
	Scanner s= new Scanner(System.in);
	int n= s.nextInt();
	System.out.println(getSum(n));
}
}
