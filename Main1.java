package javaAssignment2;

class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

class LoanAccount extends Account {
    protected double interestRate;

    public LoanAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest calculated: " + interest);
    }
}

class HousingLoan extends LoanAccount {
    private int duration; // duration in months

    public HousingLoan(int accountNumber, double interestRate, int duration) {
        super(accountNumber, interestRate);
        this.duration = duration;
    }

    public void printLoanDetails() {
        System.out.println("Loan Account Number: " + accountNumber);
        System.out.println("Loan Duration: " + duration + " months");
        System.out.println("Loan Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


