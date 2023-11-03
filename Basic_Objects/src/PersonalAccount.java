import java.util.ArrayList;

class Amount {
    private double amount;
    private String transactionType;


    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }


    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
}

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        Amount deposit = new Amount(amount, "Deposit");
        transactions.add(deposit);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            Amount withdrawal = new Amount(amount, "Withdrawal");
            transactions.add(withdrawal);
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account Number: " + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println("Type: " + transaction.getTransactionType() + ", Amount: " + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public static void main(String[] args) {
        PersonalAccount myAccount = new PersonalAccount(12345, "John Doe");

        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.deposit(200);
        myAccount.withdraw(300);

        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Current Balance: " + myAccount.getBalance());
        myAccount.printTransactionHistory();
    }
}