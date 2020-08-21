
//19BCE0758
//R Narayan
import java.util.Scanner;

class SlowLearners {
    public static void main(String arr[]) {
        Scanner s = new Scanner(System.in);
        int no, tut, nbatch;
        System.out.println("Enter the number of batches");
        nbatch = s.nextInt();
        int tot = 0;
        int a[][] = new int[nbatch][];
        for (int i = 0; i < nbatch; i++) {
            System.out.println("Enter the number of slow learners in batch " + i);
            no = s.nextInt();
            if (no % 4 == 0)
                tut = no / 4;
            else
                tut = no / 4 + 1;
            a[i] = new int[tut];

            for (int j = 0; j < tut; j++) {
                if (no > 4) {
                    a[i][j] = 4;
                    no = no - 4;
                } else {
                    a[i][j] = no;
                    no = 0;
                }
            }
        }
        System.out.println("\n\nThe Contents of Jagged array are");
        for (int i = 0; i < nbatch; i++) {
            for (int n : a[i]) {
                System.out.print(n + " ");
                if (n == 4)
                    tot++;
            }
            System.out.println();
        }
        System.out.println("\n\nThe number of Tutors with 4 students are = " + tot);
    }
}