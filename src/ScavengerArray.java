import java.util.ArrayList;

class ScavengerArray {
    ScavengerArray(){
        System.out.println("Array List");
        long time1, time2;
        time1=System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Newspaper");
        arrayList.add("Toy");
        arrayList.add("Flashlight");
        arrayList.add("Page");
        arrayList.add("Shoelace");
        for(int i = 0; 100 > i; i++){
            arrayList.add(String.valueOf(i));
        }
        System.out.println(arrayList);
        time2=System.currentTimeMillis();
        System.out.println("Time for the operation is: " + (time2-time1));
    }
}
