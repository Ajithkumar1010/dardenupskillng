package day2;

class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    private double fixedDeposits;

    public SavingAccount(double balance, double fixedDeposits) {
        super(balance);
        this.fixedDeposits = fixedDeposits;
    }

    @Override
    public double getBalance() {
        return super.getBalance() + fixedDeposits;
    }
}

class CurrentAccount extends BankAccount {
    private double cashCredit;

    public CurrentAccount(double balance, double cashCredit) {
        super(balance);
        this.cashCredit = cashCredit;
    }

    @Override
    public double getBalance() {
        return super.getBalance() + cashCredit;
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(50000, 10000);
        CurrentAccount currentAccount = new CurrentAccount(30000, 5000);

        BankAccount[] accounts = { savingAccount, currentAccount };

        double totalCash = calculateTotalCash(accounts);
        System.out.println("Total cash in the bank: " + totalCash);
    }

    public static double calculateTotalCash(BankAccount[] accounts) {
        double total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}

