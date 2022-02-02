package Recursion;
import java.util.*;
//In this problem we are given a rope of length n our task is to cut that into max number of pieces
//such that every piece as length either as a,b,c
public class RopeCuttingProblem {
	static int maxPiece(int n, int a, int b, int c) {
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int res= Math.max(maxPiece(n-a,a,b,c),Math.max (maxPiece(n-b,a,b,c),maxPiece(n-c,a,b,c)));
		if(res==-1) return -1;
		return res+1;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a= sc.nextInt();
	int b= sc.nextInt();
	int c= sc.nextInt();
	System.out.println(maxPiece(n,a,b,c));
}
}
