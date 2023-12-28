package org.anudip.mavenApplication.collection;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckElementInArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Riya");
        arrayList.add("Rima");
        arrayList.add("Risha");
        arrayList.add("Guriya");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to check: ");
        String elementToCheck = scanner.nextLine();

        
        boolean isElementPresent = arrayList.contains(elementToCheck);

        
        if (isElementPresent) {
            System.out.println("The element '" + elementToCheck + "' exists in the ArrayList.");
        } else {
            System.out.println("The element '" + elementToCheck + "' does not exist in the ArrayList.");
        }

        
        scanner.close();
    }
}

