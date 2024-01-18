public class User {

    private String username;
    private String password;
    private BankAccount account;

    public User( String username, String password, BankAccount account) {
        
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public User(String username2, String password2, String string) {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public static void main(String[] args) {
        User myUser = new User("1234", "fatma", "123");

        System.out.println(myUser.getUsername());
        System.out.println(myUser.getAccount().getAccountNumber());

    }

    public boolean authenticate(String password) {
        return false;
    }

    public String getBalance() {
        return null;
    }
}
