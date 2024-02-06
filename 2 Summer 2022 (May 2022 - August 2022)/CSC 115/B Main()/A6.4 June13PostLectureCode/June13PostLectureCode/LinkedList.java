public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    /* Parameters: (T) i
     * Purpose:  add i to the front of the list
     * Returns:  nothing
     */
    public void addFront (T i) {
        Node<T> n = new Node<T>(i);
        n.next = head;
        head = n;
        size++;
    }

    /* Parameters: (T) i
     * Purpose:  add i to the back of the list
     * Returns:  nothing
     */
    public void addBack (T i){
        Node<T> n = new Node<T>(i);
        if(head == null) {
            head = n;
        } else {
            Node<T> tmp = head;
            while(tmp.next != null)
                tmp = tmp.next;
            tmp.next = n;
        }
        size++;
    }

    /* Parameters: nothing
     * Purpose:  get the size of the list
     * Returns:  (int) size
     */
    public int size () {
        return 0;
    }


    /* Parameters: (int) position
     * Purpose:  get the int value at specified position in the list
     * Returns:  (T) the int value
     * Precondition: 0 <= position < list.size()
     */
    public T get (int position) {

        Node<T> tmp = head;
        for(int i=0; i<position; i++) {
            tmp = tmp.next;
        }
        return tmp.getValue();
    }

    /* Parameters: nothing
     * Purpose: create a string representation of list
     * Returns: (String) the string representation
     */
    public String toString() {
        String s = "";
        Node<T> tmp = head;

        while(tmp != null) {
            s += tmp.getValue() + " ";
            tmp = tmp.next;
        }
        return s;
    }
}
