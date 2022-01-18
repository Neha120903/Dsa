package Maths;
public class factorial {
	static int f1(int n) {
		if(n==0 || n==1) 
			return n;
		return n*f1(n-1);
	}
	static int f2(int n) {
		int p=1;
		//if(n==0 || n==1)
		//	return n;
		while(n>0) {
			p=p*n;
			n--;
		}
		return p;
	}
	public static void main(String[] args) {
		System.out.println(f1(98));
		System.out.println(f2(48));
	}
}
