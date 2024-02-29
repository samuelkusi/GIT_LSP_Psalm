package org.howard.edu.lsp.assignment4;

public class Driver {
    public static void main(String[] args) {
        // Test IntegerSet operations here and print results
        IntegerSet firstSet = new IntegerSet();
        firstSet.add(7);
        firstSet.add(8);
        firstSet.add(9);
        System.out.println("Items in firstSet: " + firstSet.toString());
        
        IntegerSet secondSet = new IntegerSet();
        secondSet.add(9);
        secondSet.add(10);
        secondSet.add(11);
        System.out.println("Items in secondSet: " + secondSet.toString());


        IntegerSet thirdSet = new IntegerSet();
        thirdSet.add(8);
        thirdSet.add(10);
        System.out.println("Items in thirdSet: " + thirdSet.toString());

        
        IntegerSet fourthSet = new IntegerSet();
        System.out.println("Items in fourthSet: " + fourthSet.toString());
        System.out.println("\n");

        
        
        try {
            System.out.println("Smallest value in firstSet is: " + firstSet.smallest());
            System.out.println("Largest value in firstSet is: " + firstSet.largest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        System.out.println("The length of firstSet: "+ firstSet.length());
        System.out.println("thirdSet does not contains the element 89: " + thirdSet.contains(89));
        System.out.println("fourthSet is empty: " + fourthSet.isEmpty());
        System.out.println("comparing between secondSet and thirdSet shows they are not equal: "+ secondSet.equals(thirdSet));
        System.out.println("\n");


        // Test union, intersection, difference, and complement operations
        firstSet.union(secondSet);
        System.out.println("Union of firstSet and secondSet: " + firstSet.toString());
        System.out.println("Updated Items in firstSet: " + firstSet.toString());
        System.out.println("Updated Items in secondSet: " + secondSet.toString());
        System.out.println("\n");




        firstSet.intersect(thirdSet);
        System.out.println("Intersection of firstSet and thirdSet: " + firstSet.toString());
        System.out.println("Updated Items in firstSet: " + firstSet.toString());
        System.out.println("Items in thirdSet: " + thirdSet.toString());
        System.out.println("\n");

        
        firstSet.diff(secondSet);
        System.out.println("Difference of firstSet and secondSet: " + firstSet.toString());
        System.out.println("Updated Items in firstSet: " + firstSet.toString());
        System.out.println("Updated Items in secondSet: " + secondSet.toString());
        System.out.println("\n");

        firstSet.complement(thirdSet);
        System.out.println("Complement of firstSet with respect to thirdSet: " + firstSet.toString());
        System.out.println("Updated Items in firstSet: " + firstSet.toString());
        System.out.println("Updated Items in thirdSet: " + thirdSet.toString());
        System.out.println("\n");

        
        
        thirdSet.clear();
        System.out.println("Updated Items in thirdSet: "+ thirdSet.toString());
        
        
    }
}
