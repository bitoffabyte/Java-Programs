
//19BCE0758
//R Narayan
import java.util.Scanner;

class CheckAnagram {
    public static void main(String args[]) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str1 = sc.nextLine();
        System.out.println("Enter Second String");
        str2 = sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 == n2) {
            int flag = 1;
            char[] ar1 = str1.toCharArray();
            char[] ar2 = str2.toCharArray();
            for (int i = 0; i < n1 - 1; i++) {
                for (int j = 0; j < n1 - i - 1; j++) {
                    if ((int) ar1[j] < (int) ar1[j + 1]) {
                        char temp = ar1[j];
                        ar1[j] = ar1[j + 1];
                        ar1[j + 1] = temp;
                    }
                    if ((int) ar2[j] < (int) ar2[j + 1]) {
                        char temp = ar2[j];
                        ar2[j] = ar2[j + 1];
                        ar2[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < n1; i++) {
                if (ar1[i] != ar2[i]) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
    }
}