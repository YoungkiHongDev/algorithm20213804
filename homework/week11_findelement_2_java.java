/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static int intMax(int[] arr) {
        int max = arr[0];
        for(int item : arr) {
            if(item > max) max = item;
        }
        return max;
    }
    
    public static int intMin(int[] arr) {
        int min = arr[0];
        for(int item : arr) {
            if(item < min) min = item;
        }
        return min;
    }
    
    public static void findElement(int[] arr, int n) {
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        leftMax[0] = intMin(arr);
        rightMin[n-1] = intMax(arr);
        int sts = 0;
        
        for(int i=1; i<n; i++) {
            if(leftMax[i-1] > arr[i-1]) leftMax[i] = leftMax[i-1];
            else leftMax[i] = arr[i-1];
        }
        
        for(int i=n-2; i>=0; i--) {
            if(rightMin[i+1] < arr[i+1]) rightMin[i] = arr[i+1];
            else rightMin[i] = rightMin[i+1];
        }
        
        for(int i=0; i<n; i++) {
            if(leftMax[i] < arr[i] && rightMin[i] > arr[i]) {
                System.out.println(i);
                sts = 1;
            }
        }
        
        if(sts == 0) {
            System.out.println("-1");
        }
    }
    
	public static void main (String[] args) {
	    int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
	    int n = arr.length;
	    findElement(arr, n);
	}
}