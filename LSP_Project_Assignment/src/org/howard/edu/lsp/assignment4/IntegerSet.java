package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers and provides various set operations.
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();
   
    /**
     * Default Constructor of the IntegerSet class.
     */
    public IntegerSet() {
        } 

    /**
     * Constructor to initialize the set with existing values.
     * 
     * @param set the set of integers
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }
   
    /**
     * Adds an integer to the set if it is not already present.
     * 
     * @param item the integer to be added
     */
    public void add(int item) {
        if (!set.contains(item) ) {
            set.add(item);
        }
    }
    
    /**
     * Clears the Integer set.
     */
    public void clear() {
        set.clear();
    }
    
    /**
     * Returns the string representation of the Integer set.
     * 
     * @return String representation of the set
     */
    public String toString() {
        return set.toString();
    }
    
    /**
     * Removes an item from the set if it exists.
     * 
     * @param item the item to be removed
     */
    public void remove(int item) {
        if (set.contains(item) ) {
            set.remove(Integer.valueOf(item));
        }
       
    }
    
    /**
     * Checks if the set is equal to another object.
     * 
     * @param o the object to compare
     * @return true if the sets are equal, false otherwise
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerSet that = (IntegerSet) o;

        return set.containsAll(that.set) && that.set.containsAll(set);
    }
    
    /**
     * Returns the size of the set.
     * 
     * @return the size of the set
     */
    public int length() {
        return set.size();
    }
    
    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }
    
    /**
     * Checks if the set contains a value.
     * 
     * @param value the value to check
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }
    
    /**
     * Finds the largest value in the set.
     * 
     * @return the largest value in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int value : set) {
        	max=Math.max(value, max);
        }
        return max;
    }
    
    /**
     * Finds the smallest value in the set.
     * 
     * @return the smallest value in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int value : set) {
        	min=Math.min(value, min);
        }
        return min;
    }
    
    /**
     * Computes the union of this set and another set.
     * 
     * @param intSetb the other set
     */
    public void union(IntegerSet intSetb) {
        for (int value : intSetb.set) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
    }

    /**
     * Computes the intersection of this set and another set.
     * 
     * @param intSetb the other set
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }
    
    /**
     * Computes the difference between this set and another set.
     * 
     * @param intSetb the other set
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }
    
    /**
     * Computes the complement of this set with respect to another set.
     * 
     * @param intSetb the universal set
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int i : intSetb.set) {
            if (!set.contains(i)) {
                complement.add(i);
            }
        }
        set = complement;
    }
}

/**
 * Custom Exception class for IntegerSet.
 */
class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}
