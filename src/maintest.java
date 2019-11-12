/*
  Alex Chheng and Chloe
  Project Collection
 */

import java.io.*;
import java.util.*;

public class maintest {
    public static void main(String[] args) {
        Hashclass hashclass = new Hashclass();

        Scramble scramble = new Scramble();
        File file = new File("QWords.txt"); //"table.txt"
        if (!file.exists()) {
            System.out.println("File not exist");
            System.exit(0);
        }

        /*Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        Map<String, Integer> treeMap = new TreeMap<>();

        long time1, time2;
        time1=System.currentTimeMillis();

        time2=System.currentTimeMillis();
        System.out.println("Time for the operation is: " + (time2-time1));
    }
}
