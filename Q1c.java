package javaAssignment2;

public class Q1c {
	public class FibonacciArray {
	    public static void main(String[] args) {
	        int n = 10; // Change n to the desired value
	        generateFibonacci(n);
	    }

	    public static void generateFibonacci(int n) {
	        int[] fibArray = new int[n];
	        fibArray[0] = 0;
	        fibArray[1] = 1;

	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        System.out.print(fibArray[0] + " " + fibArray[1] + " ");

	        for (int i = 2; i < n; i++) {
	            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
	            System.out.print(fibArray[i] + " ");
	        }
	    }
	}


}
