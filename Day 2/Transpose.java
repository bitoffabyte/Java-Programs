import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int r, c;
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
        System.out.println("transpose matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println(" ");
        }

    }
}