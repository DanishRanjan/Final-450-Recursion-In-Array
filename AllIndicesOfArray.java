import java.util.*;

public class AllIndicesOfArray {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int data = sc.nextInt();
	int[] iarr = allIndices(arr, data, 0, 0);
	if(iarr.length==0) {
		System.out.println();
		return;
	}
	for(int i=0;i<iarr.length;i++) {
		System.out.print(iarr[i]+" ");
	}
}
//x=data
//fsf = found so far

public static int[] allIndices(int[] arr, int x, int idx, int fsf ) {
	if(idx == arr.length) {
		return new int[fsf];
	}
	
	if(arr[idx] == x) {
		int[] iarr = allIndices(arr, x, idx+1, fsf+1);
		iarr[fsf] = idx;
		return iarr;
	}
	else {
		int[] iarr = allIndices(arr, x, idx+1, fsf);
		return iarr;
	}
}
}
