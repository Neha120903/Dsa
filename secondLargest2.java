package Array;
import java.util.*;
public class secondLargest2 {
public static int getsecond(int[]arr) {
	int res=-1 , largest=0;          // 5 20 12 20 8
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>arr[largest]) {  //5>20
			res=largest;  //res=5
			largest=i;         //largest=20
		}
		else if(arr[i]!=arr[largest]) {
			if(arr[i]>arr[res] || res==-1)  //20>5
				res=i;          //
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
	System.out.print(getsecond(arr));
}
}
