public class TransactionAccount {
    private String date;
    private String type;
    private double amount;

    public TransactionAccount(String date, String type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        TransactionAccount transactions = new TransactionAccount("1-1-2024", "Deposite", 100);

        transactions.getAmount();
        transactions.getDate();
        transactions.getType();

        System.out.println("banck amount : " + transactions.getAmount() + "\n" + "date : " + transactions.getDate()
                + "\n" + "Transaction Type : " + "" + transactions.getType());
    }

}
