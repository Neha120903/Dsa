package Maths;

public class AllDivisor {
	//Naive solution
	static void divisor(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
		}
	}
	//Efficient solution
	
	static void divisor1(int n) {
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				if(i!=n/i)
					System.out.println(n/i);
			}
		}
	}
	//Optimized solution
	static void divisor2(int n) {
		int i;
		for(i=1; i*i<n; i++) {
			if(n%i==0)
				System.out.println(i);
		}
		for(;i>=1;i--) {
			if(n%i==0)
				System.out.println(n/i);
		}
	}
	public static void main(String[] args) {
		divisor2(1024);
	}
}
