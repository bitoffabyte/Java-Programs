//19BCE0758
//R Narayan
import java.util.Scanner;
class MaxMin {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Input the length of the array");
        n = s.nextInt();
        System.out.println("Enter the array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int temp[] = new int[n];
        int small = 0, large = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];

            flag = !flag;
        }
        System.out.println("Modified Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}