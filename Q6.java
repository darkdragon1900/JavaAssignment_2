package javaAssignment2;
import java.util.Arrays;
public class Q6 {
	

	public class ArrayRotation {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int rotationSteps = 2; // Change this value to specify the number of rotation steps
	        
	        // Right Rotation
	        rotateRight(arr, rotationSteps);
	        System.out.println("Array after right rotation: " + Arrays.toString(arr));

	        // Left Rotation
	        rotateLeft(arr, rotationSteps);
	        System.out.println("Array after left rotation: " + Arrays.toString(arr));
	    }

	    public static void rotateRight(int[] arr, int steps) {
	        int length = arr.length;
	        steps = steps % length; // handle steps greater than array length
	        reverseArray(arr, 0, length - 1);
	        reverseArray(arr, 0, steps - 1);
	        reverseArray(arr, steps, length - 1);
	    }

	    public static void rotateLeft(int[] arr, int steps) {
	        int length = arr.length;
	        steps = steps % length; // handle steps greater than array length
	        reverseArray(arr, 0, length - 1);
	        reverseArray(arr, 0, length - steps - 1);
	        reverseArray(arr, length - steps, length - 1);
	    }

	    public static void reverseArray(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

}
	        
	    }
	}
}
