import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class getCMListFromGroup {
    public static void main(String[] args) {
        BufferedReader br = null; 
        try {
            String sCurline ;
            br = new BufferedReader(new FileReader("./input"));
            while ((sCurline = br.readLine()) != null) {
                System.out.println("lyp" + sCurline);
             }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
}
