// import java.util.Arrays;

public class IntegerLinkedList implements IntegerList {


    private IntegerNode head;
    private IntegerNode tail;
    private int         count;


    // TODO: add implementations for methods specified in IntegerList interface

    /*
     *
     * Purpose: add val to the front of this list
     *  more space is allocated if necessary
     *  to add ito the list
     *
     * Parameters: int - val
     *
     * Returns: nothing
     *
     */
    public void addFront (int val) {
        IntegerNode newNode = new IntegerNode(val);
        newNode.setNext(head);
        newNode.setPrev(null);
        if (head==null) {
            tail = newNode;
        } else if (head!=null) {
            head.setPrev(newNode);
        }
        head = newNode;
        count++;
    }


    /*
     *
     * Purpose: add val to the back of this list
     *  more space is allocated if necessary
     *  to add it to the list
     *
     * Parameters: int - val
     *
     * Returns: nothing
     *
     */
    public void addBack (int val) {
        if (head==null) {
            addFront(val);
        } else {
            IntegerNode newNode = new IntegerNode(val);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            count++;
        }
    }


    /*
     *
     * Purpose: returns the number of elements in this list
     *
     * Parameters: none
     *
     * Returns: int - the number of elements
     *
     */
    public int size () {
        return count;
    }


    /*
     *
     * Purpose: returns the element at position
     *  where the first value in the list is at position 0
     *
     * Parameters: int - position
     *
     * Pre-Conditions:
     *     for a IntegerList x:
     *    position >= 0 AND
     *    position < x.size()
     *
     * Returns: int - the int at position
     *
     */
    public int getAtPosition (int position) {
        IntegerNode current = head;
        for (int i=0; i<position; i++) {
            current=current.getNext();
        }
        return current.getElement();
    }


    /*
     *
     * Purpose: removes the element at given position in the list,
     *  where the first value in the list is at position 0
     *
     * Parameters: int - position
     *
     * Pre-Conditions:
     *     for a IntegerList x:
     *    position >= 0 AND
     *    position < x.size()
     *
     * Returns: nothing
     *
     */
    public void removeAtPosition (int position) {
        if ((position>=0)&&(position<count)) {
            IntegerNode nodeToDel = head;
            for (int i=0; i<position; i++) {
                nodeToDel=nodeToDel.getNext();
            }
            if (head==nodeToDel) {
                head=nodeToDel.getNext();
            } else if (tail==nodeToDel) {
                tail=tail.getPrev();
            } else {
                nodeToDel.getPrev().setNext(nodeToDel.getNext());
                nodeToDel.getNext().setPrev(nodeToDel.getPrev());
            }
            nodeToDel=null;
            if ((head!=null)&&(tail!=null)) {
                head.setPrev(null);
                tail.setNext(null);
            } else if (head==nodeToDel) {
                head=null;
                tail=null;
            }
            count--;
        }
    }

    /*
     *
     * Purpose: computes the sum of only elements in this list
     *      which hold values that are multiples of n
     *
     * Parameters: int - n
     *
     * Returns: int - the sum
     *
     */
    public int sumMultiplesOf (int n) {
        int sum=0;
        if (n!=0) {
            IntegerNode nodePoint = head;
            for (int i=0;i<count;i++) {
                if (((nodePoint.getElement())%n)==0) {
                    sum+=nodePoint.getElement();
                }
                nodePoint=nodePoint.getNext();
            }
        }
        return sum;
    }

    /*
     *
     * Purpose: multiplies every element in this list by n
     *
     * Parameters: int - n
     *
     * Returns: nothing
     *
     */
    public void multiplyBy (int n) {
        IntegerNode nodePoint = head;
        for (int i=0;i<count;i++) {
            nodePoint.setElement((nodePoint.getElement())*n);
            nodePoint=nodePoint.getNext();
        }
    }


    // public int totalPlaces (int val) {
    //     IntegerNode node = head;
    //     int j=0;
    //     for (int i=0; i<count; i++) {
    //             if (node.getElement()==val) {
    //                 j++;
    //             }
    //             node=node.getNext();
    //     }
    //     return j;
    // }
    // public int[] getPositions (int val) {
    //     IntegerNode node = head;
    //     int[] arr = new int[totalPlaces(val)];
    //     int j=0;
    //     for (int i=0;i<count;i++) {
    //         if (node.getElement()==val) {
    //             arr[j++]=i;
    //         }
    //         node=node.getNext();
    //     }
    //     return arr;
    // } 

