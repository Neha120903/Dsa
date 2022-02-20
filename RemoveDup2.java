package Array;

public class RemoveDup2 {
	public static int rmvDup(int[] arr) {
		int res=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		
		return res;
	}
public static void main(String[] args) {
	int[]arr= {10,10,10};
	System.out.print(rmvDup(arr));
}
}
