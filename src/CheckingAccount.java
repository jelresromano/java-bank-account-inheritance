class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }


    public double withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;

            System.out.println("Withdraw success");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }

        return balance;
    }

}
