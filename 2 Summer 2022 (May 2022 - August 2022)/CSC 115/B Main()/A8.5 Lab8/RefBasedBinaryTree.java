import java.lang.Math;
/*
 * RefBasedBinaryTree.java
 *
 * A ref-based BinaryTree meant to store values of type Integer
 * A BinaryTree with null root is considered to height 0 in this implementation.
 */
public class RefBasedBinaryTree implements BinaryTree {
    private TreeNode root;

    public RefBasedBinaryTree() {
        // TODO...

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
    // written for you - do not change
    public void insert(Integer value){
        insert(null, root, value);
    }

    private void insert(TreeNode parent, TreeNode t, Integer value) {
        if (t==null) {
            if(parent == null)
                root = new TreeNode(value);
            else if(parent.getLeft()==null)
                parent.setLeft(new TreeNode(value));
            else
                parent.setRight(new TreeNode(value));

        }  else {
            int htLeft = height(t.getLeft());
            int htRight = height(t.getRight());
            if (htLeft<=htRight)
                insert(t, t.getLeft(), value);
            else
                insert(t, t.getRight(), value);
        }
    }


    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }    
    private void inOrderRec(TreeNode currNode){
        if (currNode == null) {
            return;
        } else {
            inOrderRec(currNode.getLeft());
            System.out.print(currNode.getValue() + " ");
            inOrderRec(currNode.getRight());
        }
    }


    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(TreeNode currNode) {
        if (currNode == null) {
            return;
        } else {
            System.out.print(currNode.getValue() + " ");
            preOrder(currNode.getLeft());
            preOrder(currNode.getRight());
        }
    }


    public void postOrder(){
        postOrder(root);
        System.out.println();
    }     
    private void postOrder(TreeNode currNode) {
        if (currNode == null) {
            return;
        } else {
            postOrder(currNode.getLeft());
            postOrder(currNode.getRight());
            System.out.print(currNode.getValue() + " ");
        }
    }


    public int height() {
        return height(root);
    }
    private int height(TreeNode currNode) {
        if (currNode==null) {
            return 0;
        } else {
            if (height(currNode.getLeft())>height(currNode.getRight())) {
                return (height(currNode.getLeft())+1);
            } else if (height(currNode.getLeft())<height(currNode.getRight())) {
                return (height(currNode.getRight())+1);
            } else if (height(currNode.getLeft())==height(currNode.getRight())) {
                return (height(currNode.getLeft())+1);
            }
        }
        return 0;
    }

    /*
     * Purpose: returns a String reprensentation of a in-order traversal
     *     of this RefBasedBinaryTree
     * Parameters: none
     * Returns: String - the representation
     */
    // written for you - do not change
    public String toString() {
        return toString(root);
    }

    private String toString(TreeNode t) {
        if(t==null)
            return "";

        String s = "";

        s += toString(t.getLeft());
        s += t.getValue() + " ";
        s += toString(t.getRight());

        return s;
    }


    // provided for testing of RefBasedBinaryTree class traversal methods
    public static void main(String[] args) {
        // TODO: draw out a visual representation of the tree structure
        //      of myTree after the followig insertions are complete.
        //  Ask the TA for help if you need here - this is trickier to trace.
        // Hand trace the 3 traverals of your drawn tree and
        //    compare your trace to the program output.

        BinaryTree myTree = new RefBasedBinaryTree();
        for(int i=2; i<8; i++) {
            myTree.insert(i);
        }
        System.out.println("in");
        myTree.inOrder();
        System.out.println("pre");
        myTree.preOrder();
        System.out.println("post");
        myTree.postOrder();

        System.out.println("toString {in-order}\n" + myTree);
    }

}
