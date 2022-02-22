package Array;

public class MoveZerosToEnd {
public static void moveZeros(int[] arr) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp= arr[i];
			arr[i]=arr[count];
			arr[count]=temp;
			count++;           //We only swap the values of a non zero and zero value otherwise the
			//non zero value is replaced by itself
		}
	}
}
public static void main(String[] args) {
	int[] arr= {10,10,0,0,10};
	moveZeros(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
