
// 19BCE0758
// R NARAYAN
import java.util.Scanner;

abstract class Net {
    double p;
    double r;

    abstract void Process(double P, double R);
}

class Discount extends Net {
    public void Process(double x, double y) {
        p = x;
        r = y;
    }

    public double getdata() {
        double net = p - p * r / 100;
        return net;
    }
}

class Tax extends Discount {
    public double getdata() {
        double total = p + p * r / 100;
        return total;
    }
}

public class Abstract {
    public static void main(String[] args) {
        Discount o1 = new Discount();
        Tax o2 = new Tax();
        o1.Process(4, 8);
        o2.Process(4, 8);
        System.out.println("Net=" + o1.getdata());
        System.out.println("Total=" + o2.getdata());
    }
}
