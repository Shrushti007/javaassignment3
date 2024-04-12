package assignment3;

public class TestBank {

	public static void main(String[] args) {
		  
		    Account account1 = new Account(123, 1000);
	        Account account2 = new Account(456, 2000);

	        Customer customer1 = new Customer("Alice", "123 Main St", "923-456-7890", account1);
	        Customer customer2 = new Customer("Bob", "456 Elm St", "987-654-3210", account2);

	        
	        Bank bank = new Bank(10);

	        
	        bank.addCustomer(customer1);
	        bank.addCustomer(customer2);

	        
	        bank.displayAccountDetails();

	        
	        customer1.deposit(500);
	        customer2.withdraw(100);
	        customer1.transfer(customer2, 200);

	        
	        bank.displayAccountDetails();

	        
	        bank.updateCustomerDetails(customer1, "Alice Smith", "456 Oak St", "555-555-5555");

	        
	        bank.displayAccountDetails();

	        
	        bank.applyInterest(0.05);

	        // Display updated account details after interest application
	        bank.displayAccountDetails();
	    }
	


	}


