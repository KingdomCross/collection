import java.util.LinkedList;

class ScavengerLinked {
    ScavengerLinked(){
        System.out.println("Linked List");
        long time1, time2;
        time1=System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Newspaper");
        linkedList.add("Toy");
        linkedList.add("Flashlight");
        linkedList.add("Page");
        linkedList.add("Shoelace");
        for(int i = 0; 100 > i; i++){
            linkedList.add(String.valueOf(i));
        }
        System.out.println(linkedList);
        time2=System.currentTimeMillis();
        System.out.println("Time for the operation is: " + (time2-time1));
    }
}
