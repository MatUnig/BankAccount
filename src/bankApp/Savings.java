package bankApp;

public class Savings extends Account {

    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    public void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Account type: Savings");
    }
}
