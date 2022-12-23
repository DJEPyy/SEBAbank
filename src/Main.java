public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank();
    BankAppl bankAppl = new BankAppl(bank);
    BankFacade facade = new BankFacade(bankAppl);
    BankAppGui gui = new BankAppGui(facade);
    gui.setVisible(true);
    gui.setSize(600, 150);
  }
}
