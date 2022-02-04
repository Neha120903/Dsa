package Recursion;
import java.util.*;
//We are provided an array and sum we have to find the number of pairs for that sum in the array
public class subsetSumProblem {
	static int countSubsets(int arr[], int n, int sum) {
		if(n==0)
			return (sum==0)?1:0;
		return countSubsets(arr,n-1,sum)     //Excluding the elemnts
				+countSubsets(arr,n-1,sum-arr[n-1]); //Including the elements
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter the elements of array");
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println("Enter the sum");
	int sum = sc.nextInt();
	System.out.println(countSubsets(arr,n,sum));
}
}
