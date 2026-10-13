public class Main {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("Jelres", 10000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("Jelres", 10000);

        savings.displayBalance();

        savings.deposit(500);
        savings.addInterest();

        savings.displayBalance();

        checkingAccount.displayBalance();

        checkingAccount.withdraw(550);

    }
}