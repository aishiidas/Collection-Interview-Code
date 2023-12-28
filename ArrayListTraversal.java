package org.anudip.mavenApplication.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("56");
        arrayList.add("78");
        arrayList.add("89");
        arrayList.add("19");

        
        System.out.println("Traversing ArrayList using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
