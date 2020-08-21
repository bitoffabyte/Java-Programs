//19BCE0758
//R Narayan
import java.util.Scanner;
class CheckPalindrome {
    public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int n = str.length();
        int flag = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Palindrome");
        }

    }
}