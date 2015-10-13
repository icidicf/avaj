import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class getCMListFromGroup {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("([0-9A-Fa-f]{4}[\\.]){2}([0-9A-Fa-f]{4})");
        BufferedReader br = null; 
        StringBuilder sbuilder = new StringBuilder();
        try {
            String sCurline ;
            br = new BufferedReader(new FileReader("./input"));
            while ((sCurline = br.readLine()) != null) {
                sbuilder.append(sCurline);
                sbuilder.append(System.getProperty("line.separator"));
                //System.out.println("lyp" + sCurline);
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

        String s = sbuilder.toString();
        Matcher matcher= pat.matcher(s);
        while(matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

        System.out.println(s);
    }
}
