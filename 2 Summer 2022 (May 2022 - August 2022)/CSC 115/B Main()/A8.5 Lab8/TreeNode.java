/*
 * TreeNode.java
 *
 * A node for a reference based BinaryTree, assuming that the BinaryTree
 * is meant to store values of type Integer
 *
 */
class TreeNode {
    private Integer data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


    public Integer getValue() {
        return this.data;
    }

    public void setValue(Integer data) {
        this.data = data;
    }


    public TreeNode getLeft() {
        return this.left;
    }


    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return this.right;
    }


    public void setRight(TreeNode right) {
        this.right = right;
    }


    public String toString() {
        return data.toString();
    }
}
