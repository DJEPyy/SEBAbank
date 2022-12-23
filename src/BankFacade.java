public class BankFacade {
  private BankAppl bankapp;
  private Bank bank;
  private Account account;



  public BankFacade(BankAppl facade) {
    this.bankapp = facade;
  }

  public void transfer(String fromAccountName, String toAccountName, double amount) {
    bankapp.transfer(fromAccountName, toAccountName, amount);
  }

  public void payBill(String accountName, double amount) {
    bankapp.payBill(accountName, amount);
  }

  public double getBalance(String accountName) {
    return bankapp.getBalance(accountName);
  }

  public void createAccount(String name, double balance) {
    bankapp.createAccount(name, balance);
  }
  public void deposit(String accountName, double amount) {
    bankapp.deposit(accountName, amount);
  }

  public void withdraw(String accountName, double amount) {
    bankapp.withdraw(accountName, amount);
  }

}
