import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAppGui extends JFrame{

private BankFacade facade;
private JTextField balanceField;
private JTextField amountField;
private JTextField fromField;
private JTextField toField;

private JLabel balanceLabel;
private JLabel amountLabel;
private JLabel fromLabel;
private JLabel toLabel;
private JButton transferButton;
private JButton payBillButton;
private JButton balanceButton;

public BankAppGui(BankFacade facade) {
        this.facade = facade;

        // Set the title and layout of the frame
        setTitle("Bank App");
        setLayout(new FlowLayout());

        // Create and add the balance field
        add(new JLabel("Balance"));
        balanceField = new JTextField(10);
        balanceField.setEditable(false);
        add(balanceField);

        // Create and add the amount field
        add(new JLabel("Amount"));
        amountField = new JTextField(10);
        add(amountField);



        // Create and add the from field
        add(new JLabel("From"));
        fromField = new JTextField(10);
        add(fromField);

        // Create and add the to field
        add(new JLabel("To"));
        toField = new JTextField(10);
        add(toField);

        // Create and add the transfer button
        transferButton = new JButton("Transfer");
        add(transferButton);

        // Create and add the pay bill button
        payBillButton = new JButton("Pay Bill");
        add(payBillButton);


        // Create and add the balance button
        balanceButton = new JButton("Balance");
        add(balanceButton);

        // Add action listeners to the buttons
        transferButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        String fromAccount = fromField.getText();
        String toAccount = toField.getText();
        double amount = Double.parseDouble(amountField.getText());
        facade.transfer(fromAccount, toAccount, amount);
        }
        });

        // Create and add the create account button
        JButton createButton = new JButton("Create Account");
        add(createButton);

// Add action listener to the create button
        createButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        String name = fromField.getText();
        double balance = 0;

        // Check that the name field is not empty
        if (name.length() == 0) {
        JOptionPane.showMessageDialog(BankAppGui.this, "Please enter a name.");
        return;
        }

        // Check that the balance field contains a valid number
        try {
        balance = Double.parseDouble(amountField.getText());
        } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(BankAppGui.this, "Please enter a valid balance.");
        return;
        }

        // If both checks pass, create the account
        facade.createAccount(name, balance);
        JOptionPane.showMessageDialog(null, "Account created.");
        }
        });

        payBillButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        String account = fromField.getText();
        double amount = Double.parseDouble(amountField.getText());
        facade.payBill(account, amount);
        }
        });

        balanceButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        String account = fromField.getText();
        double balance = facade.getBalance(account);
        balanceField.setText(Double.toString(balance));
        }
        });
        }}