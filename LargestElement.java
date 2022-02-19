package Array;
import java.util.*;
public class LargestElement {
	public static int largest(int [] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	System.out.print(largest(arr));
}
}
