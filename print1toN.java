package Recursion;
import java.util.*;
public class print1toN {
static void fun(int n) {
	if(n==0)     //Base case
		return;
	fun(n-1);
	System.out.println(n);
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
	fun(n);
}
}
