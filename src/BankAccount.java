class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double deposit(double deposit) {
        balance = balance + deposit;
        return balance;
    }

    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder + "\nBalance : " + balance);
    }
}