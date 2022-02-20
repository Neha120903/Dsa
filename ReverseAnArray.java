package Array;
public class ReverseAnArray {
	public static void reverse(int[] arr) {       //10 20 30
		int low=0, high=arr.length-1;			//0 2
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
public static void main(String[] args) {
	int []arr= {10,20,30,40};
	reverse(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
