package Recursion;
import java.util.*;
public class printNto1 {
static void fun(int n) {
	if(n==0)
		return;
	System.out.println(n);
	fun(n-1);
}
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	fun(n);
}
}
