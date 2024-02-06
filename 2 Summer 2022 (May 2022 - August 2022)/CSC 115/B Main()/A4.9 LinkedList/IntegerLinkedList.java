public class IntegerLinkedList implements IntegerList {

    private Node head;
    private int numElements;

    // Q6. complete the following methods:
    // constructor
    // addFront
    // size
    // Q7. if this was a doubly linked list with a head and tail,
    //   would addFront and size change?  If so how?
    // Q8. complete the remaining methods:
    // toString
    // get
    // addBack
    public IntegerLinkedList() {
        head = null;
        numElements = 0;
    }

    public void addFront (int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        numElements++;
    }


    public void addBack (int val) {
        //create a new node
        Node n = new Node(val);

        // loop to last element in the list
        if (head == null) {
            head = n;
            // addFront(val);
        } else {
            Node tmp = head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            // set the next of the last element to point to the new node
            tmp.next = n;
        }
        numElements++;
    }


    public int size (){
        return numElements;
    }


    public int get (int position) {
        Node tmp = head;
        for(int i=0; i<position; i++) {
            tmp = tmp.next;
        }
        return tmp.getValue();
    }

    /* Parameters: nothing
     * Purpose: create a string representation of list
     * Returns: String - the string representation
     */
    public String toString() {
        String s = "";
        Node tmp = head;
        while (tmp != null) {
            s += tmp.getValue() + " ";
            tmp = tmp.next;
        }
        return s;
    }

}
