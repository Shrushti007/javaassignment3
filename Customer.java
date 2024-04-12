package assignment3;

class Customer {
    public String name;
    public String address;
    public String mobileNumber;
    public Account account;

    public Customer(String name, String address, String mobileNumber, Account account) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void transfer(Customer recipient, double amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            recipient.deposit(amount);
        } else {
            System.out.println("Transfer failed: Insufficient funds");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
