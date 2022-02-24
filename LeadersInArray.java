package Array;

public class LeadersInArray {
public static void leaders(int[] arr) {
	int n=arr.length;
	int curr_leader=arr[n-1];
	System.out.print(curr_leader+" ");
	for(int i=n-2;i>=0;i--) {
		if(curr_leader<arr[i]) {
			curr_leader=arr[i];
			System.out.print(curr_leader+" ");
		}
	}
}
	public static void main(String[] args) {
		int[] arr= {12,3,4,56,2,1};
		leaders(arr);

	}

}
