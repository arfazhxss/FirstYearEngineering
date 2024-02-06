public class StudentLinkedList implements StudentList {

    StudentNode head;
    int count;

    /*
     * Purpose: sets head to null and count to 0
     * Parameters: none
     */
    public StudentLinkedList() {
        head = null;
        count = 0;
    }

    /*
     * Purpose: returns a String reprensentation of elements
     *      in this list separated by newlines
     * Parameters: none
     * Returns: String - the representation
     */
     // DO NOT CHANGE THIS METHOD - it is correct
    public String toString() {
        String s = "";
        StudentNode tmp = head;

        while(tmp != null) {
            s  += tmp.getData() + "\n";
            tmp = tmp.next;
            // could be written as tmp.setNext(tmp.getNext());
        }

        return s;
    }

    public void add(Student s) {
        if (s!=null) {
            StudentNode n = new StudentNode(s,null);
            if (head==null) {
                n.setNext(head);
                head=n;
            } else {
                StudentNode cur = head;
                while (cur.getNext()!=null) {
                    cur=cur.getNext();
                }
                cur.setNext(n);
                n.setNext(null);
            }
            count++;
        }
    }


    public int size() {
        return count;
    }


    public void removeFront() {
        if (head!=null) {
            StudentNode tmp=head;
            head=head.next;
            count--;
        }
    }


    public boolean contains(Student s) {
        if ((s!=null)&&(head!=null)) {
            StudentNode cur = head;
            while(cur!=null) {
                if (cur.getData().equals(s)) return true;
                cur=cur.next;
            }
        } return false;
    }
}
