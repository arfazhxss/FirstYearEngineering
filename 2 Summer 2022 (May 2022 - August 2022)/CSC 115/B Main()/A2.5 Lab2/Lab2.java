/*
 * Lab2.java
 * Last Edit: Arfaz Hussain, May 19, 23:46
 *
 * A class of static methods that operate on Students
 *
 */
public class Lab2 {

    /* getHigherGradeStudent
     *
     * Purpose: determines which of Students s1 and s2
     *  have the higher grade
     *
     * Parameters: Student - s1, Student - s2
     *
     * Precondition: s1 and s2 are not null
     *
     * Returns: Student - the Student with the higher grade,
     *  s1 if they have the same grade
     *
     */
    public static Student getHigherGradeStudent(Student s1, Student s2) {
        if ((s1.getGrade()) >= (s2.getGrade())) {
            return s1;
        } else {
            return s2;
        }
    }



    /* isGradeAbove
     *
     * Purpose: determines whether the grade of Student s
     *  is above the threshold
     *
     * Parameters: Student - s, int - threshold
     *
     * Returns: boolean - true if grade is above threshold,
     *          false otherwise
     *
     */
    public static boolean isGradeAbove (Student s, int threshold) {
        if ((s.getGrade()) > threshold) return true;
        else return false;
    }



    /* getClasslist
     *
     * Purpose: creates an array sIDs of all Students in students
     *
     * Parameters: Student[] - students
     *
     * Returns: String[] - array of sIDs
     *
     */
    public static String[] getClasslist (Student[] students) {
        String Arr[];
        int size = students.length;
        Arr = new String[size];
        for (int i=0; i<size; i++) {
            Arr[i] = students[i].getSID();
            // System.out.println("i: "+i+"\tStatic Size: "+size+"\tArray: "+Arr[i]);
        } return Arr;
    }


    /* countAbove
     *
     * Purpose: counts the number of Students in students
     *  with grade above threshold
     *
     * Parameters: Student[] - students, int threshold
     *
     * Returns: int - the count
     *
     */
    public static int countAbove (Student[] students, int threshold) {
        int size = students.length;
        int count = 0;
        for (int i=0; i<size; i++) {
            if (isGradeAbove(students[i], threshold)) {
                count++;
            } 
        } return count;
    }

    /* getClassAverage
     *
     * Purpose: calculates the average grade of Students in students,
     *  does NOT include students with 0 grade in calculation
     *  average is 0.0 if students is empty or all students have 0 grade
     *
     * Parameters: Student[] - students
     *
     * Returns: double - the average grade
     *
     */
    public static double getClassAverage (Student[] students) {
        int size = students.length;
        int count = 0;
        double sum = 0.0;
        for (int i=0; i<size; i++) {
            if (isGradeAbove(students[i], 0)) {
                sum+=students[i].getGrade();
                // System.out.println(students[i].getGrade());
                count++;
            }
        }
        double average = (sum/count);
        return average;
    }

    /*
     *
     * Purpose: creates a new array 1 longer than students
     *  and adds all students and s to the new array
     *
     * Parameters: Student[] - students, Student s
     *
     * Returns: Student[] - the new array
     *
     */
    public static Student[] registerStudent (Student[] students, Student s) {
        int size = students.length+1;
        Student newlist[] = new Student[size];
        for (int i=0; i<size-1; i++) {
            newlist[i] = students[i];
            // System.out.println("i:"+i+"\t"+newlist[i]);
        }
        newlist[size-1] = s;
        // int i = size - 1;
        // System.out.println("i:"+i+"\t"+newlist[size-1]);
        return newlist;
    }

    
    // public static Student[] registerStudent(Student[] students, Student s) {
    //     Student newStudentList[] = new Student[students.length + 1];
    //     int index = 0;
 
    //     for (Student student : students) {
    //         newStudentList[index++] = student;
    //     }
    //     return newStudentList;
    // }

    // public static void main (String[] args) {
    //     Student s0  = new Student("abc", 50);
    //     Student s1 = new Student("def", 56);
    //     Student s2 = new Student("xyz", 56);
    //     Student s3 = new Student("xyz", 99);
    //     Student s4 = new Student("CID001", 45);
    //     Student s5 = new Student("CID002", 35);
    //     Student s6 = new Student("VG872", 0);
        
    //     // System.out.println("Test1");
    //     // System.out.println("Successful\n");

    //     // System.out.println("Test2");
    //     // System.out.println(isGradeAbove(s0, 49));
    //     // System.out.println("Successful\n");

    //     // System.out.println("\nTest3");
    //     // Student[] students1 = {s0, s1, s2, s3};
    //     // System.out.println(getClasslist(students1));
    //     // System.out.println("Successful\n");

    //     // System.out.println("\nTest4");
    //     // Student[] students2 = {s4, s5};
    //     // System.out.println(countAbove(students2, 34));
    //     // System.out.println("Successful\n");

    //     // System.out.println("\nTest5");
    //     Student[] students = {s0,s1,s2,s3,s4,s5};
    //     // System.out.println(getClassAverage(students));
    //     // System.out.println("Successful\n");

    //     System.out.println(registerStudent(students, s6));
    //     // // System.out.println();
    //     // // System.out.println();
    //     // // System.out.println();
        
    // }
}
