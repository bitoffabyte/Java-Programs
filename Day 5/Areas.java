
//19BCE0758
//R Narayan
import java.lang.Math;
import java.util.Scanner;

class Area {
    public void retArea(int l, int b) {
        System.out.println("Area of rectangle is " + l * b);
    }

    public void retArea(int s) {
        System.out.println("Area of square is " + s * s);
    }

    public void retArea(int a, int b, int c) {
        if (a + b > c && b + c > 5 && c + a > b) {
            float s = (a + b + c) / 2;
            System.out.println("Area is " + Math.sqrt((s * (s - a) * (s - b) * (s - c))));
        } else {
            System.out.println("Sorry the dimensions is not of a triangle");
        }

    }
}

class Areas {
    public static void main(String args[]) {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        Area ob = new Area();
        do {
            System.out.println("Area of 1.Triangle 2.Rectangle 3.Square 4.exit ?");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter the 3 sides of the triangle");
                int a, b, c;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                ob.retArea(a, b, c);
            } else if (n == 2) {
                System.out.println("Enter the 2 sides of the rectangle");
                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
                ob.retArea(a, b);

            } else if (n == 3) {
                System.out.println("Enter the side of the square");
                int a;
                a = sc.nextInt();
                ob.retArea(a);

            } else if (n != 4) {
                System.out.println("Enter a valid choice");
            }
        } while (n != 4);
    }
}