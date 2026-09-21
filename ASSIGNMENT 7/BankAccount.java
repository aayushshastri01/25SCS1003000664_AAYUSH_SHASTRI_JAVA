public class BankAccount {

    // Private data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    // Getter and Setter for Account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()
                && accountNumber.trim().length() >= 5) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid Account Number");
        }
    }

    // Getter and Setter for Account Holder Name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()
                && accountHolderName.trim().length() >= 3) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid Account Holder Name");
        }
    }

    // Getter and Setter for Balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Depositing: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount(
                "ACC1001",
                "Rahul Sharma",
                5000.0
        );

        // Display initial account details
        account.displayAccountDetails();

        // Deposit money
        account.deposit(2000);

        // Withdraw money
        account.withdraw(3000);

        // Display updated balance
        System.out.println("Updated Balance: " + account.getBalance());
    }
}