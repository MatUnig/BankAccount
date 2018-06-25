package bankApp;

public abstract class Account implements IRate {

    private String name;
    private String sSN;
    protected String accountNumber;
    private double balance;
    protected double rate;
    private static int index = 10000;


    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public void deposit(double amount) {
        balance = balance + amount;
        showBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        showBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering " + amount + " to : " + toWhere);
        showBalance();
    }

    public void showBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance = balance + accruedInterest;
        showBalance();
    }

    public abstract void setRate();

    public String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int random = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + random;

    }

    public void showInfo() {
        System.out.println(
                "Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance
        );
    }
}
