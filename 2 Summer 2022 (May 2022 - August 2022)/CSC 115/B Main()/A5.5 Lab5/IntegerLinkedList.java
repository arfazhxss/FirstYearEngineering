// import java.util.Arrays;

public class IntegerLinkedList {


    private IntegerNode	head;
    private int		    count;


    public IntegerLinkedList() {
        head = null;
        count = 0;
    }

    /*
     *
     * Purpose: returns the size of this IntegerList
     *
     * Parameters: none
     *
     * Returns: int - the size
     *
     */
    public int size() {
        return count;
    }

    /*
     *
     * Purpose: adds element with i to the front of this Integerlist
     *
     * Parameters: int - i
     *
     * Returns: nothing
     *
     */
    public void addFront (int i) {
        IntegerNode n = new IntegerNode(i, head);

        head = n;

        count++;

    }


    /*
     *
     * Purpose: returns a String representation of this IntegerList
     *
     * Parameters: none
     *
     * Returns: String - the String representation
     *
     */
    public String toString() {
        return toString(head);
    }

    private String toString(IntegerNode n) {
        if (n==null) {
            return "";
        } else {
            if(n.next!=null) {
                return n.getElement() + " " + toString(n.next);
            } else {
                return n.getElement() + toString(n.next);
            }

        }
    }

    /*
     *
     * Purpose: recursively adds 1 to every element in this IntegerList
     *
     * Parameters: none
     *
     * Returns: nothing
     *
     */
    public void addOneRecursive() {
        addOneRecursiveHelper(head);
    }

    /*
     *
     * Purpose: recursively adds 1 to IntegerNode n and every element following n
     *
     * Parameters: IntegerNode - n
     *
     * Returns: nothing
     *
     */
    private void addOneRecursiveHelper(IntegerNode n) {
        if (n==null) {
            return;
        } else {

            // get data in current node and add 1 to it
            int valPlusOne = n.getElement() + 1;
            // set element in current node to valPlusOne
            n.setElement(valPlusOne);

            // add one to the elements in the  REST of the list
            addOneRecursiveHelper(n.next);
        }
    }

    /*
     *
     * Purpose: recursively doubles every element in this IntegerList
     *
     * Parameters: none
     *
     * Returns: nothing
     *
     */
    public void doubleValues() {
        doubleValuesRecur(head);
    }

    public void doubleValuesRecur(IntegerNode n) {
        if (n==null) {
            return;
        } else {
            int valDouble = (n.getElement()*2);
            n.setElement(valDouble);
            doubleValuesRecur(n.next);
        }
    }

    /*
     *
     * Purpose: recursively doubles every odd element in this IntegerList
     *  By "odd element" we mean the Node's element is an odd number
     *  NOT that it is at an odd position in the list
     *
     * Parameters: none
     *
     * Returns: nothing
     *
     */
    public void doubleOddValues() {
        doubleOddValuesRecur(head);
    }
    public void doubleOddValuesRecur(IntegerNode n) {
        if (n==null) {
            return;
        } else if (((n.getElement())%2)!=0) {
            int valDouble = (n.getElement()*2);
            n.setElement(valDouble);
            doubleOddValuesRecur(n.next);
        } else {
            doubleOddValuesRecur(n.next);
        } 
    }

    /*
     *
     * Purpose: recursively sums every element in this IntegerList
     *
     * Parameters: none
     *
     * Returns: int - the sum
     *
     */
    public int sum() {
        return sum(head);
    }


    /*
     *
     * Purpose: recursively sums element in IntegerNode n and every element following n
     *
     * Parameters: IntegerNode - n
     *
     * Returns: int - the sum
     *
     */
    private int sum(IntegerNode n) {
        if (n==null) {
            return 0;
        } else {
            int first = n.getElement();
            int sumRest = sum(n.next);

            return first + sumRest;
        }
    }

    /*
     *
     * Purpose: recursively computes the product of every element in this IntegerList
     *  Note: the product of an empty list is 1
     *
     * Parameters: none
     *
     * Returns: int - the product
     *
     */
    public int product() {
        int val = valProd(head);
        return val;
    } 

