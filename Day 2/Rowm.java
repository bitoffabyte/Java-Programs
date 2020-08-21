import java.util.Scanner;

public class Rowm {
    public static void main(String[] args) {
        int r, c, sumRow = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        r = s.nextInt();
        c = s.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            sumRow = 0;
            for (int j = 0; j < c; j++) {
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }
    }
}