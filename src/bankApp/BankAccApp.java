package bankApp;

import utils.CSV;

import java.io.IOException;
import java.util.List;

public class BankAccApp {

    public static void main(String[] args) throws IOException {

        String filePath = 
//        Checking checkAccount = new Checking();
        List<String[]> newAccounts = CSV.read("NewBankAccount.csv");

    }
}
