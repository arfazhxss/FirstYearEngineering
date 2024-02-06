
/*
 * ArrayBasedBinaryTree.java
 *
 * An array-based BinaryTree meant to store values of type Integer
 */
public class ArrayBasedBinaryTree implements BinaryTree {
    private static final int INIT_CAPACITY = 5;
    private Integer[] data;
    private int root;
    private int size;

    public ArrayBasedBinaryTree() {
        // TODO...
        // allocate space for data array.
        // What index are you choosing the root to be?
        // initial your size as the number of elements in the empty tree
        data = new Integer[INIT_CAPACITY];
        root = 0;
        size = 0;
    }

    /*
     * Purpose: inserts the given value into data at next available
     *  position in a level-order traversal
     *  The tree remains complete after insertion.
     * Parameters: Integer value - value to insert
     * Returns: nothing
     */
    public void insert(Integer value) {
        // TODO...
        // NOTE: yes, the underlying data structure is an array,
        //  but we are just USING the array to store the data.
        //  The way we traverse the data will expose its binary tree structure
        if (size==data.length) {
            expandAndCopy();
        }
        data[size] = value;
        size++;
    }

    protected void expandAndCopy() {
        Integer[] newData = new Integer[data.length*2];
        for(int i=0; i<data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /*
     * Purpose: calculates and returns the index of t's left child
     * Parameters: int t - index of current element in this ArrayBasedBinaryTree
     * Returns: int - index of left child
     */
    protected int getLeft(int t) {
        return ((2*t)+1);
    }

    /*
     * Purpose: calculates and returns the index of t's right child
     * Parameters: int t - index of current element in this ArrayBasedBinaryTree
     * Returns: int - index of right child
     */
    protected int getRight(int t) {
        return ((2*t)+2);
    }


    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }
    private void inOrderRec (int curIndex) {
        try {
            if ((curIndex>=size)||(data[curIndex]==null)) {
                return;
            } else {
                inOrderRec(getLeft(curIndex));
                System.out.print(data[curIndex]+" ");
                inOrderRec(getRight(curIndex));
            }
        } catch (Exception e) {
            System.out.println("Exception in inOrderRec");
        }
    }


    public void preOrder(){
        preOrderRec(root);
        System.out.println();
    }
    private void preOrderRec (int curIndex) {
        try {
            if ((curIndex>=size)||(data[curIndex]==null)) {
                return;
            } else {
                System.out.print(data[curIndex]+" ");
                preOrderRec(getLeft(curIndex));
                preOrderRec(getRight(curIndex));
            }
        } catch (Exception e) {
            System.out.println("Exception in preOrderRec");
        }
    }


    public void postOrder(){
        postOrderRec(root);
        System.out.println();
    }
    private void postOrderRec (int curIndex) {
        try {
            if ((curIndex>=size)||(data[curIndex]==null)) {
                return;
            } else {
                postOrderRec(getLeft(curIndex));
                postOrderRec(getRight(curIndex));
                System.out.print(data[curIndex] + " ");
            } 
        } catch (Exception e) {
            System.out.println("Exception in postOrderRec");
        }
    }


     public int height() {
        return heightRec(root);
     }
     private int heightRec(int curIndex) {
            if ((curIndex>=size)||(data[curIndex]==null)) {
                return 0;
            } else {
                int LeftH=heightRec(getLeft(curIndex));
                int RightH=heightRec(getRight(curIndex));
                // System.out.println("Left side: " +(LeftH+1) + " Right side: " + (RightH+1));
                if (LeftH>RightH) return (LeftH+1);
                else if (RightH>LeftH) return (RightH+1);
                else return LeftH+1;
            }
     }


    /*
     * Purpose: returns a String reprensentation of a in-order traversal
     *     of this ArrayBasedBinaryTree
     * Parameters: none
     * Returns: String - the representation
     */
    // written for you - do not change
    // NOTICE: we use the helper methods to get the index of the left/right
    //   children of the current position in the tree.
    // This method will not work until you have completed those methods correctly.
    public String toString() {
        return toString(root);
    }

    private String toString(int t) {
        if (t>=data.length || data[t] == null)
            return "";

        String s = "";
        s += toString(getLeft(t));
        s += data[t] + " ";
        s += toString(getRight(t));

        return s;
    }

    // provided for testing of ArrayBasedBinaryTree class traversal methods
    public static void main(String[] args) {
        // TODO: draw out a visual representation of the tree structure
        //      of myTree after the followig insertions are complete.
        // Hand trace the 3 traverals of your drawn tree and
        //    compare your trace to the program output.

        BinaryTree myTree = new ArrayBasedBinaryTree();
        for(int i=2; i<8; i++) {
            myTree.insert(i);
        }
        System.out.println("inOrder String: "+myTree.toString());
        System.out.println("in");
        myTree.inOrder();
        System.out.println("pre");
        myTree.preOrder();
        System.out.println("post");
        myTree.postOrder();
        System.out.println(myTree.height());
    }

}
