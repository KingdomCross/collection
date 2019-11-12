/*
 * Authors: Chloe Culver and Alex Chheng
 * Project Collections
 * Input: takes the args given in the command and decides to make a TreeSet or HashSet from, the File
 * OutPut: returns the Method used to search the txt, the time it took to search the file, and the number of times
 */

import java.io.*;
import java.util.*;

public class maintest {
    public static void main(String[] args) {
        Hashclass hashclass = new Hashclass();
        System.out.println();
        TreeClass treeClass = new TreeClass();
        System.out.println();
        Alice alice = new Alice(args);
        System.out.println();

        ScavengerArray scavengerArray = new ScavengerArray();
        System.out.println();
        ScavengerLinked scavengerLinked = new ScavengerLinked();
    }
}
