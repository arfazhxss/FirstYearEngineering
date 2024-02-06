import java.lang.Math;

/*
 * A1
 * Complete the functions below according to the documentation
 * DO NOT use builtin java Arrays methods
 *
 */
public class A1 {
    private static final double GST = 0.05;
    private static final double PST = 0.10;


    /*
     * sum
     *
     * Purpose: calculates and returns the sum of n1 and n2
     *
     * Parameters: int n1, n2
     *
     * Returns: int - the calculated sum
     *
     */
    public static int sum ( int n1, int n2) {
        int sum = 0;
        sum = n1 + n2;
        return sum;
    }

    /*
     * getTax
     *
     * Purpose: calculates the amount of tax to be charged on given
     *   food and alcohol charges in dollars on a restaurant bill.
     *   Note: GST and PST are charged on alcohol, only GST is charged on food
     *
     * Parameters: double food - amount of food charge in dollars
     *             double alcohol - amount of alcohol charge in dollars
     *
     * Precondition: food and alcohol >=0
     *
     * Returns: double - the calculated tax charge
     *
     */
    
    public static double getTax (double food, double alcohol) {
        double taxed_food = 0.0;
        double taxed_alc = 0.0;
        double taxed_total = 0.0;

        taxed_food = (GST)*food;
        taxed_alc = (GST+PST)*alcohol;

        taxed_total = (taxed_alc+taxed_food);

        return taxed_total;
    }

    /*
     * getBillShare
     *
     * Purpose: calculates the total bill on given food and alcohol charges
     *       adding appropriate taxes.
     *   Calculates and returns the share of the total bill owed by each of
     *         numPeople where the bill is divided evenly.
     *
     * Parameters: double food - amount of food charge in dollars before tax
     *             double alcohol - amount of alcohol charge in dollars before tax
     *             int numPeople - number or people to split the bill across
     *
     * Precondition: food and alcohol >=0, numPeople >0
     *
     * Returns: double - the calculated share
     *
     */

    public static double getBillShare (double food, double alcohol, int numPeople) {
        double taxated_total = getTax(food, alcohol);
        double bill = (food+alcohol)+taxated_total;
        double share = bill/numPeople;
        return share;
    }


    /*
     * isMultiple
     *
     * Purpose: determines whether n1 is a multiple of n2
     *   Definition of multiple taken from:
     *   https://elementarymath.edc.org/resources/multiple/
     *
     * Parameters: int n1, n2
     *
     * Returns: boolean - true if n1 is a multiple of n2, false otherwise
     *
     */

    public static boolean isMultiple (int n1, int n2) {
        if (n2==0) {
            if (n1==0) {
                return true;
            } return false;
        }
        
        if (n1%n2==0) {
            return true;
        } return false;
    }

    /*
     * sumFibSequenceToLimit
     *
     * Purpose: calculates the sum of numbers in fibonacci sequence up to
     *   and including the given limit.  Any numbers in the fibonacci sequence
     *   above the given limit will not be added to the sum.
     *   Definition of fibonacci sequence:
     *     https://www.mathsisfun.com/numbers/fibonacci-sequence.html
     *
     * Parameters: int limit
     *
     * Precondition: limit >= 0
     *
     * Returns: int - the calculated sum
     *
     */

    public static int sumFibSequenceToLimit (int limit) {
        int sum = 0;
        int t1 = 0, t2 = 1, next = 0;

        while (next<=limit) {
            sum+=t1;
            next = t2;
            t2+=t1;
            t1=next;
        } return sum;
    }



