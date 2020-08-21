class test {
    int age, luckyNumber;
    String prefixed_name;
    String prefixed_age;

    test(String Name, int Age, int Luckynumber) {
        System.out.println("Name is: " + Name);
        System.out.println("Age is: " + Age);
        System.out.println("Lucky number is: " + Luckynumber);
        prefixed_name = Luckynumber + Name;
        prefixed_age = Luckynumber + Age;

    }
}

public class main {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    int a = sc.nextInt();
    int l = sc.nextInt();
    test answer = new test(n, a , l);  
    System.out.println("Prefixed name "+answer.prefixed_name + " Prefixed age "+answer.prefixed_age);
}