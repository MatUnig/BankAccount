package bankApp;

import utils.CSV;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccApp {

    public static void main(String[] args) throws IOException {

        List<Account> accounts = new LinkedList<Account>();

        //Path to CVS file with account details
        String filePath = "/home/tosiak/Pobrane/NewBankAccounts.csv";
        List<String[]> newAccounts = CSV.read(filePath);
        for (String[] accHolder : newAccounts) {
            String name = accHolder[0];
            String sSN = accHolder[1];
            String accountType = accHolder[2];
            double initDeposit = Double.parseDouble(accHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name,sSN,initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name,sSN,initDeposit));
            } else {
                System.out.println("Error");
            }
        }
        for (Account acc: accounts){
            System.out.println("---- Next client ----");
            acc.showInfo();
        }


    }
}
