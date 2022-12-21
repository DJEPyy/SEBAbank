public class BankFacade {
  private BankAppl facade;

  public BankFacade(BankAppl facade) {
    this.facade = facade;
  }

  public void transfer(String fromAccountName, String toAccountName, double amount) {
    facade.transfer(fromAccountName, toAccountName, amount);
  }

  public void payBill(String accountName, double amount) {
    facade.payBill(accountName, amount);
  }

  public double getBalance(String accountName) {
    return facade.getBalance(accountName);
  }
}
