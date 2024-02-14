import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        InputUser inputuser = new InputUser();

        Object[] detailsStudent;

        System.out.println("Enter Number of Records: ");
        int n = scan.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            detailsStudent = inputuser.inputStudent();
            students[i] = new Student((int) detailsStudent[1], (String) detailsStudent[0], (String) detailsStudent[2]);
        }

        display(students);
    }

    public static void display(Student[] students) {
        int count = 1;
        System.out.println("____RECORDS____");
        for (Student student : students) {
            System.out.println("___" + count + " RECORD______");
            System.out.println("Name of Student: " + student.getName());
            System.out.println("\n PRN of student:" + student.getPRN());
            System.out.println("\n DOB of student:" + student.getDOB());
            count++;
        }
    }
}