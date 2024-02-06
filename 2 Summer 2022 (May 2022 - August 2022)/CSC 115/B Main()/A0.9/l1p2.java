public class l1p2 {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        Student1 s2 = new Student1("V00123456");

        System.out.println(s1);
        System.out.println(s2);

        Student1 s3 = new Student1("V00998877");

        System.out.println("s1's grade: " + s1.getGrade());
        System.out.println("s2's grade: " + s2.getGrade());

        s1.setGrade(91);
        s2.setGrade(70);
        System.out.println("s1's new grade: " + s1.getGrade());
        System.out.println("s2's new grade: " + s2.getGrade());

        Student1 s4 = new Student1("V00123456", 84);
        s1.setSID("V00998877");
        System.out.println("s4's sID: " + s4.getSID());
        System.out.println("s4's grade: " + s4.getGrade());
    }
}