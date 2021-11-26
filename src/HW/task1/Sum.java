package HW.task1;

import java.io.BufferedReader;
import java.io.IOException;

public class Sum {
    public void run(BufferedReader reader) {
        System.out.println("Please enter string");

        try {
            String text = reader.readLine();
            char[] chars = text.toCharArray();
            for (char aChar : chars) {
                System.out.println("aCahr = " + aChar);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
