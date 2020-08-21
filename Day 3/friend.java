import java.util.Scanner;

class info {
    String name;
    String[] favf;

}

class friend {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // code for 10 ppl
        info[] p = new info[10];
        for (int i = 0; i < 10; i++) {
            p[i] = new info();
            System.out.println("Enter the name");
            p[i].name = sc.next();
            System.out.println("Enter the number of fav food");
            int n = sc.nextInt();
            p[i].favf = new String[n];
            for (int ii = 0; ii < n; ii++) {
                p[i].favf[ii] = sc.nextLine();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                boolean flag = false;
                for (String s : p[i].favf) {
                    for (String t : p[j].favf) {
                        if (s.equals(t)) {
                            flag = true;
                        }
                    }
                }
                if (flag) {
                    System.out.println(p[i].name + " and " + p[j].name + "Has simmilar taste");

                }
                flag = false;
            }
        }
    }
}