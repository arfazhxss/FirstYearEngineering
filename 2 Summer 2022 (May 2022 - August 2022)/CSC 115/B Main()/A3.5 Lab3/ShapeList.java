public class ShapeList {

    private static final int INIT_CAPACITY = 2;

    Shape[] elements; // array to store Shape objects added to the list
    int count; // number of Shape objects in elements

    /*
     * Purpose: initializes elements to an array of INIT_CAPACITY
     *   and initializes count to zero
     * Parameters: none
     */
    public ShapeList() {
        elements = new Shape[INIT_CAPACITY];
        count = 0;
    }

    /*
     * Purpose: returns the count of the number of elements in this list
     * Parameters: none
     * Returns: int - the number of elements
     */
    public int size() {
        return count;
    }

    /*
     * Purpose: adds Shape s to back of this list
     *  If elements is full, creates a new array with the existing value and s,
     *     and sets elements to point to the new array.
     * Parameters: Shape - s
     * Precondition: s is not null
     * Returns: void
     */
    public void add(Shape s) {
        if (count==elements.length) {
            Shape newline[] = new Shape[2*(elements.length)];

            for (int i=0; i<(elements.length);i++) {
                newline[i]=elements[i];
            }
            elements = newline;
        }
        elements[count] = s;
        ++count;
    }

    /*
     * Purpose: returns a String reprensentation of the elements
     *      in this list separated by newlines
     * Parameters: none
     * Returns: String - the representation
     */
     public String toString() {
         String s = "";

         for(int i=0; i<count; i++)
             s  += elements[i] + "\n";

         return s;
     }

    /*
     * Purpose: removes the first element in this list
     *  When complete, all remaining Shape instances in the list will be
     *    at the front of the array.
     *    That is, position 0 of elements is not null.
     * Parameters: none
     * Returns: void
     */
    public void removeFront() {
        if (elements.length!=0) {
            Shape newline[] = new Shape [(elements.length)-1];
            for (int i=0; i<(count-1);i++) {
                newline[i]=elements[i+1];
                // System.out.println("i: "+i+" elements\t\t"+newline[i]);
            }
            elements = newline;
            --count;
        }
    }
    // public static void main (String[] args) {
    //     Point p25 = new Point(2,5);
    //     Point p48 = new Point(4,8);
    //     Point p23 = new Point(2,3);
    //     Shape r00 = new Rectangle();
    //     Shape c25 = new Circle(9, p25);
    //     Shape r45 = new Rectangle(4, 5, p23);
    //     Shape r76 = new Rectangle(7, 6, p48);
    //     ShapeList l = new ShapeList();
    //     l.add(r00);
    //     l.add(c25);
    //     l.add(r45);
    //     l.add(r76);

    //     l.removeFront();
    // }
}
