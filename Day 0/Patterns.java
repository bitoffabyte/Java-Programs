import java.util.Scanner;

class Patterns	{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a = 0;
		do{
			System.out.println("\n\t\tMenu\n1.Pattern a\n2.Pattern b\n3.Pattern c\n4.Exit\nSelect an option\n");
			a = s.nextInt();
			if(a == 1){
				int n;
				System.out.println("Enter n");
				n = s.nextInt();
				for(int i = 1;i < n+1;i++){
					for(int j = 0; j < i; j++){
						System.out.print("*");
					}
					System.out.print('\n');
				}
			}
			else if(a == 2){
				System.out.println("Enter n");
				int n;
				n = s.nextInt();
				for(int i = n; i>0; i--){
					for(int j = 1; j<i+1; j++){
						System.out.print(j);
					}
					System.out.print('\n');
				}
			}
			else if(a == 3){
				System.out.println("Enter n");
				int n;
				n = s.nextInt();
				for(int i = 1; i<n+1; i++){
					for(int j = 1; j<i+1; j++){
						System.out.print(j);
					}
					System.out.print('\n');
				}
				for(int i = n; i>0; i--){
					for(int j = 1; j<i+1; j++){
						System.out.print(j);
					}
					System.out.print('\n');
				}
			}
			else if(a != 4){
				System.out.println("Invalid Choice");
			}
		}while(a != 4);
	}
}