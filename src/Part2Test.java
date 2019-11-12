/*
 * Authors: Chloe Culver and Alex Chheng
 * Input: takes the args given in the command and decides to make a TreeSet or HashSet from, the File
 * OutPut: returns the Method used to search the txt, the time it took to search the file, and the number of times
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Part2Test {
	public static void main(String[] args) {
		/*
		 * Instantiating the variables
		 */
		String searchword = "Alice";
		double Time;
		int found = 0;
		Scanner sc = null;
		try {
			sc = new Scanner(new File("AliceInWonderLand.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		 * Reads the file and sorts it into  a TreeSet
		 */
		   if(args.length == 0)
			{
				System.out.println("Using TreeSet");

				TreeSet<String> Tree = new TreeSet<>();
				if (sc != null) {
					while (sc.hasNext()){
						Tree.add(sc.next());
					}
				}
				//Searches for word
				for (int i = 0; i<100; i++){
				   if (Tree.contains(searchword))
					  found ++;
				}
				Time = System.currentTimeMillis();
				System.out.println("Search time :" + Time);
				System.out.println("Number of times word " + searchword + " was found: " + found);
			}
		   /*
			* Else statement does the same thing as a HashSet
			*/
		   else {
				System.out.println("Using Hash Set");

				HashSet<String> Hash = new HashSet<>();
			   if (sc != null) {
				   while (sc.hasNext()){
					   Hash.add(sc.next());
				   }
			   }
			   //Searches for word
				for (int i = 0; i<100; i++){
				   if (Hash.contains(searchword))
					  found ++;
				}
				Time = System.currentTimeMillis();
				System.out.println("Search time :" + Time);
				System.out.println("Number of times word " + searchword + " was found: " + found);
		}
	}
}

