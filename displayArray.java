import java.util.*;
public class displayArray {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt(); 
    }
	displayArr(arr,n);
}

public static void displayArr(int[] arr, int index) {
    if(index==arr.length){
        return;
    }
    System.out.println(arr[index]);
    displayArr(arr,index+1);
    }
}
