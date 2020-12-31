import java.util.*;
public class MaxOfAnArray {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(maxOfArray(arr, 0));
}
public static int maxOfArray(int[] arr, int index) {
	if(index==arr.length-1) 
	{
		return arr[index];
	}
	
	//misa = maximum in smaller array
	
	int misa = maxOfArray(arr, index+1);
	if(misa>arr[index]) {
		return misa;
	}
	else {
		return arr[index];
	}
	
}
}
