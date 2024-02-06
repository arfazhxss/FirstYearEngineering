/*
 * HeapPriorityQueue.java
 *
 * An implementation of a PriorityQueue using a heap.
 * based on the implementation in "Data Structures and Algorithms
 * in Java", by Goodrich and Tamassia
 *
 * This implementation will throw a Runtime, QueueEmptyException
 *	if the heap is empty and removeHigh is called.
 *
 * This implementation will throw a Runtime, HeapFullException
 *	if the heap is full and insert is called.
 *
 */

public class HeapPriorityQueue implements PriorityQueue {

    private  final static int DEFAULT_SIZE = 10000;

    private  Comparable[] storage;
    private  int currentSize;

    /*
     * initializes storage to capacity of DEFAULT_SIZE
     * Parameters: none
     */
    public HeapPriorityQueue () {
        //calls constructor: HeapPriorityQueue(int size)
        this(DEFAULT_SIZE);
    }


    /*
     * initializes storage to capacity of given size
     * Parameters: none
     * Precondition: size > 0
     */
    public HeapPriorityQueue(int size) {
        storage = new Comparable[size];
        currentSize=0;
    }

    public int size () {
        return currentSize;
    }

    
    public Comparable removeHigh () throws QueueEmptyException {
        Comparable valReturned;
		if (this.isEmpty()) {
			throw new QueueEmptyException();
		} else {
			valReturned = storage[0];
			int indexLast = currentSize-1;
			swapElement (0, indexLast);
			storage[indexLast] = null;
			currentSize--;
			bubbleDown(0);
		} 
        bubbleDown(0);
        return valReturned;
    }

    /*
     * Follows specification given in the PriorityQueue interface
     *
     * Throws:  HeapFullException if called when storage is full
     */
    public void insert (Comparable k) throws HeapFullException {
        if (this.isEmpty()) {
            storage[0]=k;
            ++currentSize;
            return;
        } else if (this.isFull()) {
            throw new HeapFullException();
        } else {
            int newElement = currentSize;
            storage[newElement]=k;
            bubbleUp(newElement);
            ++currentSize;
        }
    }
    

    public boolean isEmpty () {
        if ((currentSize==0)) return true;
        return false;
    }

    /*
     * Purpose:
     *    Determines if the PriorityQueue is full or not.
     *
     * Parameters:
     *    none
     *
     * Preconditions:
     *    none
     *
     * Returns:
     *    true if PriorityQueue is empty, false otherwise.
     *
     */
    private boolean isFull () {
        if ((currentSize==storage.length)) return true;
        else return false;
    }



    /*
     * Purpose:
     *    Bubbles value at index up until the value at
     *      the parent index is bigger by swapping values
     *
     * Parameters:
     *    int index
     *
     * Returns:
     *    None
     *
     */
    private void bubbleUp (int index) {
        if (index==0) return;
        else {
            int indexParent = parent(index);
            // System.out.println("BubbleUp\t[child:"+storage[index]+"\tparent:"+storage[indexParent]+"]");
            if (((storage[index]).compareTo(storage[indexParent]))>0) {
                swapElement(index, indexParent);
            }
            bubbleUp(indexParent);
        }
    }


    /*
     * Purpose:
     *    Bubbles value at index down until the values at
     *      the both child indicies are smaller than that at index.
     *      If either child is bigger than the parent,
     *      swap the value of the parent with the larger of the two children.
     *
     * Parameters:
     *    int index
     *
     * Returns:
     *    None
     *
     */
    private void bubbleDown(int index) {
        int tempIndex;
        if ((hasLeft(index))&&(hasRight(index))) {
            tempIndex = getIndexOfMax(index);
            if (storage[index].compareTo(storage[getIndexOfMax(index)])<0) {
                // System.out.println("["+index+"]"+storage[index]+"->"+"["+getIndexOfMax(index)+"]"+storage[getIndexOfMax(index)]);
                swapElement(index, getIndexOfMax(index));
                bubbleDown(tempIndex);
            } 
        } else if ((hasLeft(index))&&(!hasRight(index))) {
            tempIndex = leftChild(index);
            if (storage[index].compareTo(storage[leftChild(index)])<0) {
                // System.out.println("["+index+"]"+storage[index]+"->"+"["+getIndexOfMax(index)+"]"+storage[leftChild(index)]);
                swapElement(index, leftChild(index));
                bubbleDown(tempIndex);
            }
        } else if ((!hasLeft(index))&&(hasRight(index))) {
            tempIndex = rightChild(index);
            if (storage[index].compareTo(storage[rightChild(index)])<0) {
                // System.out.println("["+index+"]"+storage[index]+"->"+"["+getIndexOfMax(index)+"]"+storage[rightChild(index)]);
                swapElement(index, rightChild(index));
                bubbleDown(tempIndex);
            }
        } 
            
    }

