import java.util.Scanner;

class Rearrange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = s.nextInt();
        int l = 0, r = n - 1;
        int arr[] = new int[n];
        int temp[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                temp[l] = arr[i];
                l = l + 1;
            } else {
                temp[r] = arr[i];
                r = r - 1;
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