    public int valProd(IntegerNode n) {
        if (n==null) {
            return 1;
        } else {
            int thisVal = n.getElement();
            int nextVal = valProd(n.next);
            return (thisVal*nextVal);
        }
    }



    /*
     *
     * Purpose: recursively doubles every element at an odd postion in this IntegerList
     *  the first  element in this list is at position 0 (is not odd)
     *  the second element in this list is at position 1 (is odd)
     *  the third  element in this list is at position 2 (is not odd)
     *  ...
     *
     * Parameters: none
     *
     * Returns: nothing
     *
     */
    public void doubleOddPositionValues() {
        doubleOddPositionValues(head, 0);
    }

    /*
     *
     * Purpose: recursively doubles element in IntegerNode n if n is at odd position
     *  and every element after n at odd positions
     *
     * Parameters: IntegerNode - n, int - position
     *
     * Returns: nothing
     *
     */
    private void doubleOddPositionValues(IntegerNode n, int position) {
        if (n==null) {
            return;
        } else {
            if (position % 2 != 0) {
                int doubleVal = n.getElement() * 2;
                n.setElement(doubleVal);
            }
            doubleOddPositionValues(n.next, ++position);
        }
    }

    /*
     *
     * Purpose: recursively determines whether all elements in this IntegerList are negative
     *
     * Parameters: none
     *
     * Returns: boolean - true if all negative, false otherwise
     *
     */
    public boolean allNegative() {
        return allNegative(head,0, 0);
    }

    public boolean allNegative (IntegerNode n, int position, int count) {
        if ((n==null)&&(position==0)) {
            return true;
        } else if ((n==null)&&(position>0)) {
            if (position==count) {
                return true;
            } else return false;
        } else if ((n!=null)&&(position>=0)) {            
            if (n.getElement()<0) {
                ++count;
            }
            return allNegative(n.next, ++position, count);
        }

        return false;
    }

    /*
     *
     * Purpose: recursively determines whether every element in this IntegerList
     *      is sorted in ascending order
     *      {1, 2, 2, 5} is sorted in ascending order
     *      {3, 2, 2, 5} is not sorted in ascending order
     *
     * Parameters: none
     *
     * Returns: boolean - true if sorted, false otherwise
     *
     */
    public boolean isSortedAscending() {
        return isSorted(head, 0, 0);
    }

    public boolean isSorted (IntegerNode n, int position, int count) {
        if ((n==null)&&(position==0)) {
            return true;
        } else if ((n!=null)&&(n.getNext()!=null)) {
            if ((n.getElement()<=n.getNext().getElement())) {
                ++count;
            }
            return isSorted(n.getNext(),++position,count);
        } else if ((n.getNext()==null)) {
            if (position==count) {
                return true;
            } else return false;
        }

        return false;
    }

    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT
    // // DELETE EVERYTHING FROM THIS POINT

    // public int[] printAll() {
    //     IntegerNode curr = head;
    //     int[] arr = new int[count];
    //     int i=0;
    //     while (i<count) {
    //         arr[i++]=curr.getElement();
    //         curr=curr.getNext();
    //     }
    //     return arr;
    // }

    // public static void main (String[] args) {
    //     IntegerLinkedList emptyList = new IntegerLinkedList();
    //     IntegerLinkedList listD = new IntegerLinkedList();

    //     listD.addFront(7);
    //     listD.addFront(4);
    //     listD.addFront(3);
    //     listD.addFront(2);
    //     listD.addFront(1);
    //     listD.addFront(0);
    //     listD.addFront(-1);
    //     listD.addFront(-2);
    //     listD.addFront(-3);
    //     // listD.allNegative();

    //     System.out.println("Non-EmptyList Test:\t"+listD.isSortedAscending());
    //     System.out.println(Arrays.toString(listD.printAll()));
    //     System.out.println("EmptyList Test:\t\t"+emptyList.isSortedAscending());
    //     System.out.println(Arrays.toString(emptyList.printAll()));
    //     return;
    // }

}