    /*
     * Purpose:
     *    determines the largest of values at index and its
     *      2 child indicies and returns the index of the largest
     *
     * Parameters:
     *    int index - index of the parent
     *
     * Preconditions:
     *    value at index is not null
     *
     * Returns:
     *    int - the index of the largest
     *
     */
    private int getIndexOfMax(int index) {
        if ((hasLeft(index))&&(hasRight(index))) {
            if (storage[leftChild(index)].compareTo(storage[rightChild(index)])<0) {
                return rightChild(index);
            } else if (storage[leftChild(index)].compareTo(storage[rightChild(index)])>0) {
                return leftChild(index);
            } else if (storage[leftChild(index)].compareTo(storage[rightChild(index)])==0) {
                return leftChild(index);
            }
        } 
        return 0;
    }

    /*
     * Purpose:
     *    swaps elements at position p1 and p2 in storage
     *
     * Parameters:
     *    int p1, int p2
     *
     * Preconditions:
     *    p1 and p2 are valid indicies in storage
     *
     * Returns:
     *    None
     *
     */
    private void swapElement (int p1, int p2) {
        Comparable tempPlaceMent;
        tempPlaceMent=storage[p1];
        storage[p1]=storage[p2];
        storage[p2]=tempPlaceMent;
    }

    /*
     * Purpose:
     *    computes and returns the position of parent to pos
     *
     * Parameters:
     *    int pos
     *
     * Preconditions:
     *    pos is a valid index in storage that has a valid parent index
     *
     * Returns:
     *    int - position of the parent
     *
     */
    private int parent (int pos) {
        return ((pos-1)/2);
    }

    /*
     * Purpose:
     *    computes and returns the position of the left child to pos
     *
     * Parameters:
     *    int pos
     *
     * Preconditions:
     *    pos is a valid index in storage that has a valid left child index
     *
     * Returns:
     *    int - position of the left child
     *
     */
    private int leftChild (int pos) {
        return ((2*pos)+1);
    }

    /*
     * Purpose:
     *    computes and returns the position of the right child to pos
     *
     * Parameters:
     *    int pos
     *
     * Preconditions:
     *    pos is a valid index in storage that has a valid right child index
     *
     * Returns:
     *    int - position of the right child
     *
     */
    private int rightChild (int pos) {
        return ((2*pos)+2);
    }


    /*
     * Purpose:
     *    determines whether the is a valid left child to pos
     *
     * Parameters:
     *    int pos
     *
     * Preconditions:
     *    pos is a valid index in storage
     *
     * Returns:
     *    boolean - true if pos has a left child
     *
     */
    private boolean hasLeft (int pos) {
        if (leftChild(pos)<this.currentSize) {
            return true;
        } else return false;
    }

    /*
     * Purpose:
     *    determines whether the is a valid right child to pos
     *
     * Parameters:
     *    int pos
     *
     * Preconditions:
     *    pos is a valid index in storage
     *
     * Returns:
     *    boolean - true if pos has a right child
     *
     */
    private boolean hasRight (int pos) {
        if (rightChild(pos)<this.currentSize) {
            return true;
        } else return false;
    }


    /*
     * Purpose:
     *    constructs a String representation of the elements separated by spaces.
     *    The values in the resulting string are ordered by position in storage,
     *     from smallest index to biggest index, not by priority.
     *
     * Parameters:
     *    None.
     *
     * Returns:
     *    String - the String representation.
     *
     */
     // implementation completed for you.
     public String toString() {
         String s = "";
         String sep = "";
         for(int i=0;i<currentSize;i++) {
             s+= sep + storage[i];
             sep = " ";
         }
         return s;
     }
}
