import java.util.Scanner;
class Divisibility{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");

		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		if(a%15 == 0){
			System.out.println("yes divisible by 3 and 5\n");
		}
		else{
			System.out.println("not divisible by 3 and 5\n");
		}
	}
}