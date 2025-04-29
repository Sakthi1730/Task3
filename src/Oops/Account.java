package Oops;

public class Account {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public Account() {
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    public Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String toString() {
        return "Account[Holder=" + accountHolder + ", AccountNumber=" + accountNumber + ", Balance=" + balance + "]";
    }
}

