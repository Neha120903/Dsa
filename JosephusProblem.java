package Recursion;
import java.util.*;
//The problem says that there are n people standing in a circle we need to kill kth person in every 
//iteration and this has to be done in a circular manner. After repeatedly doing it we need to find 
//position of the survival
public class JosephusProblem {
static int jos(int n, int k) {
	if(n==1)
		return 0;
	return (jos(n-1,k)+k)%n;          //better solution in dynamic programming
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt();
		System.out.println(jos(n,k));
	}

}
