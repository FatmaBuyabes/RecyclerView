import java.util.ArrayList;
import java.util.List;

public class BankSingelton {

    private static BankSingelton instance;
    private List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public BankSingelton(List<User> users) {

        this.users = users;
    }

    private BankSingelton() {
        users = new ArrayList<>();
    }

    public static BankSingelton getInstance() {
        if (instance == null) {
            instance = new BankSingelton();
        }
        return instance;
    }

    public static void setInstance(BankSingelton instance) {
        BankSingelton.instance = instance;
    }

    public boolean createBankAccount(String username, String password, String accountNumber) {
        for (User existingUser : users) {
            if (existingUser.getUsername().equals(username)) {
                System.out.println("Username already exists. Please choose a different username.");
                return false;
            }
        }
        return false;
    }

    /// private String generateAccountNumber(){
    /// return String .valueOf(System.currentTimeMillis());

    /// }

    /// BankAccount newAccount = new BankAccount(generateAccountNumber(), 0, users,
    /// null);

    ///// User newUser = new User("fatma", "1234", "12345");

    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                System.out.println("Authentication successful. Welcome, " + username + "!");
                return true;
            }
            return false;
        }

        System.out.println("Authentication failed. Please check your username and password.");
        return false;
    }

    public void displayAccountDetails(String username) {

        for (User user : users) {

            BankAccount account = user.getAccount();
            System.out.println("Account Details for: " + account.getUser());
            System.out.println("Account Number " + account.getAccountNumber());
            System.out.println("Balance: : " + account.getBalance());
            System.out.println("Account Details for: " + account.getUser());
            return;

        }
    }

}
