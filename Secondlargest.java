package Array;
import java.util.*;
public class Secondlargest {
	public static int largest(int [] arr) {
			int max=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>arr[max])
					max=i;
			}
			return max;
		}
	public static int secondlargest(int[] arr) {
		int largest = largest(arr);
		int res=-1;    //Array can have all duplicate values
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[largest]) {          //10 29 30 50 i=3!=0
				if(res==-1)
					res=i;
				else {
					if(arr[i]>arr[res])
						res=i;
			}
		}
	}
		return res;
}
public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print(secondlargest(arr));
	}
}
