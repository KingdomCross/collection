import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File file = new File("AliceInWonderLand.txt");
		 // int len;
		  int count = 0;
		  String[] words;
		  //String[] unrepeatedWords;
		  Scanner in = null;
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Map<String, Integer> record = new HashMap<String, Integer>();
		while (in.hasNextLine()) {
		    String line = in.nextLine();
		    words = line.split(" ");

		   
		    for (String word : words) {
		        if (!record.containsKey(word)) {
		            record.put(word, 1);
	                 if (word.equalsIgnoreCase("the"))   
	                 {
	                   count++;  
	                 }
		        }
		        else {
		            record.put(word, record.get(word) + 1);
		        }
		    }
	}
			System.out.println("Count: " + count);
}
}
