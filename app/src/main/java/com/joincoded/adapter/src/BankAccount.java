import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transacationHistory;

    public BankAccount(String accountNumber, double intialBalance, List<String> transacationHistory) {
        this.accountNumber = accountNumber;
        this.balance = intialBalance;
        this.transacationHistory = transacationHistory;
    }

    //public List<String> getUser() {
    //    return user;
    //}

    //public void setUser(List<String> user) {
    //    this.user = user;
    //}

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<String> getTransacationHistory() {
        return transacationHistory;
    }

    public void setTransacationHistory(List<String> transacationHistory) {
        this.transacationHistory = transacationHistory;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposite(double amount) {
        String transction = "+ " + amount;
        transacationHistory.add(transction);
        System.out.println("deposited " + amount + "KWD");
    }

    public void withdarw(double amount) {
        if (balance >= 0) {
            amount -= balance;
            String transction = " -" + amount;
            transacationHistory.add(transction);
            System.out.println("withdraw " + amount + "KWD");

        }
    }

    public void displayTransction() {
        System.out.println("[Transction History for account " + accountNumber + " ]");
        for (String transaction : transacationHistory) {
            System.out.println(transaction);
        }

    }

    /// private void recordTransaction(String transaction) {
    /// transacationHistory.add(transaction);
    /// }

}