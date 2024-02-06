/*
 * IntegerNode.java
 *
 * An implementation of a node class for a singly-linked list of integers.
 *
 */

public class IntegerNode {
    protected IntegerNode  next;
    private int            e;

    public IntegerNode() {
        next = null;
        e = 0;
    }

    /*
     *
     * Purpose: sets this IntegerNode's e to given e and next to null
     *
     * Parameters: int e
     */
    public IntegerNode (int e) {
        this.e = e;
        next = null;;
    }

    /*
     *
     * Purpose: sets this IntegerNode's e and next to given e and next
     *
     * Parameters: int e, IntegerNode next
     *
     */
    public IntegerNode (int e, IntegerNode next) {
        this.e = e;
        this.next = next;
    }

    /*
     *
     * Purpose: returns this IntegerNode's next
     *
     * Parameters: none
     *
     * Returns: IntegerNode - this IntegerNode's next
     */
    public IntegerNode getNext()    {
        return next;
    }

    /*
     *
     * Purpose: sets this IntegerNode's next to given next
     *
     * Parameters: IntegerNode next
     *
     * Returns: void
     */
    public void setNext (IntegerNode next) {
        this.next = next;
    }


    /*
     *
     * Purpose: returns this IntegerNode's e
     *
     * Parameters: none
     *
     * Returns: int - this IntegerNode's e
     */
    public int getElement() {
        return e;
    }


    /*
     *
     * Purpose: sets this IntegerNode's e to given e
     *
     * Parameters: int e
     *
     * Returns: void
     */
    public void setElement (int e) {
        this.e = e;
    }
}
