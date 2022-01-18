package Maths;
//Trailing zeros in factorial of a given number
/* it starts from the factorial from 5 that is 120  15/5=3 there is 3 zeros
 */
public class TrailingZeroFac{
	//Efficient way of doing this
	static int Tariling(int n) {
		int res=0;
		for(int i=5 ;i<=n;i=i*5)           // 225 = 251/5 = 50 res= 0+50=50
			res = res+n/i;    				// 25<=251 = 251/25= 10 res=60
		return res;							//125<=251 =251/125 = 2 res =62
	}
	public static void main(String[] args) {
		System.out.println(Tariling(2515));
	}
}