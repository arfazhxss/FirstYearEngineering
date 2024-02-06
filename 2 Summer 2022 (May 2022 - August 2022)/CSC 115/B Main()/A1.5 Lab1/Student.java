public class Student {
    String sID;
    int grade;

    public Student () {
        sID = "";
        grade = -1;
    }

    public Student(String id, int StudentGrade) {
        this.sID = id;
        this.grade = StudentGrade;
    }

    public String getSID() {
        return this.sID;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int StudentGrade) {
        this.grade = StudentGrade;
    }

    public void setSID (String sID) {
        this.sID = sID;
    }

    public String toString() {
        String result = this.sID + ":" + this.grade;
        return result;
    }

    public void printall () {
        System.out.println(this.toString());
    }

    public static void main (String[] args) {
        Student a = new Student();
        Student b = new Student();

        a.setGrade(76);
        a.setSID("Arfaz");
        a.printall();

        b.setGrade(78);
        b.setSID("Anshit");
        b.printall();
    }
}
