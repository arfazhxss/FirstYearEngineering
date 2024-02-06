public class test {

    private String sID;
    private int grade;

    public test(String id, int testGrade) {
        sID = id;
        grade = testGrade;
    }

    public String getSID() {
        return sID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int testGrade) {
        grade = testGrade;
    }

    public String toString() {
        String result = sID + ":" + grade;
        return result;
    }
    public static void main (String[] args) {
        test stdnt1 = new test("V00123456", 89);
        test stdnt2 = new test("V00789181", 91);
        stdnt2.setGrade(72);
        System.out.println(stdnt1.getGrade() + "," + stdnt2.getGrade());
    }
}