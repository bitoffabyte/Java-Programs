
// 19BCE0758
// R NARAYAN
import java.util.*;

public class Students {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String reg = new String();
        String name = new String();
        float cgpa;
        String pname = new String();
        String Sname = new String();
        String Proctorname = new String();
        System.out.println("Enter the details");
        System.out.println("Enter the Reg no");
        reg = sc.next();
        sc.nextLine();
        System.out.println("Enter the Name ");

        name = sc.next();
        sc.nextLine();
        System.out.println("Enter the cgpa ");

        cgpa = sc.nextFloat();
        System.out.println("Enter the programme name ");

        pname = sc.next();
        sc.nextLine();
        System.out.println("Enter the school");

        Sname = sc.next();
        sc.nextLine();
        System.out.println("Enter the proctors name");

        Proctorname = sc.next();
        sc.nextLine();
        System.out.println("Student name : " + name + "\nRegNo : " + reg + "\nCGPA : " + cgpa + "\nprogramme name : "
                + pname + "\nSchool name : " + Sname + "\nProctor name : " + Proctorname);
    }
}