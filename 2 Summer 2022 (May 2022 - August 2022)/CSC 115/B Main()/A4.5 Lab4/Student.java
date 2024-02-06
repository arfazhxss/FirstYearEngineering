/*
 * Student.java
 *
 * A Student class
 *
 */
public class Student {

    private String sID;
    private int grade;


    /* Constructor
     *
     * Purpose: set's this Student's sID to given sID and grade to -1
     *
     * Parameters: String - sID, int grade
     *
     * Precondition: sID is not null
     *
     * Returns: nothing
     *
     */
    public Student(String sID) {
        this.sID = sID;
        grade = -1;
    }


    /* Constructor
     *
     * Purpose: set's this Student's sID and grade to given sID and grade
     *
     * Parameters: String - sID, int grade
     *
     * Precondition: sID is not null
     *
     * Returns: nothing
     *
     */
    public Student(String sID, int grade) {
        this.sID = sID;
        this.grade = grade;
    }

    /*
     *
     * Purpose: returns this Student's sID
     *
     * Parameters: none
     *
     * Returns: String - the sID
     *
     */
    public String getSID() {

        return this.sID;
    }

    /*
     *
     * Purpose: set's this Student's sID to given sID
     *
     * Parameters: String - sID
     *
     * Precondition: sID is not null
     *
     * Returns: nothing
     *
     */
    public void setSID(String sID) {

        this.sID = sID;
    }

    /*
     *
     * Purpose: returns this Student's grade
     *
     * Parameters: none
     *
     * Returns: int - the sID
     *
     */
    public int getGrade() {

        return this.grade;
    }

    /*
     *
     * Purpose: set's this Student's grade to grade parameter value
     *
     * Parameters: int - grade
     *
     * Returns: nothing
     *
     */
    public void setGrade(int grade) {

        this.grade = grade;
    }

    /*
     *
     * Purpose: returns a String representation of this Student
     *      in the form "sID:grade"
     *
     * Parameters: none
     *
     * Returns: String - the representation
     *
     */
    public String toString() {

        return sID + ":" + grade;
    }

    /*
     *
     * Purpose: returns true if this Student's sID
     *      equals other Student's sID
     *
     * Parameters: Student other
     *
     * Precondition: other is a Student and is not null
     *
     * Returns: boolean - true if equal, false otherwise
     *
     */
    public boolean equals(Student other) {

        return (this.sID.equals(other.sID));
    }

}
