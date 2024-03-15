package org.howard.edu.lsp.midterm.question2;


/**
 * Class to test the implementation of the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Create some IntegerRange instances
        IntegerRange range1 = new IntegerRange(1, 5);
        IntegerRange range2 = new IntegerRange(3, 7);
        IntegerRange range3 = new IntegerRange(8, 10);

        // Test the contains method
        System.out.println("Range 1 contains 3: " + range1.contains(3)); // true
        System.out.println("Range 2 contains 6: " + range2.contains(6)); // true
        System.out.println("Range 3 contains 11: " + range3.contains(11)); // false

        // Test the overlaps method
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3)); // false

        // Test the size method
        System.out.println("Size of Range 2: " + range2.size()); // 5

        // Test the equals method
        IntegerRange range4 = new IntegerRange(1, 5);
        System.out.println("Range 1 equals Range 4: " + range1.equals(range4)); // true
    }
}
