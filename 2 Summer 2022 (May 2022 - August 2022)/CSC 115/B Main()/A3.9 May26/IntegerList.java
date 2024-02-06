public interface IntegerList {

    /* Parameters: none
     * Purpose:  get the size of the list
     * Returns:  (int) the size
     */
    int size ();

    /* Parameters: (int) i
     * Purpose:  add i to the back of the list
     * Returns:  nothing
     */
    void addBack (int i);

    /* Parameters: (int) i
     * Purpose:  add i to the front of the list
     * Returns:  nothing
     */
    void addFront (int i);


    /* Parameters: (int) position
     * Purpose:  get the int value at specified position in the list
     * Returns:  (int) the int value
     * Precondition: 0 <= position < list.size()
     */
    int get (int position);
}
