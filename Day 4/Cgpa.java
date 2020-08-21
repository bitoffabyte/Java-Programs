
//19BCE0758
//R Narayan
import java.util.Scanner;

public class Cgpa {
    private String reg;
    private String name;
    private String Course;
    private float cgp;

    public Cgpa( String r,String n, String c, float cg) {
        this.reg = r;
        this.name = n;
        this.Course = c;
        this.cgp = cg;
    }

    public boolean isNine() {
        if (this.cgp >= 9)
            return true;
        else
            return false;
    }

    public void nameP() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cgpa[] students = new Cgpa[10];
        System.out.println("Enter the number of students ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            s.nextLine();
            System.out.println("Enter the Reg No");
            String r = s.nextLine();
            System.out.println("Enter the Name");
            String na = s.nextLine();
            System.out.println("Enter the Course");
            String c = s.nextLine();
            System.out.println("Enter the CGPA");
            float cg = s.nextFloat();
            students[i] = new Cgpa(r, na, c, cg);
        }
        System.out.println("List of Nine Pointers");
        for (int i = 0; i < n; i++) {
            if (students[i].isNine()) {
                students[i].nameP();
            }
        }

    }
}