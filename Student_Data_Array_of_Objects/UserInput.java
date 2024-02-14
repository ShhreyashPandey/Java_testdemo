import java.util.*;
class InputUser {
    Scanner scan = new Scanner(System.in);
    String name, dob;
    int prn;

    // different datatypes
    Object[] array = new Object[3];

    public Object[] inputStudent() {
        System.out.println("Enter Name Of Student");
        name = scan.next();

        System.out.println("Enter PRN Of Student");
        prn = scan.nextInt();

        System.out.println("Enter Dob Of Student");
        dob = scan.next();

        array[0] = name;
        array[1] = prn;
        array[2] = dob;

        return array;
    }
}