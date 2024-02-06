import java.util.Arrays;

public class TestStudent {

   public static void testIsGradeAbove() {
       // Create an object of Student
       Student student = new Student("CID001", 45);
       if (Lab2.isGradeAbove(student, 30)) {
           System.out.println("Success");
           System.out.println("isGradeAbove method return: " + Lab2.isGradeAbove(student, 30));
       }
   }

   public static void testGetClasslist() {
       // Create an object of Student
       Student student1 = new Student("CID001", 45);
       Student student2 = new Student("CID002", 45);
       //Create Student array
       Student[] students = { student1, student2 };
       System.out.println(Arrays.toString(Lab2.getClasslist(students)));
   }

   public static void testCountAbove() {
       // Create an object of Student
       Student student1 = new Student("CID001", 45);
       Student student2 = new Student("CID002", 45);
       //Create Student array
       Student[] students = { student1, student2 };
       System.out.println(Lab2.countAbove(students, 36));
   }

   public static void testRegisterStudent() {
       // Create an object of Student
       Student student1 = new Student("CID001", 45);
       Student student2 = new Student("CID002", 35);
       Student student3 = new Student("CID003", 75);
       //Create Student array
       Student[] students = { student1, student2 };
       System.out.println(Arrays.toString(Lab2.registerStudent(students, student3)));
   }

   public static void main(String[] args) {
       // Call testIsGradeAbove
       testIsGradeAbove();
       // Call testGetClasslist
       testGetClasslist();
       // Call testCountAbove
       testCountAbove();
       // Call testRegisterStudent
       testRegisterStudent();

   }
}