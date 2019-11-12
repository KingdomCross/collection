/*
 * Authors: Chloe Culver and Alex Chheng
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Hashclass {
    Hashclass(){
        System.out.println("HashMap Method");
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
