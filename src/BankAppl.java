public class BankAppl {
    private Bank bank;
    private Account account;

    public BankAppl(Bank bank) {
        this.bank = bank;
    }


    public void createAccount(String name, double balance) {
        bank.createAccount(name, balance);
    }

    public void transfer(String fromAccountName, String toAccountName, double amount) {
        Account fromAccount = bank.getAccount(fromAccountName);
        Account toAccount = bank.getAccount(toAccountName);
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    public void payBill(String accountName, double amount) {
        Account account = bank.getAccount(accountName);
        account.withdraw(amount);
    }

    public double getBalance(String accountName) {
        Account account = bank.getAccount(accountName);
        return account.getBalance();
    }

    public void deposit(String accountName, double amount) {
        Account account = bank.getAccount(accountName);
        account.deposit(amount);
    }

    public void withdraw(String accountName, double amount) {
        Account account = bank.getAccount(accountName);
        account.withdraw(amount);
    }
}
