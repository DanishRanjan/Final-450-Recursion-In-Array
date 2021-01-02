import java.util.*;
public class FirstIndex {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr  = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int index = sc.nextInt();
	int data = sc.nextInt();
	System.out.println(firstAppearances(arr, index, data));
}
public static int firstAppearances(int[] arr, int index, int data) {
	if(index==arr.length) {
		return -1;
	}
	if(arr[index]==data) {
		return index;
	}
	else {
		//fissa = first index in small array
		int fiisa = firstAppearances(arr, index+1, data);
		return fiisa;
	}
}
}
