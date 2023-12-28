package org.anudip.mavenApplication.collection;
import java.util.ArrayList;

public class ArrayListLength {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Chair");
        arrayList.add("Ball");
        arrayList.add("Bat");
        arrayList.add("Ring");

        
        int length = arrayList.size();

        
        System.out.println("Length of ArrayList: " + length);
    }
}