    /*
     * printArray
     *
     * Purpose: prints all the values in the array to the console
     *  example format:  {1,2,3,4}
     *
     * Parameters: int[] array - an array of integers
     *
     * Returns: void
     *
     */
    public static void printArray ( int[] array ) {
        System.out.print("{");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]);
            if(i<array.length-1)
                System.out.print(",");
        }

        System.out.println("}");
    }

    /*
     * arrayProduct
     *
     * Purpose: computes the product of all values in the input array
     *  NOTE: product of 3 numbers n1, n2 and n3 = n1*n2*n3
     *  NOTE: product of no numbers = 1
     *
     * Parameters: int[] array - an array of integers
     *
     * Returns: int - product of all values in the array
     *
     */

    public static int arrayProduct (int[] array) {
        int prod=1;
        if (array.length==0) return 1;

        for (int i=0; i<array.length; i++) {
            prod*=array[i];
        } return prod;
    }

    /*
     * arrayMax
     *
     * Purpose: finds the maximum value in the input array
     *
     * Parameters: int[] array - an array of integers
     *
     * Preconditions:  array contains at least one element
     *
     * Returns: int - maximum value in the array
     *
     */

    public static int arrayMax (int[] array) {
        int max = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        } return max;
    }



    /*
     * countMultiples
     *
     * Purpose: counts the number of values in array that are multiples of n
     *
     * Parameters: int[] array - an array of integers
     *             int n - number to find multiples of
     *
     * Returns:  int - the count of multiples of n
     *
     */

    public static int countMultiples (int[] array, int n) {
        int count = 0;

        if (n==0) return 1;

        for (int i =0; i<array.length; i++) {
            if ((array[i]%n)==0) {
                count++;
            }
        } return count;
    }


    /*
     * arraysEqual
     *
     * Purpose: determines whether the two arrays are equal
     *      where equal means array1 and array2 are the same length
     *      and the contain the same values in the same order
     *
     * Parameters: int[] a1, int[] a2 -  two arrays of integers
     *
     * Returns: boolean - true if the are equal, false otherwise
     *
     */

    public static boolean arraysEqual (int[] a1, int[] a2) {

        if (a1.length==a2.length) {
            for (int i=0; i<a1.length; i++) {
                if (a1[i]!=a2[i]) {
                    return false;
                } 
            } return true;
        } return false;
    }

    /*
     * isIncreasing
     *
     * Purpose: determines if the values in array are in increasing order
     *  ie. {1, 2, 3, 4 ,10} is in increasing order
     *  ie. {1, 2, 3, 3, 4 ,10} is not in increasing order
     *
     * Parameters: int[] array - array of integers
     *
     * Returns: boolean - true if values are increasing, false otherwise
     *
     */

    public static boolean isIncreasing (int[] array) {

        if (array.length==1) return true;

        for (int i=1; i<array.length; i++) {
            if ((array[array.length-i]<=array[array.length-(i+1)])) {
                return false;
            } 
        } return true;
    }

    /*
     * contains
     *
     * Purpose: determines whether the values in lookingFor are strictly
     *  contained in lookingIn in the same order
     *
     * Parameters: int[] lookingFor - array of integers being looked for
     *             int[] lookingIn - array of integers being looked in
     *
     * Returns: boolean - true if lookingFor is in lookingIn, false otherwise
     *
     */

    public static boolean contains (int[] lookingFor, int[] lookingIn) {
        int begin=0;
        int end=0;

        if (lookingFor.length == lookingIn.length) {
            for (int i=0; i<lookingFor.length; i++) {
                if (lookingFor[i]==lookingIn[i]) {return true;}
                else return false;
            }
        } else if (lookingFor.length < lookingIn.length) {
            for (int i=0; i<lookingIn.length; i++) {
                if (lookingIn[i]==lookingFor[0]) {
                    begin = i;
                }
            //System.out.println("in begin-check: "+begin);
            }
            //System.out.println("\nout begin-check: "+begin);
    
            for (int i=0; i<lookingIn.length; i++) {
                if (lookingIn[i]==lookingFor[lookingFor.length-1]) {
                    end = i;
                    break;
                }
            }
            //System.out.println("out2 begin-check: "+begin+" end check: "+end+" count check: "+count);
            //System.out.println("lookingFor length: "+lookingFor.length+"end-begin+1: "+(end-begin+1));
            if (lookingFor.length == (end-begin+1)) {return true;}
            else return false;
        } else if (lookingFor.length > lookingIn.length) {
            return false;
        } return false;
    }
} 
