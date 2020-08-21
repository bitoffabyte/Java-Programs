import java.util.Scanner;

public class Addmatrix {
    public static void main(String[] args) {
        int r, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        r = s.nextInt();
        c = s.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("Enter the first matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the second matrix");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = b[i][j] + a[i][j];
            }
        }
        System.out.println("Sum of the 2 matrices");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}