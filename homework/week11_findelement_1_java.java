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
    
    public static int findElement(int[] arr, int n) {
        int[] leftMax = new int[n];
        leftMax[0] = intMin(arr);
        int rightMin = intMax(arr);
        
        for(int i=1; i<n; i++) {
            if(leftMax[i-1] > arr[i-1]) leftMax[i] = leftMax[i-1];
            else leftMax[i] = arr[i-1];
        }
        
        for(int i=n-1; i>=0; i--) {
            if(leftMax[i] < arr[i] && rightMin > arr[i]) return i;
            if(rightMin > arr[i]) rightMin = arr[i];
        }
        
        return -1;
    }
    
	public static void main (String[] args) {
	    int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
	    int n = arr.length;
	    int idx = findElement(arr, n);
	    
		System.out.println(idx);
	}
}