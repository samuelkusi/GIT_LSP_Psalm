package org.howard.edu.lsp.midterm.question2;

/**
 * Represents a range of integers defined by a lower and upper bound.
 */
public class Range {
    private int lowerBound; // Lower bound of the range
    private int upperBound; // Upper bound of the range

    /**
     * Constructs a Range object with the specified lower and upper bounds.
     * 
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the given value is within the range.
     * 
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    public boolean isValueInRange(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if the range overlaps with another range.
     * 
     * @param otherRange the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */
    public boolean doRangesOverlap(Range otherRange) {
        return this.lowerBound <= otherRange.upperBound && otherRange.lowerBound <= this.upperBound;
    }

    /**
     * Calculates the number of integers in the range.
     * 
     * @return the number of integers in the range
     */
    public int size() {
        return upperBound - lowerBound + 1;
    }
}

