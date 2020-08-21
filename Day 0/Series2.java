import java.util.Scanner;

class Series2{
	public static void main(String [] args){
		System.out.println("Enter a No");
		Scanner s = new Scanner(System.in);
		int a,sum=0;
		a = s.nextInt();
		for(int i = 1; i<a+1;i++){
			sum = sum + i*i;
		}
		System.out.print("Sum is ");
		System.out.println(sum);
	}
}