    /*
     *
     * Purpose: remove all elements with value val from the list
     *   The number of occurances of i can be >= 0
     *
     * Parameters: int - val
     *
     * Returns: nothing
     *
     */
    public void removeValue(int val) {
        if (head!=null) {
            IntegerNode nodeToDel = head;
            int i=0;
            while (nodeToDel.getNext()!=null) {
                if (nodeToDel.getElement()==val) {
                    // System.out.println("I IS HERE:"+i);
                    removeAtPosition(i--);
                }
                i++;
                nodeToDel=nodeToDel.getNext();
            }
            if (tail.getElement()==val) {
                removeAtPosition(i);
            }
        }
    }
        
        // System.out.println("Total CountVal:"+countVal);
        // int[] arr = new int[countVal];
        // int j=0;
        // for (int i=0;i<count;i++) {
        //     if (node.getElement()==val) {
        //         arr[j++] = i;
        //     }
        //     node=node.getNext();
        // }
    // }


    /*
     *
     * Purpose: finds the biggest value in this list
     *
     * Parameters: none
     *
     * Pre-Conditions:
     *     the list is not empty
     *
     * Returns: int - the biggest value
     *
     */
    public int getMax() {
        IntegerNode nodePoint = head;
        int numMax = getAtPosition(0);
        for (int i=0;i<count;i++) {
            if (nodePoint.getElement()>numMax) {
                numMax=nodePoint.getElement();
            }
            nodePoint=nodePoint.getNext();
        }
        return numMax;
    }

    // DO NOT CHANGE THIS METHOD - the tester depends on it
    public String toString() {
        String s = "";
        IntegerNode tmp = head;

        while (tmp != null) {
            s += tmp.e;
            if(tmp.next != null)
                s += " ";
            tmp = tmp.next;
        }

        return s;
    }


    // DO NOT CHANGE THIS METHOD - the tester depends on it
    public String reverse() {
        String s = "";
        IntegerNode tmp = tail;

        while (tmp != null) {
            s += tmp.e;
            if(tmp.prev!=null)
                s += " ";
            tmp = tmp.prev;
        }

        return s;
    }

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
    
    //     IntegerLinkedList list1 = new IntegerLinkedList();
    //     list1.addBack(0);
    //     list1.addBack(2);
    //     list1.addBack(1);
    //     list1.addBack(2);
    //     list1.addBack(1);
    //     list1.addBack(1);
    //     list1.addBack(4);
    //     list1.addBack(5);
    //     list1.addBack(2);
    //     list1.addBack(5);
    //     list1.addBack(4);
    //     list1.addBack(4);
    //     list1.addBack(2);
    //     list1.addBack(5);
    //     list1.addBack(4);
    //     list1.addBack(5);
    //     list1.addBack(2);
    //     list1.addBack(2);
    //     list1.addBack(5);
    //     list1.addBack(4);
    //     list1.addBack(2);
    //     list1.addBack(5);
    //     // list1.removeAtPosition(0);
    //     // list1.removeAtPosition(0);
    //     // list1.removeAtPosition(1);
    //     // list1.removeAtPosition(0);
    //     // list1.removeAtPosition(0);
    //     // list1.removeAtPosition(0);
    //     // list1.removeAtPosition(0);
    //     // list1.removeAtPosition(0);
    //     // list1.removeValue(0);
    //     list1.removeValue(5);
    //     list1.removeValue(1);
    //     // list1.removeValue(23);
    //     // list1.removeValue(7);

    //     System.out.println("\n\n\nTestList1\nStartsHere");
    //     System.out.println("\nCount:"+list1.size()+"\t\tList:\t"+Arrays.toString(list1.printAll()));
    //     // System.out.println("Reverse:\t"+list1.reverse());

    //     // IntegerLinkedList list2 = new IntegerLinkedList();
    //     // list2.addBack(11);
    //     // list2.addBack(23);
    //     // list2.addFront(15);
    //     // list2.addFront(14);
    //     // list2.addBack(12);
    //     // // list2.addBack(111);
        
    //     // System.out.println("\nTestList2\nStartsHere");
    //     // System.out.println("Count:"+list2.size()+"\nList:"+Arrays.toString(list2.printAll()));
    //     // System.out.println(list2.reverse());
    // }
}
