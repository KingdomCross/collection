/*
  Alex Chheng and Chloe
  Project Collection
 */

import java.io.*;
import java.util.*;

public class maintest {
    public static void main(String[] args) {
        Scramble scramble = new Scramble();
        File file = new File("QWords.txt"); //"table.txt"
        if (!file.exists()) {
            System.out.println("File not exist");
            System.exit(0);
        }

        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        long time1, time2;
        time1=System.currentTimeMillis();

        String tempNext;
        int total = 0;
        if (in != null) {
            while (in.hasNext()) {
                tempNext = in.nextLine();
                for(int j = 0; tempNext.length() > j; j++){
                    //System.out.println(scramble.Score(tempNext.charAt(j)));
                    total += scramble.Score(tempNext.charAt(j));
                }
                hashMap.put(tempNext, total); //hashmap
                total = 0;
            }
        }

        Set<String> keySet = hashMap.keySet();  for (String key : keySet)
        {
            Integer value = hashMap.get(key);  System.out.println(key + " : " + value);
        }

        System.out.println(hashMap);

        time2=System.currentTimeMillis();
        System.out.println("Time for the operation is: " + (time2-time1));
    }
}
