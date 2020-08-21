import java.util.Scanner;

class Calc{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a = 0;
		do{
			System.out.println("\n\t\tMenu\n\t1.add\n\t2.exit\n\tSelect an option");
			a = s.nextInt();
			if(a == 1){
				int n1,n2;
				System.out.println("Enter First No");
				n1 = s.nextInt();
				System.out.println("Enter Second No");
				n2 = s.nextInt();
				System.out.println("Sum is ");
				System.out.println(n1+n2);
			}
			else if(a != 2){
				System.out.println("Invalid Input");
			}
		}while(a != 2);
	}
}