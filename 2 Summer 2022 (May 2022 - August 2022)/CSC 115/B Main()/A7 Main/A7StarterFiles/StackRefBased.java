import java.util.List;

public class StackRefBased<T extends Object> implements Stack<T> {
    private StackNode<T> top;

    /*
     * Purpose: initializes this StackRefBased's top to null
     * Parameters: none
     */
    public StackRefBased() {
        this.top = null;
    }

    /*
     * Purpose: pushes all elements in list onto this StackRefBased,
     *  where the first element in list is pushed to the bottom of this Stack
     *  and the last element in list is pushed to the top of this Stack.
     * Parameters: List<T> list
     */
    public StackRefBased(List<T> list) {
        top = null;
        for (T element: list) {
            push(element);
        }
    }

    /*
     * Purpose: creates and returns a String representation of this Stack
     * Parameters: none
     * Returns: String - representation of this Stack
     */
     // provided to you for debugging purposes.
     public String toString() {
         String result = "TOP_\n";
         StackNode<T> tmp = top;
         while(tmp != null) {
             result  +=  tmp.getValue() + "\n";
             tmp = tmp.getNext();
         }
         return result;
     }

    /*
     * Purpose: overrides Object's equals method
     *  determines whether this StackRefBased has the same
     *  elements as other StackRefBased, in the same order
     * Parameters: Object other - the other StackRefBased
     * Precondition: other is not null and it is an instance of StackRefBased<T>
     * Returns: boolean - true if they are equal, false otherwise
     */
     // DO NOT CHANGE - tester depends on this method
    public boolean equals(Object other) {
        // this line will cause a warning when you compile
        //  you can ignore this warning
        StackRefBased<T> otherStack = (StackRefBased<T>)other;

        StackNode<T> thisTmp = top;
        StackNode<T> otherTmp = otherStack.top;
        boolean areEqual = true;
        while(thisTmp!=null && otherTmp!=null && areEqual){
            T thisVal = thisTmp.getValue();
            T otherVal = otherTmp.getValue();
            if (!thisVal.equals(otherVal)){
                areEqual = false;
            }
            thisTmp = thisTmp.getNext();
            otherTmp = otherTmp.getNext();
        }

        return !(thisTmp!=null || otherTmp!=null);
    }

    public int size () {
        int count = 0;
        if ((!(this.isEmpty()))) {
            StackNode<T> curr = top;
            while (curr != null) {
                count++;
                // System.out.println(cursize);
                curr = curr.getNext();
            }
        }
        return count;
    } 

    public boolean isEmpty () {
        if (this.top == null) {
            return true;
        } return false;
    }

    public void push (T element) {
        StackNode<T> temp = new StackNode<T>(element);
        if (top==null) {
            top=temp;
            temp.setNext(null);
        } else {
            temp.setNext(top);
            top=temp;
        }

    }

    public T pop () throws StackEmptyException {
        if (this.top==null) {
            throw new StackEmptyException("thrown within pop()");
        }

        T curval = top.getValue();
        top = top.next;

        return curval;
    }

    public T peek () throws StackEmptyException {
        if (top==null) {
            throw new StackEmptyException("thrown in peek()");
        }

        T curval = top.getValue();
        return curval;
    }

    public void makeEmpty () {
        this.top = null;
    }

    // public static void main (String[] args) {
    //     Stack<Integer> s;
    //     try {
    //         s = new StackRefBased<Integer>();
    //         for (int i = 0; i < 10; i++) {
    //             s.push(i);
    //         } 
    //         // System.out.println("");
    //         System.out.println("test1: before pop()\n\n"+s.toString());
    //         System.out.println("isEmpty: "+s.isEmpty());
    //         System.out.println("size: "+s.size());
    //         s.pop();
    //         System.out.println("test2: after pop()\n\n"+s.toString());
    //         System.out.println("isEmpty: "+s.isEmpty());
    //         System.out.println("size: "+s.size());
    //     }
    //     catch (StackEmptyException see) {
    //         System.out.println("Error in main()");
    //     }
    // }
}
