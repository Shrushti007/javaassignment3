package assignment3;

class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    // Constructor to initialize savings balance
    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

