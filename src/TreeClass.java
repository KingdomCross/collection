/*
 * Authors: Chloe Culver and Alex Chheng
 * Input: takes the args given in the command and decides to make a TreeSet or HashSet from, the File
 * OutPut: returns the Method used to search the txt, the time it took to search the file, and the number of times
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class TreeClass {
    TreeClass(){ //This is using constructor to run treemap method
        System.out.println("TreeMap Method");
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
                treeMap.put(tempNext, total); //hashmap
                total = 0;
            }
        }

        Set<String> keySet = treeMap.keySet();  for (String key : keySet)
        {
            Integer value = treeMap.get(key);  System.out.println(key + " : " + value);
        }

        time2=System.currentTimeMillis(); //end time
        System.out.println("Time for the operation is: " + (time2-time1)); //result time
    }
}
