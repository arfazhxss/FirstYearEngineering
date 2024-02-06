import java.util.*;
// import java.util.LinkedList;
// import java.util.List;

 /*
 * An implementation of a binary search tree.
 *
 * This tree stores both keys and values associated with those keys.
 *
 * More information about binary search trees can be found here:
 *
 * http: *en.wikipedia.org/wiki/Binary_search_tree
 *
 * Note: Wikipedia is using a different definition of
 *       depth and height than we are using.  Be sure
 *       to read the comments in this file for the
 *          height function.
 */
public class BinarySearchTree <K extends Comparable<K>, V>  {

    public static final int BST_PREORDER  = 1;
    public static final int BST_POSTORDER = 2;
    public static final int BST_INORDER   = 3;

    // These are package friendly for the TreeView class
    BSTNode<K,V>  root;
    int           count;


    public BinarySearchTree () {
        root = null;
        count = 0;
    }


    /*
     * Purpose:
     *
     * Insert a new Key: Value Entry into the tree.  If the Key
     * already exists in the tree, update the value stored at
     * that node with the new value.
     *
     * Pre-Conditions:
     *     the tree is a valid binary search tree
    */
    public void insert (K k, V v) {
        if (root==null) {
            root = new BSTNode<K,V>(k,v);
            count++;
            // System.out.println("count added:["+root.toString()+"], count: "+this.count);
            return;
        } else {
            insertRec (root, k, v);
            // System.out.println("count added:["+newNode.toString()+"], count: "+this.count);
            return;
        }
    }

    public BSTNode<K,V> insertRec (BSTNode<K,V> curr, K k, V v) {
        if (curr == null) {
            // System.out.println("00\tNew Key being initiated with Key ["+k+"] with Value:\t"+v);
            curr = new BSTNode<K,V>(k,v);
            count++;
        } else {
            if (k.compareTo(curr.key) < 0) { //smaller than key we have
                curr.left = insertRec (curr.left, k, v);
            } else if (k.compareTo(curr.key) > 0) { //greater than key we have
                curr.right = insertRec (curr.right, k, v);
            } else if (k.compareTo(curr.key) == 0) { //equal to
                // System.out.println("01\tKey Already Exist, Key ["+k+"] updating to Value:\t"+v);
                curr.setValue(v);
                // System.out.println("02\tcurrVal is: "+v);
            }
        }
        return curr;
    }    
    
    /*
     * Purpose:
     *
     * Return the value stored at key.  Throw a KeyNotFoundException
     * if the key isn't in the tree.
     *
     * Pre-conditions:
     *    the tree is a valid binary search tree and k is not null
     *
     * Returns:
     *    the value stored at key
     *
     * Throws:
     *    KeyNotFoundException if key isn't in the tree
     */
    public V find (K key) throws KeyNotFoundException {
        if (root==null) {
            // System.out.println("99\tcurr [root] is null, key to look:"+key);
            throw new KeyNotFoundException();
        }
        // System.out.println("1\troot not null\n2\tKey to find:\t"+key);
        return findRecV (root, key);
    }

    public V findRecV (BSTNode<K,V> curr, K key) throws KeyNotFoundException {
        if ((curr!=null)&&(key!=null)) {
            if (key.compareTo(curr.getKey())<0) {
                // System.out.println("3\tcurr not null, key to look: "+key);
                // System.out.println("4\tcurr key going left, curr key:\t"+curr.getKey());
                // curr=curr.getLeft();
                return findRecV(curr.getLeft(), key);
            } else if (key.compareTo(curr.getKey())>0) {
                // System.out.println("3\tcurr not null, key to look: "+key);
                // System.out.println("4\tcurr key going right, curr key:\t"+curr.getKey());
                // curr=curr.getRight();
                return findRecV(curr.getRight(), key);
            } else if (key.compareTo(curr.getKey())==0) {
                // System.out.println("3\tcurr not null, key to look: "+key);
                // System.out.println("5\tcurr key FOUND, curr key:\t"+curr.getKey()+"\tValue: "+curr.getValue());
                // break;
                return curr.getValue();
            } else {
                // System.out.println("99\tcurr is null, key to look: "+key);
                throw new KeyNotFoundException();
            } 
        } if (((curr==null)||(key==null))) {
            throw new KeyNotFoundException();
        } return curr.getValue();
    }

    /*
     * Purpose:
     *
     * Return the number of nodes in the tree.
     *
     * Returns:
     *    the number of nodes in the tree.
     */
    public int size() {
        return count;
    }

    /*
     * Purpose:
     *    Remove all nodes from the tree.
     */
    public void clear() {
        this.count=0;
        this.root=null;
    }

    /*
     * Purpose:
     *
     * Return the height of the tree.  We define height
     * as being the number of nodes on the path from the root
     * to the deepest node.
     *
     * This means that a tree with one node has height 1.
     *
     * Examples:
     *    See the assignment PDF and the test program for
     *    examples of height.
     */
    public int height() {
        return heightRec(root);
    }

    public int heightRec (BSTNode<K,V> curr) {
        if (curr==null) {
            return 0;
        } else if (heightRec(curr.getLeft())>=heightRec(curr.getRight())) {
            return 1+heightRec(curr.getLeft());
        } else if (heightRec(curr.getLeft())<heightRec(curr.getRight())) {
            return 1+heightRec(curr.getRight());
        } return -9999;
    }


