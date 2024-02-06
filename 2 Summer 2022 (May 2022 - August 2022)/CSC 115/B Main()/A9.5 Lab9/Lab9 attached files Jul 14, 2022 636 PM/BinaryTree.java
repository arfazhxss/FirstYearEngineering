public interface BinaryTree {

    /*
     * Purpose: inserts value into this BinaryTree
     * Parameters: Integer value - to be in inserted
     * Returns: Nothing
     */
    public void insert(Integer value);


    /*
     * Purpose: prints each value in this BinaryTree
     *          following an in-order traversal
     * Parameters: none
     * Returns: Nothing
     */
    public void inOrder();


    /*
     * Purpose: prints each value in this BinaryTree
     *          following a pre-order traversal
     * Parameters: none
     * Returns: Nothing
     */
    public void preOrder();


    /*
     * Purpose: prints each value in this BinaryTree
     *          following a post-order traversal
     * Parameters: none
     * Returns: Nothing
     */
    public void postOrder();


    /*
     * Purpose: returns the height of this BinaryTree
     *   where an empty tree is considered to be of height 0
     * Parameters: none
     * Returns: int - the height
     */
     public int height();


    /*
     * Purpose: returns the sum of all the elements in this BinaryTree
     * Parameters: none
     * Returns: Integer - the sum
     */
      public Integer sum();

     /*
      * Purpose: returns true if toFind is found in this BinaryTree,
      *           false otherwise
      * Parameters: Integer toFind
      * Returns: boolean - true if found, false otherwise
      */
      public boolean contains(Integer toFind);

}
