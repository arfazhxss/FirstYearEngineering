import java.lang.Math;
import java.util.LinkedList;
/*
 * RefBasedBinaryTree.java
 *
 * A ref-based BinaryTree meant to store values of type Integer
 */
public class RefBasedBinaryTree implements BinaryTree {
    protected TreeNode root;

    public RefBasedBinaryTree() {
        this.root = null;
    }

    // NOTE: the following stubs provided for you so that tester will compile
    public Integer sum() {
        return sum(this.root);
    }
    private Integer sum(TreeNode root) {
        if (root == null) 
            return 0; 
        return (root.data + sum(root.left) + sum(root.right)); 
    }

    public boolean contains(Integer toFind) {
        if (root==null) {
            return false;
        } 
        return contains (root,toFind) ;
    }
    private boolean contains (TreeNode t, Integer targ) {
        if (t==null) {
            return false;
        } else if (t.data==targ) {
            return true;
        }
        if (contains(t.getLeft(),targ)) return true;
        else return contains(t.getRight(),targ);
    }

    /*
     * Purpose: recursively determines the height of each subtree and
     *   recurisively calls insert on the subtree with the smaller height,
     *   or the left subtree if they are the same height.
     *   A new node is created and inserted when a leaf node is reached.
     * Parameters: TreeNode parent - the parent to t
     *             TreeNode t - the current TreeNode in recursive traversal
     *             Integer value - the value to be inserted
     * Returns: void
     */
     // Same as Lab8 reference-based insert method
    public void insert(Integer value) {
        if (root==null) {
            root = new TreeNode(value);
        } else {
            insert(null, root, value);
        }
    }

    private void insert(TreeNode parent, TreeNode t, Integer value) {
        if (t==null) {
            if(parent.getLeft()==null) {
                parent.setLeft(new TreeNode(value));
            } else {
                parent.setRight(new TreeNode(value));
            }
        }  else {
            int htLeft = height(t.getLeft());
            int htRight = height(t.getRight());
            if (htLeft>htRight) {
                insert(t, t.getRight(), value);
            } else {
                insert(t, t.getLeft(), value);
            }
        }
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode t) {
        if (t==null) {
            return 0;
        }
        int highest = Math.max(height(t.getLeft()), height(t.getRight()));
        return 1 + highest;
    }


    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(TreeNode t) {
        if (t==null) {
            return;
        }
        inOrder(t.getLeft());
        System.out.print(t.getValue() + " ");
        inOrder(t.getRight());
    }


    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(TreeNode t) {
        if (t==null) {
            return;
        }
        System.out.print(t.getValue() + " ");
        preOrder(t.getLeft());
        preOrder(t.getRight());
    }


    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(TreeNode t) {
        if (t==null) {
            return;
        }
        postOrder(t.getLeft());
        postOrder(t.getRight());
        System.out.print(t.getValue() + " ");
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

    private String toString(TreeNode t) {
        if(t==null) {
            return "";
        }
        String s = "";
        s += toString(t.getLeft());
        s += t.getValue() + " ";
        s += toString(t.getRight());

        return s;
    }
}
