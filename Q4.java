package javaAssignment2;
import java.util.Arrays;

public class Q4 {
	
	
	public class SortHalfAscendingDescending {
	    public static void main(String[] args) {
	        int[] arr = {1, 90, 34, 89, 7, 9};
	        
	        // Sorting first half in ascending order
	        Arrays.sort(arr, 0, arr.length / 2);
	        
	        // Sorting second half in descending order
	        for (int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - i - 1];
	            arr[arr.length - i - 1] = temp;
	        }
	        
	        // Print the sorted array
	        System.out.println("Sorted array with first half in ascending and second half in descending:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


}
