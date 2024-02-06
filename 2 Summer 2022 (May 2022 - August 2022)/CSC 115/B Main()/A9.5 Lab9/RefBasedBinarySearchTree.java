import java.lang.Math;
/*
 * RefBasedBinarySearchTree.java
 *
 * A ref-based BinaryTree meant to store values of type Integer
 */
public class RefBasedBinarySearchTree extends RefBasedBinaryTree {
    public Integer sum() {
        return sum(this.root);
    }
    private Integer sum(TreeNode root) {
        if (root==null) 
            return 0; 
        return (root.data + sum(root.left) + sum(root.right)); 
    }

    public void insert (Integer value) {
        if (root==null) {
            root=new TreeNode(value);
        } else {
            root = insert (root, value);
        }
    }
    private TreeNode insert(TreeNode NewNode, Integer value) {
        if (NewNode == null) {
            NewNode = new TreeNode(value);
        } else {
            if (value < NewNode.data) {
                NewNode.left = insert(NewNode.left, value);
            } else if (value > NewNode.data){
                NewNode.right = insert(NewNode.right, value);
            }
        }
        return NewNode;
    }    


    public int height() {
        return height(root);
    }

    private int height(TreeNode t) {
        if (t==null) {
            return 0;
        } else if ((height(t.getLeft()))>=(height(t.getRight()))) {
            return (1+height(t.getLeft()));
        } else if ((height(t.getLeft()))<(height(t.getRight()))) {
            return (1+height(t.getRight()));
        }
        return -1;
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

    public boolean contains(Integer toFind) {
        if (root==null) {
            return false;
        } 
        return contains (root,toFind) ;
    }
    private boolean contains (TreeNode t, Integer targ) {
        boolean cond = false;
        while ((t!=null)&&(cond!=true)) {
            if (targ<t.data) {
                t=t.getLeft();
            } else if (targ>t.data) {
                t=t.getRight();
            } else if (targ==t.data) {
                cond=true;
                break;
            }
            cond=contains(t,targ);
        } return cond;
    }
}
