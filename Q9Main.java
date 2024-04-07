package javaAssignment2;

public class Q9Main {
	public class Main {
	    public static void main(String[] args) {
	        SavingsAccount savingsAccount = new SavingsAccount(101, 5.0);
	        savingsAccount.deposit(5000);
	        savingsAccount.addInterest();
	        savingsAccount.printDetails();

	        HousingLoan housingLoan = new HousingLoan(201, 8.0, 120);
	        housingLoan.deposit(100000);
	        housingLoan.calculateInterest();
	        housingLoan.printLoanDetails();
	    }
	}
}
