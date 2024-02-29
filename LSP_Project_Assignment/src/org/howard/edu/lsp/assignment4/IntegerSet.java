package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();
   
    /**
     * Default Constructor of the IntegerSet class
     */
    public IntegerSet() {
        }

    /**
     * Constructor if you want to pass in already initialized
     * @param set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }
   
    /**
     * This method add an integer to the Integer Set if it is already not in it
     * @param item
     */
    public void add(int item) {
        if (!set.contains(item) ) {
            set.add(item);
        }
    }
    /**
     * A void class which clears out the Integer set
     */
    public void clear() {
        set.clear();
    }
    /**
     * This method return the string representation of the Integer set
     * @return String
     */
    public String toString() {
        return set.toString();
    }
    /**
     * This method removes an item from the set if the item exists
     * @param item
     */
    public void remove(int item) {
        if (set.contains(item) ) {
            set.remove(Integer.valueOf(item));
        }
       
    }
    /**
     * This method returns true if the two sets are equal
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerSet that = (IntegerSet) o;

        return set.containsAll(that.set) && that.set.containsAll(set);
    }
    /**
     * This method returns the size of a set 
     * @return length of the set
     */
    public int length() {
        return set.size();
    }
    /**
     * This method returns true if the set is empty or false otherwise
     * @return boolean
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }
    /**
     * This method returns true if the set contains the value or false otherwise
     * @param value
     * @return boolean
     */
    public boolean contains(int value) {
        return set.contains(value);
    }
    /**
     *This method returns the maximum value in a set
     * @return maximum element
     * @throws IntegerSetException
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
     *This method returns the minimum value in a set
     * @return maximum element
     * @throws IntegerSetException
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
     * This method does the union operation on two or more sets
     * @param intSetb
     */
    public void union(IntegerSet intSetb) {
        for (int value : intSetb.set) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
    }

    /**
     * This method does the intersection operation on two or more sets
     * @param intSetb
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }
    /**
     * This method does the difference operation on two or more sets
     * @param intSetb
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }
    /**
     * This method finds the complement when given an universal set
     * @param Universal set
     */
    public void complement(IntegerSet universalSet) {
        List<Integer> complement = new ArrayList<>();
        for (int i : universalSet.set) {
            if (!set.contains(i)) {
                complement.add(i);
            }
        }
        set = complement;
    }


}

class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}