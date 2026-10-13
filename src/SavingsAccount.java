class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double addInterest() {
        double interest = balance * interestRate;
        balance = balance + interest;
        return interest;
    }
}