    /*
     * Purpose:
     *
     * Return a list of all the key/value Entrys stored in the tree
     * The list will be constructed by performing a level-order
     * traversal of the tree.  If the tree is empty, the returned list is empty.
     *
     * A level order traversal of a tree cannot be done without the help
     *  of a secondary data structure
     *
     * It is commonly implemented using a queue of nodes as the secondary
     *  data structure.
     *  You will still be adding the "visited" elements to l as you do in the other
     *  traversal methods but you will create an additional q to hold nodes still to visit
     *
     *  From wikipedia (they call it breadth-first), the algorithm for level order is:
     *
     *    levelorder()
     *        q = empty queue
     *        q.enqueue(root)
     *        while not q.empty do
     *            node := q.dequeue()
     *            visit(node)
     *            if node.left != null then
     *                  q.enqueue(node.left)
     *            if node.right != null then
     *                  q.enqueue(node.right)
     *
     * Note that you can use the Java LinkedList as a Queue
     *  and then use only the removeFirst() and addLast() methods on q
     *
     * Parameters: None
     *
     * Returns: List< Entry<K,V> > - list of all key/value Entrys in the tree
     *  in a levelorder traversal
     */
    public List<Entry<K, V>> entryList() {
        List<Entry<K, V>> collectionList = new LinkedList<Entry<K, V>>();
        
        //creating a Queue
        Queue<BSTNode<K, V>> tempQueueList = new LinkedList<BSTNode<K, V>>();
        
        //adding root if root is not null
        if (root != null) {
            tempQueueList.add(root);
        }
        // System.out.println("q-outsBefore\t"+q.toString());
        
        int i=0;
        while (!tempQueueList.isEmpty()) {                                          //looping until q is empty
            // System.out.println("q-inside-1\t"+tempQueueList.toString());
            
            final BSTNode<K, V> node = tempQueueList.remove();                      //removing first node from queue
            // System.out.println("deleted key: "+node.key+"\tdeleted value: "+node.value);
            
            Entry<K, V> entry = new Entry<K, V>(node.key, node.value);  //creating an Entry object
            
            collectionList.add(entry);                                               //adding to list
            // System.out.println("collection list update ["+(++i)+"]: "+collectionList.toString()+"");
            
            if (node.left != null) {                                    //if left is not null, adding to q
                tempQueueList.add(node.left);
                // System.out.println("curr-node: "+(node.toString())+"\t"+"left add: {{"+node.left+"}}");
            }

            if (node.right != null) {                                   //if right is not null, adding to q
                tempQueueList.add(node.right);
                // System.out.println("curr-node: "+(node.toString())+"\t"+"right add: {{"+node.right+"}}");
            }
            // System.out.println("q-inside-2\t"+tempQueueList.toString());
            // System.out.println();
        }
        // System.out.println("LevelOrder:\t"+collectionList.toString()+"");
        return collectionList;
    }

    /*
     * Purpose:
     *
     * Return a list of all the key/value Entrys stored in the tree
     * The list will be constructed by performing a traversal
     * specified by the parameter which.
     *
     * If which is:
     *    BST_PREORDER    perform a pre-order traversal
     *    BST_POSTORDER    perform a post-order traversal
     *    BST_INORDER    perform an in-order traversal
     * Parameters: int which
     *
     * Precondition: which is one of BST_PREORDER, BST_POSTORDER or BST_INORDER
     *
     * Returns: List< Entry<K,V> > - list of all key/value Entrys in the tree
     */

    private void doInOrder (BSTNode<K,V> curr, List <Entry<K,V>> collectionList) {
        if (curr==null) {return;} 
        else {
            doInOrder(curr.left, collectionList);
            collectionList.add(new Entry<K,V>(curr.key, curr.value));
            doInOrder(curr.right, collectionList);
        }
    }
    
    private void doPreOrder(BSTNode<K,V> curr, List <Entry<K,V>> collectionList) {
        if (curr==null) {return;}
        else {
            collectionList.add(new Entry<K,V>(curr.key,curr.value));
            doPreOrder(curr.left, collectionList);
            doPreOrder(curr.right, collectionList);
        }
    }

    private void doPostOrder (BSTNode<K,V> curr, List <Entry<K,V>> collectionList) {
        if (curr==null) {return;}
        else {
            doPostOrder(curr.left, collectionList);
            doPostOrder(curr.right, collectionList);
            collectionList.add(new Entry<K,V>(curr.key, curr.value));
        }
    }

    public List<Entry<K,V>> entryList (int which) {
        
        List<Entry<K, V> > l = new LinkedList<Entry<K, V> > ();
        
        if (which==BST_PREORDER) {doPreOrder(root, l); 
            // System.out.println("PreOrder:\t"+l.toString());
        } 
        else if (which==BST_POSTORDER) {doPostOrder(root, l); 
            // System.out.println("PostOrder:\t"+l.toString());
        } 
        else if (which==BST_INORDER) {doInOrder(root, l); 
            // System.out.println("InOrder:\t"+l.toString());
        }
        // System.out.println("chosenList:\t"+l.toString());
        return l;
    }

    /*
     * Your instructor had the following private methods in their solution:
     * private void doInOrder (BSTNode<K,V> n, List <Entry<K,V> > l);
     * private void doPreOrder (BSTNode<K,V> n, List <Entry<K,V> > l);
     * private void doPostOrder (BSTNode<K,V> n, List <Entry<K,V> > l);
     * private int doHeight (BSTNode<K,V> t)
     */
}
