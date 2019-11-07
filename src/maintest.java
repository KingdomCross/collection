/*
  Alex Chheng and Chloe
  Project Collection
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {
        File file = new File("QWords.txt"); //"table.txt"
        if (!file.exists()) {
            System.out.println("File not exist");
            System.exit(0);
        }

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        long time1, time2;
        time1=System.currentTimeMillis();

        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (in != null) {
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        }

        time2=System.currentTimeMillis();
        System.out.println("Time for the operation is: " + (time2-time1));
    }
}
