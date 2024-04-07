package javaAssignment2;
import java.util.Scanner;

public class Q3 {
	
	public class FactorialUsingRecursion {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a non-negative integer: ");
	        int n = scanner.nextInt();
	        
	        if (n < 0) {
	            System.out.println("Please enter a non-negative integer.");
	        } else {
	            long factorial = calculateFactorial(n);
	            System.out.println("Factorial of " + n + " is: " + factorial);
	        }
	    }

	    public static long calculateFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	}

}
