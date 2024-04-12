package assignment3;

import java.util.ArrayList;

class Bank {
    private ArrayList<Customer> customers;
    private int MAX_SIZE;

    public Bank(int maxSize) {
        customers = new ArrayList<>();
        this.MAX_SIZE = maxSize;
    }

    public void addCustomer(Customer customer) {
        if (customers.size() < MAX_SIZE) {
            customers.add(customer);
        } else {
            System.out.println("Cannot add more customers. Bank is full.");
        }
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void displayAccountDetails() {
        for (Customer customer : customers) {
            customer.displayDetails();
            System.out.println("-----------------------------");
        }
    }

    public void updateCustomerDetails(Customer customer, String newName, String newAddress, String newMobileNumber) {
        customer.name = newName;
        customer.address = newAddress;
        customer.mobileNumber = newMobileNumber;
    }

    public void applyInterest(double interestRate) {
        for (Customer customer : customers) {
            double balance = customer.getAccount().getBalance();
            balance *= (1 + interestRate);
            customer.getAccount().deposit(balance);
        }
    }
}
