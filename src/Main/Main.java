package Main;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] unsorted = new int[3001];
        int[] sorted = new int[3001];
        BufferedReader br = null;
        FileReader unsorted_file, sorted_file;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            unsorted_file = new FileReader("numbers.txt");
            sorted_file = new FileReader("ordered_numbers.txt");
            br = new BufferedReader(unsorted_file);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

}
