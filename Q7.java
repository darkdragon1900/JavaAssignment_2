package javaAssignment2;
import java.util.Arrays;

public class Q7 {
	
	public class MatrixRotation {
	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        rotateMatrix(matrix);

	        System.out.println("\nMatrix after 90 degree clockwise rotation:");
	        printMatrix(matrix);
	    }

	    public static void rotateMatrix(int[][] matrix) {
	        // Transpose the matrix
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = i; j < matrix[0].length; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

	        // Reverse each row
	        for (int i = 0; i < matrix.length; i++) {
	            int start = 0;
	            int end = matrix[0].length - 1;
	            while (start < end) {
	                int temp = matrix[i][start];
	                matrix[i][start] = matrix[i][end];
	                matrix[i][end] = temp;
	                start++;
	                end--;
	            }
	        }
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            System.out.println(Arrays.toString(row));
	        }
	    }
	}

}
