package org.anudip.mavenApplication.collection;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementAtIndex {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");
        arrayList.add("Grapes");

        
        System.out.println("ArrayList before removal: " + arrayList);

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to remove: ");
        int indexToRemove = scanner.nextInt();

        
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            arrayList.remove(indexToRemove);
            System.out.println("Element at index " + indexToRemove + " removed.");
        } else {
            System.out.println("Invalid index. No removal performed.");
        }

        
        System.out.println("ArrayList after removal: " + arrayList);

        
        scanner.close();
    }
}

