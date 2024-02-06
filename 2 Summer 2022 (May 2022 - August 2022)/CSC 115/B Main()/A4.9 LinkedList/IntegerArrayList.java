public class IntegerArrayList implements IntegerList {
    private static final int INITIAL_CAPACITY = 2;

    private int[] data;
    private int   count;

    public IntegerArrayList() {
        data = new int[INITIAL_CAPACITY];
        count = 0;
    }

    public int size () {
        return count;
    }

    public void addBack (int i){
        if (count >= data.length) {
            growAndCopy();
        }
        data[count] = i;
        count++;
    }

    /* Parameters: none
     * Purpose:  Creates a newArray 2 bigger than capacity of data
     *  Copies values from data to newArray
     *  Sets data to refer to newArray
     * Returns:  void
     * Precondition: data is not null
     */
    private void growAndCopy() {
        int[] temp = new int[data.length + 2];
        // copy values from data to temp
        for(int i=0; i<data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }


    public void addFront (int i) {
        if (count >= data.length) {
            growAndCopy();
        }
        shiftRight();
        data[0] = i;
        count++;
    }

    /* Parameters: none
     * Purpose:  shifts all elements in data to the right by one index
     * Returns:  void
     * Precondition: count<storage.length
     */
    private void shiftRight() {
        // move all elements to the right
        // assumes there is room to do that
        for (int i=count; i>0; i--) {
            data[i] = data[i-1];
        }
    }

    public int get (int position){
        return data[position];
    }

    /* Parameters: nothing
     * Purpose: create a string representation of list
     * Returns: String - the string representation
     */
    public String toString() {
        String s = "";

        for(int i=0; i<count; i++)
            s += data[i] + " ";

        return s;
    }

}
