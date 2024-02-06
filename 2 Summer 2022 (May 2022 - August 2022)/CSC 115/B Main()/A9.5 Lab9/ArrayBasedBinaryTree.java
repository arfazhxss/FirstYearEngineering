import java.util.Arrays;
public class ArrayBasedBinaryTree implements BinaryTree {
    private static final int INIT_CAPACITY = 5;
    protected Integer[] data;
    protected int root;
    protected int size;

    public ArrayBasedBinaryTree() {
        this.data = new Integer[INIT_CAPACITY];
        root = 0;
        size = 0;
    }

    // NOTE: the following stubs provided for you so that tester will compile
    public Integer sum() {
        Integer sumTotal=0;
        try {
            for (int i=0; i<size; i++) {
                // System.out.print(sumTotal+" ");
                sumTotal+=data[i];
            }
        } catch (Exception See) {
            System.out.println("Exception in Sum()");
        }
        return sumTotal;
    }

    public boolean contains(Integer toFind) {
        try {
            for (int i=0; i<size; i++) {
                if (toFind==data[i]) {
                    // System.out.println(true);
                    return true;
                }
            }
        } catch (Exception See) {
            System.out.print("Exception at Contain() :BT");
        }
        return false;
    }

    /*
     * Purpose: inserts the given value into data at next available
     *  position in a level-order traversal
     *  The tree remains complete after insertion.
     * Parameters: Integer value - value to insert
     * Returns: nothing
     */
     // Same as Lab8 array-based insert method
    public void insert(Integer value) {
        if (size>=data.length) {
            expandAndCopy();
        }
        data[size++] = value;
    }

    protected void expandAndCopy() {
        Integer[] newData = new Integer[data.length*2];
        for(int i=0; i<data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    protected int getLeft(int t) {
        return 2*t+1;
    }

    protected int getRight(int t) {
        return 2*t+2;
    }

    public int height() {
        // O(1) implementation of height for complete tree:
        // double logValue = Math.log(size + 1)/Math.log(2);
        // return (int)(Math.ceil(logValue));

        // O(log n) implementation of height for complete tree
        return height(root);
    }

    private int height(int t) {
        if (t>=data.length || data[t] == null)
            return 0;
        return 1 + height(getLeft(t));
    }

    /*
     * Purpose: prints each value in this BinaryTree
     *          following an in-order traversal
     * Parameters: none
     * Returns: Nothing
     */
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    /*
     * Purpose: prints each value in the BinaryTree at index t
     *          following an in-order traversal
     * Parameters: int t - index of t's root
     * Returns: Nothing
     */
    private void inOrder(int t) {
        if (t>=data.length || data[t]==null) {
            return;
        }
        inOrder(getLeft(t));
        System.out.print(data[t] + " ");
        inOrder(getRight(t));
    }

    /*
     * Purpose: prints each value in this BinaryTree
     *          following a pre-order traversal
     * Parameters: none
     * Returns: Nothing
     */
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    /*
     * Purpose: prints each value in the BinaryTree at index t
     *          following a pre-order traversal
     * Parameters: int t - index of t's root
     * Returns: Nothing
     */
    private void preOrder(int t) {
        if (t>=data.length || data[t]==null) {
            return;
        }
        System.out.print(data[t] + " ");
        preOrder(getLeft(t));
        preOrder(getRight(t));
    }


    /*
     * Purpose: prints each value in this BinaryTree
     *          following a post-order traversal
     * Parameters: none
     * Returns: Nothing
     */
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    /*
     * Purpose: prints each value in the BinaryTree at index t
     *          following a post-order traversal
     * Parameters: int t - index of t's root
     * Returns: Nothing
     */
    private void postOrder(int t) {
        if (t>=data.length || data[t]==null) {
            return;
        }
        postOrder(getLeft(t));
        postOrder(getRight(t));
        System.out.print(data[t] + " ");
    }

    /*
     * Purpose: returns a String reprensentation of this BinaryTree
     *  following an in-order traversal
     * Parameters: none
     * Returns: String - the representation
     */
    public String toString() {
        return toString(root);
    }

    private String toString(int t) {
        if (t>=data.length || data[t] == null) {
            return "";
        }
        String s = "";
        s += toString(getLeft(t));
        s += data[t] + " ";
        s += toString(getRight(t));

        return s;
    }
}
