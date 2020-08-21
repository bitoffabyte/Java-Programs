import java.util.Scanner;

class FamilyTrip {
    String place;
    double distance;
    String[][] activities;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello please enter the place");
        place = sc.nextLine();
        System.out.println("Enter the distance");
        distance = sc.nextDouble();
        System.out.println("Enter number of sports");
        int n = sc.nextInt();
        activities = new String[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of people playing the sport ");
            int k = sc.nextInt();
            System.out.println("k" + k);
            activities[i] = new String[k + 1];
            System.out.println("Enter the sport and the names of people playing it");
            for (int j = 0; j <= k; j++) {
                activities[i][j] = sc.next();
            }
        }
    }

    public void printMethod() {
        double cost = this.distance * 82 / 12;
        System.out.println("Place is " + this.place);
        System.out.println("cost is " + cost);
        for (String[] a : this.activities) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }
}

class Test {
    public static void main(String args[]) {
        FamilyTrip[] a = new FamilyTrip[2];
        a[0] = new FamilyTrip();
        a[1] = new FamilyTrip();
        a[0].getData();
        a[0].printMethod();
    }
}