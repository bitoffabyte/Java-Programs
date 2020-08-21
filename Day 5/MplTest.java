
// 19BCE0758
// R NARAYAN
import java.util.Scanner;

class MPL {
    int nStudents;
    int[] marks = new int[10];
    int std;
    int max = -1;

    MPL(int s, int ns) {
        this.std = s;
        this.nStudents = ns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for " + ns + " std Students");
        for (int i = 0; i < ns; i++) {
            this.marks[i] = sc.nextInt();
            if (this.marks[i] > max) {
                max = marks[i];
            }
        }
    }

    float getAvg() {
        int s = 0;
        for (int i = 0; i < this.nStudents; i++) {
            s += this.marks[i];
        }
        return s / this.nStudents;
    }
}

public class MplTest {
    public static void main(String args[]) {
        MPL[] m = new MPL[4];
        m[0] = new MPL(5, 6);
        m[1] = new MPL(10, 5);
        m[2] = new MPL(8, 4);
        m[3] = new MPL(7, 7);
        bestClass(m);
        bestClass(m, 1);

    }

    static void bestClass(MPL[] m) {
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (m[i].max > m[max].max) {
                max = i;
            }
        }
        System.out.println("Best class = " + m[max].std + " Marks: " + m[max].max);
    }

    static void bestClass(MPL[] m, int a) {
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (m[i].getAvg() > m[max].getAvg()) {
                max = i;
            }
        }
        System.out.println("Best class avg = " + m[max].std + " Marks: " + m[max].getAvg());

    }

}