public class Node<T> {

    private   T value;
    protected Node<T> next;

    public Node () {
        this.value = null;
        this.next = null;
    }

    public Node (T value) {
        this.value = value;
        this.next = null;
    }

    /* Parameters: nothing
     * Purpose:  get the value of this Node
     * Returns:  T - the value
     */
    public T getValue() {
        return value;
    }

    /* Parameters: T value
     * Purpose:  set the value of this Node to value
     * Returns:  nothing
     */
    public void setValue(T value) {
        this.value = value;
    }

    /* Parameters: nothing
     * Purpose:  get the next of this Node
     * Returns:  (Node<T>) the next
     */
    public Node<T> getNext() {
        return next;
    }

    /* Parameters: Node next
     * Purpose:  set the next of this Node to next
     * Returns:  nothing
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
