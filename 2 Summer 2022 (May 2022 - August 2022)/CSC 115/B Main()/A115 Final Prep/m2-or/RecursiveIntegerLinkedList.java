import java.util.Arrays;
public class RecursiveIntegerLinkedList implements IntegerList {

    private IntegerNode    head;
    private IntegerNode    tail;
    private int		       count;


    //vli minor typo
    /*
     *
     * Purpose: add val to the front of this list
     *  more space is allocated if necessary
     *  to add it to the list
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
        // return posiRec(head,position,0);

        IntegerNode tmp = new IntegerNode(-9999);
        IntegerNode nodeToGo = goToNodeRec(head, position, 0, tmp);
        return nodeToGo.getElement();

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
            IntegerNode tmp = new IntegerNode(-9999);
            IntegerNode nodeToDel = goToNodeRec(head, position, 0, tmp);
            // IF IT WASN'T A RECURSION, WE'D HAVE USED THIS:
            // for (int i=0; i<position; i++) {
            //     nodeToDel=nodeToDel.getNext();
            // }

            // System.out.println("printOutNodeCurElement:[{("+nodeToDel.getElement()+")}]");
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

        // n = curr
        // position = position
        // countInside = curr_position
        // tmp = tmp

    public IntegerNode goToNodeRec (IntegerNode n, int position, int countInside, IntegerNode tmp) {
        if (n!=null) {
            if (countInside==position) {
                tmp=n;
                return n;
            } else {
                // System.out.println("countInLoopRec: "+countInside+"\tElement: "+n.getElement());
                tmp=goToNodeRec(n.next, position, ++countInside,tmp);
            }
        } return tmp;
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
        return sumMultRec(head, n, 0, 0);
    }
    public int sumMultRec (IntegerNode n, int num, int countInside, int sum) {
        if (n==null) {
            return sum;
        } else if (num!=0) {
            if ((n.getElement()%num)==0) {
                // System.out.print("["+countInside+"]:"+n.getElement()+"\n");
                sum+=n.getElement();
            }
            sum = sumMultRec(n.next, num, ++countInside, sum);
        } return sum;
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
        multByRec(head,n);
    }
    public void multByRec(IntegerNode n, int num) {
        if (n==null) {
            return;
        } else {
            int valMult = (n.getElement()*num);
            n.setElement(valMult);
            multByRec(n.next, num);
        }
    }


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
        if (count!=0) {
            remValHelperRec(head, val, 0);
        }
    }
    public void remValHelperRec (IntegerNode n, int value, int position) {
        if (n==null) {
            return;
        } else if (n.getElement()==value) {
            removeAtPosition(position--);
            remValHelperRec(n.next, value, ++position);
        } else {
            remValHelperRec(n.next, value, ++position);
        }
    }

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
        return maxValRec(head,-9999);
    }
    public int maxValRec (IntegerNode n, int max) {
        if (n==null) {
            return max;
        } else {
            if (n.getElement()>max) {
                max=n.getElement();
            }
            max=maxValRec(n.next, max);
        } return max;
    }

    // DO NOT CHANGE THIS METHOD - the tester depends on it
    public String toString() {
        return toString(head);
    }

    // DO NOT CHANGE THIS METHOD - the tester depends on it
    private String toString(IntegerNode n) {
        if (n==null) {
           return "";
       } else {
           if (n.next!=null) {
               return n.getElement() + " " + toString(n.next);
           } else {
               return n.getElement() + toString(n.next);
           }
       }
    }

    // DO NOT CHANGE THIS METHOD - the tester depends on it
    public String reverse() {
        return reverse(tail);
    }

    // DO NOT CHANGE THIS METHOD - the tester depends on it
    private String reverse(IntegerNode n) {
        if (n==null) {
           return "";
       } else {
           if (n.prev!=null) {
               return n.getElement() + " " + reverse(n.prev);
           } else {
               return n.getElement() + reverse(n.prev);
           }
       }
    }

//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT
//     // // DELETE EVERYTHING FROM THIS POINT

    public int[] printAll() {
        IntegerNode curr = head;
        int[] arr = new int[count];
        int i=0;
        while (i<count) {
            arr[i++]=curr.getElement();
            curr=curr.getNext();
        }
        return arr;
    }

    public static void printList (IntegerNode start) {
        IntegerNode cur = start;
        for (int i=0; i<10; i++) {
            System.out.println(cur.getElement()+" ");
            cur=cur.getNext();
        }
        System.out.println();
    }

    public void func() {
        IntegerNode curr = head;
        IntegerNode a = head;
        IntegerNode b = head.next.next;
        
        // System.out.println("INSIDE1");
        // System.out.println("a: "+a.getElement());
        // System.out.println("b: "+b.getElement());

        a.next=b.next;
        b.prev.next=a;
        // System.out.println("test:\t"+b.next.next.next.getElement());
        b.next.next.next=b;
        printList(b.prev);

        // System.out.println("INSIDE2");
        // System.out.println("a: "+a.getElement());
        // System.out.println("b: "+b.getElement());
    }

    public static void main (String[] args) {
        RecursiveIntegerLinkedList emptyList = new RecursiveIntegerLinkedList();
        RecursiveIntegerLinkedList listD = new RecursiveIntegerLinkedList();

        // listD.addFront(7);
        // listD.addFront(4);
        // listD.addFront(3);
        // listD.addFront(2);
        // listD.addFront(1);
        // listD.addFront(0);
        // listD.addFront(-1);
        // listD.addFront(-2);
        // listD.addFront(-3);
        // listD.addBack(8);
        // listD.addFront(34);
        // // listD.removeAtPosition(0);
        // listD.addBack(22);
        // listD.addBack(13);
        // listD.addBack(2);
        // listD.addBack(3);
        // listD.addFront(4);
        // listD.addFront(7);
        // listD.addBack(11);
        // listD.addBack(23);
        // listD.addFront(15);
        // listD.removeValue(0);
        
        //FinalExamNight
        listD.addBack(8);
        listD.addBack(1);
        listD.addBack(3);
        listD.addBack(2);
        listD.addBack(4);
        listD.func();

        // System.out.println("\nNon-EmptyList Test:");
        // System.out.println("printAll:\t\t"+Arrays.toString(listD.printAll()));
        // System.out.println("count:\t\t\t"+listD.size());        
        // System.out.print("ElementsWithPositions:");

        // for (int i=0;i<listD.size();i++) {
        //     if (i==0) {
        //         System.out.print("\t");
        //     }
        //     System.out.print("["+i+"]:"+listD.getAtPosition(i)+" ");  
        //     if ((i%5==0)&&(i!=0)) {
        //         System.out.print("\n\t\t\t");
        //     }
        // }
        // System.out.println();
        
        // int numChk=2;
        // System.out.println("SumMultipliesOf "+numChk+":\t"+listD.sumMultiplesOf(numChk));


        // System.out.println("\n\nEmptyList Test:");
        // System.out.println("printAll:\t"+Arrays.toString(emptyList.printAll()));
        // System.out.println("count:\t\t"+emptyList.size());
        return;
    }
}
