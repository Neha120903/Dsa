package Maths;

public class Lcm {
	//naive solution
	static int lcm(int a, int b) {
		int res = Math.max(a, b);
		while(true) {
			if(res%a==0 && res%b==0)
				return res;
			res++;
		}
	}
	//Efficient solution => a*b = gcd(a,b) * lcm(a,b)
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	static int lcm1(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		System.out.println(lcm1(43,65));
	}
}
