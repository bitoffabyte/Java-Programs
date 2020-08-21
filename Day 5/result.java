
// 19BCE0758
// R NARAYAN
import java.util.Scanner;

interface Exam {
    int Pass();
}

interface Classify {
    String Average(int total);
}

public class result implements Exam, Classify {
    Scanner sc = new Scanner(System.in);
    public int n;
    static int tot = 0;

    public int Pass() {
        System.out.println("Enter the number of subjects:");
        n = sc.nextInt();
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            tot += sc.nextInt();
        }
        return tot;
    }

    public String Average(int total) {
        int avg = total / n;
        if (avg > 60)
            return "FIRST";
        else if (avg > 50 & avg < 60)
            return "SECOND";
        else
            return "NO DIVISION";
    }

    public static void main(String[] args) {
        result res = new result();
        res.Pass();
        System.out.println(res.Average(tot));
    }
}