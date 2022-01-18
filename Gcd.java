package Maths;
/* There is 3 ways to find the greatest common divisor 
 * 1- Naive solution : simply finding highest common divisor by finding the min value and find the
 * common factor by using for loop
 * euclidiean algorithm : it state that gcd(a,b) = gcd(a-b,b)
 */
public class Gcd {
	//Using euclidiean algo.
	static int gcd1(int a, int b) {
		while(a!=b) 
		{
			if(a>b) // 13>7   a= 13-7=6           a=6 b=1
				a= a-b;    	//a=6 b=7		a=5 b=1      a=4 b=1    a=3 b=1  a=2 b=1 a=1 b=1 
			else
				b=b-a;     //b=7-6=1  a=6 b=1
		}
		return a;  //a=1 
	}
	//optimised way
	static int gcd(int a, int b) {
		if(b==0)         
			return a;
		else
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd1(23,46)+" Normal solution");
		System.out.println(gcd(23,45)+" Optimised version");
	}

}
