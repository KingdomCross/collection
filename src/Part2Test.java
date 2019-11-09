import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String file = null;
		  int len;
		  int count = 0;
		  String[] words;
		  String[] unrepeatedWords;
		  Scanner in = new Scanner(file);
		 Map<String, Integer> record = new HashMap<String, Integer>();
		while (in.hasNextLine()) {
		    String line = in.nextLine();
		    words = line.split(" ");

		    //here so it can use the split from the previous line
		    for (String word : words) {
		        if (!record.containsKey(word)) {
		            record.put(word, 1);
		        }
		        else {
		            record.put(word, record.get(word) + 1);
		        }
		    }
	}

}
}
