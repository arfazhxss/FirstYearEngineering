public class LinkedPriorityQueue implements PriorityQueue {

    private ComparableNode    front;
    private ComparableNode     back;
    private int        count;

    public LinkedPriorityQueue () {
        front = null;
        back = null;
        count = 0;
    }

     public void insert ( Comparable key ) {
        ComparableNode nn = new ComparableNode(key);

        // add to front if empty
        if(front == null) {
            front = nn;
            back = nn;
            count++;
        }
        // add to back if priority is lower than lowest in list
        // will generate warning - you can ignore
        else if((back.getElement()).compareTo(key) > 0) {
            append(nn);

        } else {
            // find node-after in q that will follow nn
            ComparableNode after = front;

            // will generate warning - you can ignore
            while(after!=null && (after.getElement()).compareTo(key) > 0) {
                after = after.next;
            }
            // insert nn into q before node-after
            insertBefore(nn, after);
        }

    }

    public Comparable removeHigh () throws QueueEmptyException {
        if (count == 0)
            throw new QueueEmptyException();

        Comparable retval = front.getElement();
        front = front.next;
        if(front != null) {
            front.prev = null;
        }
        count--;

        if (count == 0) {
            back = null;
        }

        return retval;
    }

    private void append (ComparableNode n) {
        n.prev = back;
        if(back == null)
            front = n;
        else
            back.next = n;

        back = n;
        count++;
    }

    private void insertBefore (ComparableNode n, ComparableNode after) {

        if(after == null) {
            append(n);
            return;
        }

        n.next = after;
        n.prev = after.prev;
        after.prev = n;
        if(n.prev == null) {
            front = n;
        } else {
            n.prev.next = n;
        }

        count++;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size () {
        return count;
    }

    public String toString() {
        String s = "";
        ComparableNode tmp = front;
        while(tmp != null) {
            s+= tmp.getElement() + " ";
            tmp = tmp.next;
        }
        return s;
    }
}
