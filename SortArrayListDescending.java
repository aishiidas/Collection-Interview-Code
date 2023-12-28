package org.anudip.mavenApplication.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListDescending {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        
        arrayList.add(56);
        arrayList.add(28);
        arrayList.add(89);
        arrayList.add(10);
        arrayList.add(71);

        
        Collections.sort(arrayList, Collections.reverseOrder());

        
        System.out.println("Sorted ArrayList in descending order: " + arrayList);
    }
}
