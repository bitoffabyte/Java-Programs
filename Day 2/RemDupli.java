
//19BCE0758
//R Narayan
import java.util.Scanner;

public class RemDupli {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array");
        n = s.nextInt();
        int j = 0;
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        if (n != 0 && n != 1) {
            int[] temp = new int[n];
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[n - 1];
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }
        }
        System.out.println("The New array is of length " + j);
        for (int i = 0; i < j; i++)
            System.out.print(arr[i] + " ");
    }
}