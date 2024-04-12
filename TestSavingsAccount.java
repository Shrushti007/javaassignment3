package assignment3;

public class TestSavingsAccount {

	public static void main(String[] args) {
		 SavingsAccount saver1 = new SavingsAccount(2000.00);
	        SavingsAccount saver2 = new SavingsAccount(3000.00);

	        SavingsAccount.modifyInterestRate(0.03);
	        System.out.println("Annual interest rate set to 3 percent");

	        saver1.calculateMonthlyInterest();
	        saver2.calculateMonthlyInterest();
	        System.out.println("New balance for saver1: " + saver1.getSavingsBalance());
	        System.out.println("New balance for saver2: " + saver2.getSavingsBalance());

	        SavingsAccount.modifyInterestRate(0.04);
	        System.out.println("\nAnnual interest rate set to 4 percent");

	        saver1.calculateMonthlyInterest();
	        saver2.calculateMonthlyInterest();
	        System.out.println("New balance for saver1: " + saver1.getSavingsBalance());
	        System.out.println("New balance for saver2: " + saver2.getSavingsBalance());
	 
	}

}
