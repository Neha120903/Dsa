package Recursion;
import java.util.*;
//In this problem we have 3 towers(A B B) having disk in each one. B tower is used as auxiliary tower
//to move the disc from A to C such that the order of the disk must be same and n is the number of disc
public class TowerOfHanoi {
	static void TOH(int n, char A, char B , char C) {
		if(n==1) {
			System.out.println("Move 1 from"+ A+"to"+C); // here tower c is used as auxi. 
			return;}
		TOH(n-1,A,C,B);
		System.out.println("Move"+n+"from"+A+"to"+C);
		TOH(n-1,B,A,C); //Tower A is used as auxiliary here
	}
	public static void main(String[] args) {
		

	}

}
