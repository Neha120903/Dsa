package Array;
import java.util.*;
public class CheckIsSorted {
public static boolean isSorted(int[] arr) {
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1])
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,20,30};
		if(isSorted(arr))
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}

}
