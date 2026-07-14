import java.util.Date;

// Parent Class
class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String createdDate;

    // Parent Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.createdDate = new Date().toString();

        System.out.println("Account Created: " + accountNumber);
    }

    // Parent Method
    public double calculateInterest() {
        return balance * 0.04; // 4% Interest
    }

    public void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : $" + balance);
        System.out.println("Created Date   : " + createdDate);
    }
}

// Child Class
class SavingsAccount extends BankAccount {
    private String accountType;
    private double bonus;

    // Child Constructor
    public SavingsAccount(String accountNumber, double balance, String accountType) {
        super(accountNumber, balance);

        this.accountType = accountType;
        this.bonus = balance * 0.02;

        System.out.println("Bonus          : $" + bonus);
        System.out.println("Account Type   : " + accountType);
    }

    // Method Overriding
    @Override
    public double calculateInterest() {

        double baseInterest = super.calculateInterest();
        double extraInterest = balance * 0.03;

        double totalInterest = baseInterest + extraInterest;

        System.out.println("Total Interest : $" + totalInterest);

        return totalInterest;
    }

    // Method Overriding
    @Override
    public void displayAccount() {

        super.displayAccount();

        System.out.println("Account Type   : " + accountType);
        System.out.println("Bonus          : $" + bonus);
    }
}

// Main Class
public class BankApp {
    public static void main(String[] args) {

        // Object Creation
        SavingsAccount account = new SavingsAccount("ACC101", 10000, "Savings");
        account.displayAccount();
        account.calculateInterest();
    }
}