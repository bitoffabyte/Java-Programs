
//19BCE0758
//R Narayan
import java.util.Scanner;

public class SumMatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the matrix");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the sum ");
        int sum = s.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    flag = 1;
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
        if (flag == 0) {
            System.out.println("No Pairs found");
        }
    }
}