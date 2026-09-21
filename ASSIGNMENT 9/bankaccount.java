class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    static double interestRate = 5.0;

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.accountNumber = 659;
        account1.accountHolderName = "kushagra";
        account1.balance = 99999;

        account1.display();
    }
}