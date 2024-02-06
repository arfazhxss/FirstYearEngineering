import javax.management.remote.SubjectDelegationPermission;

public class Student {
    private String sID;
    private String name;
    private String program;
    private double gpa;
    private int grade;

    public Student (String sID, int studentGrade) {
        this.sID = sID;
        this.grade = studentGrade;
    }

    public void Student (String sID, String name, String program, int gpa) {
        this.sID = sID;
        this.name = name;
        this.program = program;
        this.gpa = gpa;
    }

    public void setSID (String sID) {
        this.sID = sID;
    }

    public String getSID () {
        return this.sID;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setProgram (String program) {
        this.program = program;
    }

    public String getProgram () {
        return this.program;
    }

    public void setGPA (double gpa) {
        this.gpa = gpa;
    }

    public double getGPA () {
        return this.gpa;
    }

    public void checkScholarship (double scgpa) {
        if (this.gpa > scgpa) {
            System.out.println("Congratulations "+name + ", you won a scholarship!");
        } else {
             System.out.println("Sorry "+name+", please try again next year");
        }
    }

    public boolean equals(Student other) {
        return this.sID.equals(other.sID) && this.grade == other.grade;
    }
    
    public static void main (String[] args) {
        // Student student1 = new Student();
        // student1.setName("Sam Sun");
        // student1.setSID("V00984826");
        // student1.setProgram("Microbiology");
        // student1.setGPA(6.8);
        // student1.checkScholarship(6.5);

        Student stdnt1 = new Student("V00123456", 89);
        Student stdnt2 = new Student("V00123456", 91);
        System.out.println(stdnt1.equals(stdnt2));
    }
}  