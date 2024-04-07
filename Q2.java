package javaAssignment2;
import java.util.Scanner;
public class Q2 {
	

	public class HarshadNumberCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if (isHarshadNumber(number)) {
	            System.out.println(number + " is a Harshad number.");
	        } else {
	            System.out.println(number + " is not a Harshad number.");
	        }
	    }

	    public static boolean isHarshadNumber(int number) {
	        int sumOfDigits = sumDigits(number);
	        return number % sumOfDigits == 0;
	    }

	    public static int sumDigits(int number) {
	        int sum = 0;
	        while (number > 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	        return sum;
	    }
	}


}
