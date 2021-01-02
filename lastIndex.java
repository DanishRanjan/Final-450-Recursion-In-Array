import java.util.*;
public class lastIndex {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int idx = sc.nextInt();
    int x = sc.nextInt();
    System.out.println(lastAppearances(arr,idx,x));
}
public static int lastAppearances(int[] arr, int idx, int x) {
    if (idx == arr.length) {
        return -1;
    }

    //liisa = last index in smaller array
    int liisa = lastAppearances(arr, idx + 1, x);
    if (liisa == -1) {
        if(arr[idx]==x) {
        	return idx;
        }
        else {
        	return -1;
        }
    } else {
        return liisa;
    }

}
}
