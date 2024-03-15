package org.howard.edu.lsp.midterm.question2;

/**
 * Implementation of the Range interface for integer ranges.
 */
public class IntegerRange implements Range {
    private final int lowerBound;
    private final int upperBound;

    /**
     * Constructs an IntegerRange with the specified bounds.
     *
     * @param lowerBound the lower bound of the range (inclusive)
     * @param upperBound the upper bound of the range (inclusive)
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(Range other) {
        return this.contains(((IntegerRange) other).lowerBound) ||
               this.contains(((IntegerRange) other).upperBound) ||
               other.contains(this.lowerBound) ||
               other.contains(this.upperBound);
    }

    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Overrides the equals method to compare if two ranges are equal.
     *
     * @param obj the object to compare with
     * @return true if the ranges are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}