/*
 * StudentNode.java
 *
 * A StudentNode class
 *
 */
public class StudentNode {

    private Student data;
    // made this protected to allow you access it using the . operator
    //   within files that are in the same package/directory as StudentNode
    protected StudentNode next;


    /*
     *
     * Purpose: sets this StudentNode's data to given data
     *
     * Parameters: Student data
     *
     * Precondition: data is not null
     *
     */
    public StudentNode(Student data) {
        this.data = data;
        this.next = null;
    }

    /*
     *
     * Purpose: sets this StudentNode's data and next to given data and next
     *
     * Parameters: Student data, StudentNode next
     *
     * Precondition: data is not null
     *
     */
    public StudentNode(Student data, StudentNode next) {
        this.data = data;
        this.next = next;
    }

    /*
     *
     * Purpose: returns the value of this StudentNode's next
     *
     * Parameters: none
     *
     * Returns: StudentNode - the next
     *
     */
    public StudentNode getNext() {
        return this.next;
    }

    /*
     *
     * Purpose: sets this StudentNode's next to given next
     *
     * Parameters: StudentNode - next
     *
     * Returns: nothing
     *
     */
    public void setNext(StudentNode next) {

        this.next = next;
    }

    /*
     *
     * Purpose: returns the value of this StudentNode's data
     *
     * Parameters: none
     *
     * Returns: Student - the data
     *
     */
    public Student getData() {

        return this.data;
    }

    /*
     *
     * Purpose: set's this StudentNode's data to given data
     *
     * Parameters: Student - data
     *
     * Precondition: data is not null
     *
     * Returns: nothing
     *
     */
    public void setData(Student data) {
        this.data = data;
    }

}
