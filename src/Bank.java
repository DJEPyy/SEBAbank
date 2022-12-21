import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String name, double balance) {
        accounts.put(name, new Account(balance));
    }

    public void addAccount(String name, Account account) {
        accounts.put(name, account);
    }

    public Account getAccount(String name) {
        return accounts.get(name);
    }
}

