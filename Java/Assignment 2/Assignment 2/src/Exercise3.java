import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		question1();
//		question2();

	}
	
	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		for(int i=1; i<=n ;i++)
		{
			for(int j=0; j<i;j++) 
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i=n; i>=1 ;i--)
		{
			for(int j=0; j<i;j++) 
			{
				System.out.print("* ");
			}
			System.out.print("\n");
			
		}
		
		System.out.print("\n");
		
		for(int i=1; i<=n ;i++)
		{
			for(int j=1; j<=n;j++) 
			{
				if(j<i)
				{
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i=n; i>=1 ;i--)
			{
				for(int j=1; j<=n;j++) 
				{
					if(i>j)
					{
						System.out.print("  ");
					}
					else {
						System.out.print("* ");
					}
					
				}
				System.out.print("\n");
				
			}
		scanner.close();
	}
	
	public static int giaiThua(int n) {
		if(n==0 || n==1)
			return 1;
		else {
			return n*giaiThua(n-1);
		}
	}
	
	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so tu nhien can tinh: ");
		int a = scanner.nextInt();
		System.out.println(a+"! = "+ giaiThua(a));
		scanner.close();
	}
}
