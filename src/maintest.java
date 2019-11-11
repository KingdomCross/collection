/*
  Alex Chheng and Chloe
  Project Collection
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

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

        try {
            PrintWriter out = new PrintWriter("Scrabble.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        if (in != null) {
            while (in.hasNext()) {
                hashMap.put(in.nextLine(), "q"); //hashmap
                Set<String> keySet = hashMap.keySet();  for (String key : keySet)
                {
                    String value = hashMap.get(key);  System.out.println(key + " : " + value);
                }
            }
        }
        System.out.println(hashMap);

        time2=System.currentTimeMillis();
        System.out.println("Time for the operation is: " + (time2-time1));
    }
}
