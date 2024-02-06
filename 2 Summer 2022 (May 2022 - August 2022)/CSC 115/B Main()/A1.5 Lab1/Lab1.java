/*
 * Lab1.java
 *
 * A class of static methods with errors
 *
 */
public class Lab1 {

    /*
     *
     * Purpose: returns a String representation of array
     *
     * Parameters: int[] array
     *
     * Returns: String - the representation
     *
     */
    public static String getString(int[] array) {
        String result = "{";
        if (array.length == 0) {
            result += "}";
            return result;
        } else if (array.length == 1) {
            result += array[0] + "}";
            return result;
        } else if (array.length >= 1) {
            for(int i=0; i<(array.length); i++) {
                result += array[i];
                if (i==array.length-1) {
                    break;
                }
                result+=",";
            }
        }
        result += "}";
        return result;
    }

    /*
     *
     * Purpose: calculates the average of a, b and c
     *
     * Parameters: int a, int b, int c
     *
     * Returns: double - the average
     *
     */
    public static double getAverage(int a, int b, int c) {
        double result = 1;

        result = (((double)a + (double)b + (double)c) / 3.0);

        return result;
    }

    /*
     *
     * Purpose: returns a count of the number of elements
     *  in array bigger than the given treshold
     *
     * Parameters: int[] array, int threshold
     *
     *
     * Returns: int - the number of element above threshold
     *
     */
    public static int countAbove(int[] array, int threshold) {
        int count = 0;

        for(int i=0; i<(array.length); i++) {
            if (array[i]>threshold) {
                ++count;
            }
        }
        return count;
    }

    /*
     *
     * Purpose: finds the biggest number in array
     *
     * Parameters: int[] array
     *
     * Precondition: array is not empty
     *
     * Returns: int - the biggest number
     *
     */
    public static int getMax(int[] array) {
        int max = -1000000;
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else if (array.length >= 1) {
            for(int i=0; i<(array.length); i++) {
                if (array[i]>max) {
                    max = array[i];
                }
            }
        }
        return max;
    }


    /*
     *
     * Purpose: determines whether the numbers in array
     *  are in sorted increasing order
     *
     * Parameters: int[] array
     *
     * Returns: boolean - true if sorted, false otherwise
     *
     */
    public static boolean isSorted(int[] array) {

        if (array.length==1) return true;
        else if (array.length >= 1) {
            for (int i=1; i<(array.length); i++) {
                if ((array[array.length-i]<array[array.length-(i+1)])) {
                    return false;
                } 
            }
        } return true;
    }

}
