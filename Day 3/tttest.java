import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        char opt = 'Y';
        int counter = 0, num;
        while (opt == 'y' || opt == 'Y') {
            counter++;
            System.out.println("Enter the number: ");
            num = sc.nextInt();
            sum += num;
            int count = 0;
            int i = 0;
            for (i = 1; i < num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count >= 2) {
            } else
                c++;
            System.out.println("Enter 'Y' if you wish to continue else enter 'N'!");
            opt = sc.next().charAt(0);
        }
        System.out.println("Number of inputs: " + counter);
        System.out.println("Sum: " + sum);
        System.out.println("Average is: " + sum / counter);
        System.out.println("Number of prime numbers: " + c);
    }
}