/*
Gerardo Pineda 18848
Sara Zavala 18893
Estuardo Ureta
Estructuras de Dast
Main.java
Clase Main
*/
//package Main;

import java.util.*;
import java.io.*;

//Se abre y lee un archivo, se generam 3000 numeros
//y se implementan los sorts conforme se van cambiando uno por uno
public class Main {
    public static void main(String[] args) throws IOException {
        int[] unsorted = new int[3000];
        int[] temp;
        int[] sorted = new int[3000];
        String sorted_file_path = "C:\\Users\\user\\Documents\\GitHub\\Hoja3\\src\\Main\\ordered_numbers.txt";
        String unsorted_file_path = "C:\\Users\\user\\Documents\\GitHub\\Hoja3\\src\\Main\\numbers.txt";
        final String DELIMITADOR = " \t\n\r\fABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz|°!\"#$%&()=?¡¿'\\´¨[]{}_-:.;,^`¬~";
        BufferedReader br = null;
        Sorts sort = new Sorts();
        String all_lines = null;
        // Direcciones de los documentos txt
        FileReader sorted_file = null;
        FileReader unsorted_file = null;
        try {
            // Se leen los textos
            unsorted_file = new FileReader(sorted_file_path);
            sorted_file = new FileReader(unsorted_file_path);
            br = new BufferedReader(unsorted_file);

            String sCurrentLine;

            int val, cont;
            while ((sCurrentLine = br.readLine()) != null) {
                all_lines += sCurrentLine + "\t";

            }
            StringTokenizer token = new StringTokenizer(all_lines, DELIMITADOR);
            all_lines = null;
            br.close();
            // despues de leer el archivo correr sort.
            // gnome radix merge quick bubble

            temp = unsorted;
            while (token.hasMoreTokens()){
                for (int i = 0; i < unsorted.length; i++) {
                    unsorted[i] = Integer.parseInt(token.nextToken());
                }
            }
            //Se crea una lista y se llena con los 3000 valores
            int[] res = new int[3000];
            res = sort.gnome_sort(unsorted);
            //  aqui cambiar por cada sort
            System.out.println("sorted Bubble");

            br = new BufferedReader(sorted_file);
            while ((sCurrentLine = br.readLine()) != null) {
                all_lines += sCurrentLine + "\t";

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            br.close();

            sorted_file.close();

            unsorted_file.close();
        }


    }
}
