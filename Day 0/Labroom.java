import java.util.Scanner;

class Labroom{
	public static void main(String [] args){
		System.out.println("Enter the lab No");
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		if(a == 604){
			System.out.println("Java Programming Lab");
		}
		else if(a == 605){
			System.out.println("Python programming lab");
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}