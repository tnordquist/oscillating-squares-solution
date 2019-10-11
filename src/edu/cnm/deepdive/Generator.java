package edu.cnm.deepdive;

/**
 * This class contains a stub of the {@link #oscillatingSquares(int)} method. Implementation of this
 * method is included as a practical exam problem of the Deep Dive Coding Java + Android Bootcamp.
 *
 * @author Nicholas Bennett, Deep Dive Coding
 */
public class Generator {

    private Generator() {
        // NOTE: There is NO need to do anything with this constructor! The methods
        //       you will implement in this class are static; thus, there is no need
        //       to create instances of this class.
    }

    /* BASIC PROBLEM */

    /**
     * Creates and returns an <code>int[]</code> containing a sequence of alternating positive and
     * negative squared values, of the form (-1)<sup>n</sup>n<sup>2</sup>, where n =
     * 0&hellip;(<code>length</code> - 1).
     * <p>For example, <code>Generator.oscillatingSquares(5)</code> returns an array containing the
     * values <code>{0, -1, 4, -9, 16}</code>.</p>
     *
     * @param length number of elements in array.
     * @return generated array of oscillating squares.
     */
    public static int[] oscillatingSquares(int length) {
        int[] toReturn = new int[length];
        int negator = -1;
        for (int i = 0; i < length; i++) {
            negator *= (-1);
            toReturn[i] = (negator * i * i);
        }
        return toReturn;
    }

}
