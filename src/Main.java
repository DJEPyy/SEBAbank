public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank();
    BankAppl bankAppl = new BankAppl(bank);
    BankFacade facade = new BankFacade(bankAppl);
    BankAppGui gui = new BankAppGui(bankAppl);
    gui.setVisible(true);
    gui.setSize(400, 200);

  }
}
