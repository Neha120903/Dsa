package Maths;

public class prime {
	static boolean isPrime(int n) {
		if(n ==1 || n==0)
			return false;
		for(int i=2; i<n;i++) {  
			if(n%i==0)
				return false;
		}
		return true;          //Time complexity - BigO(n)g
	}
	//Efficient solution
	static boolean Prime(int n) {
		if(n ==0 || n==1)
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;			 //Time complexity - BigO(sqrtn)g
	}
	//More efficient solution 
	static boolean Prime1(int n) {
		if(n==0 || n==1)
			return false;
		if(n==2|| n==3)
			return true;
		for(int i=5; i*i<=n;i=i+6) {               // 5 7 11 13 17 ....
			if(n%i==0 && n%(i+2) ==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(2));
	}
}
