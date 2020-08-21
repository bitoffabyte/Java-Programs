
// 19BCE0758
// R NARAYAN
import java.util.Random;

class TestDetails {
    final int m = 25;
    final int n = 7;
    public float[][] marks = new float[m][n];

    public void storeMarks() {
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean isTest = (rand.nextInt(2) == 1) ? true : false;
                if (isTest) {
                    marks[i][j] = rand.nextInt(101);
                } else
                    marks[i][j] = -1;
            }
        }
    }

    public void displayMarks() {
        for (int i = 0; i < m; i++) {
            System.out.print(" Student " + i + ":  ");
            for (int j = 0; j < n; j++) {
                if (marks[i][j] != -1) {
                    System.out.print(marks[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

class NoticePeriod extends TestDetails {
    boolean[] notice = new boolean[m];

    void calcNotics() {
        int studentCount = 0;
        for (int i = 0; i < m; i++) {
            int testCount = 0;
            int marksCount = 0;
            for (int j = 0; j < n && marksCount < 3; j++) {
                if (marks[i][j] != -1) {
                    testCount++;
                }
                if (marks[i][j] >= 50) {
                    marksCount++;
                }

            }
            if (testCount < 3 || marksCount < 3) {
                notice[i] = true;
                studentCount++;
            } else {
                notice[i] = false;
            }
        }
        System.out.println("Number of students benched = " + studentCount);
    }

    void displayNotice() {
        for (int i = 0; i < m; i++) {
            if (notice[i]) {
                System.out.println("Student " + i + " Served with notice");
            }
        }
    }

}

public class Inheritance1 {
    public static void main(String args[]) {
        NoticePeriod n = new NoticePeriod();
        n.storeMarks();
        n.displayMarks();
        n.calcNotics();
        n.displayNotice();
    }
}