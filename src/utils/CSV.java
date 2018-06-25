package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //Read data from CSV file and return a list
    public static List<String[]> read(String file) throws IOException {
        List<String[]>  data = new LinkedList<String[]>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String dataRow;
        while ((dataRow = br.readLine()) != null) {
            String[] dataRecord = dataRow.split(",");
            data.add(dataRecord);
        }
        return data;
    }
}
