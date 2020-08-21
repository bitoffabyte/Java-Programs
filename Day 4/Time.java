
//19BCE0758
//R Narayan
import java.util.Scanner;

public class Time {
    public void disp(String hh) {
        System.out.println(hh);
    }

    public void disp(String hh, String mm) {
        System.out.println(hh + ":" + mm);
    }

    public void disp(String hh, String mm, String ss) {
        System.out.println(hh);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Time t = new Time();
        System.out.println("Function 1");
        t.disp("10");
        System.out.println("Function 2");
        t.disp("10", "30");
        System.out.println("Function 3");
        t.disp("10", "30", "55");
    }
}