
//19BCE0758
//R Narayan
import java.util.Scanner;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        // Default height = 10 , width = 5
        this.width = 5;
        this.height = 50;
    }

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("object with default parameters ");
        System.out.println("Default values " + rectangle.height + "  " + rectangle.width);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        Rectangle rectangle2 = new Rectangle(2.5, 45.7);
        System.out.println("object with manually passed  parameters ");
        System.out.println("Default values " + rectangle2.height + "  " + rectangle2.width);
        System.out.println("Area = " + rectangle2.getArea());
        System.out.println("Perimeter = " + rectangle2.getPerimeter());

    }

}