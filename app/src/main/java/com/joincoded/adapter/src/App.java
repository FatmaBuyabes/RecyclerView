import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter your Username");
        String username = myscanner.nextLine();

        System.out.println("Enter your password");
        String password = myscanner.nextLine();

        System.out.println("username:" + username);
        System.out.println("password: " + password);

        System.out.println(myscanner.toString());
        myscanner.close();

        BankAccount a1 = new BankAccount("1234", 1000, null, null);
        a1.getAccountNumber();
        a1.getBalance();
        a1.getUser();
        a1.getTransacationHistory();

        System.out.printf("", a1);

        a1.deposite(100);
        a1.withdarw(50);
        a1.deposite(50);
        a1.withdarw(20);

    }

}
