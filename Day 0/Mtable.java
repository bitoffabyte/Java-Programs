import java.util.Scanner;
class Mtable{
	public static void main(String [] args)
	{
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		for(int i = 1; i<11; i++){
			System.out.print(i);
			System.out.print(" X ");
			System.out.print(a);
			System.out.print(" = ");
			System.out.println(a*i);
		}
	}
}