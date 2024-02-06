public class IntegerArrayList implements IntegerList {
    private static final int INITIAL_CAPACITY = 2;

    private int[] data;
    private int count;

    public IntegerArrayList() {
        // complete the constructor
        data = new int[INITIAL_CAPACITY];
        count = 0;
    }

    public int size () {
        // how will we know how many elements are in the list?
        return count;
    }

    private void expandAndCopy() {
        //create a new array double the size of data
        int[] newArray = new int[data.length * 2];
        // copy values over from data
        for(int i=0; i<count; i++) {
            newArray[i] = data[i];
        }
        // reset data to point to the new array
        data = newArray;
    }
    
    public void addBack (int i){
        if (count >= data.length) {
            expandAndCopy();
        }
        data[count] = i;
        count++;
    }

    private void shiftRight() {
        for(int i=count; i>0; i--) {
            data[i] = data[i-1];
        }
    }
    public void addFront (int i) {
        if (count >= data.length) {
            expandAndCopy();
        }
        shiftRight();
        data[0] = i;
        count++;
    }

    public int get (int position){
        return data[position];
    }

    /* Parameters: nothing
     * Purpose: create a string representation of this list
     * Returns: (String) the string representation
     */
    public String toString() {
        String s = "";

        // Q2b. The loop here is contolled by count
        //  If we changed it to data.length, would it still be correct?
        for(int i=0; i<count; i++)
            s += data[i] + " ";

        return s;
    }
}
