import java.util.Scanner;


public class exercise1 {

	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
		question6();
	}
	
	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		System.out.println("Input: "+ a);
		System.out.print("Output: ");
		System.out.printf("%.2f inch %n",a/2.54);
		System.out.print("Output: ");
		System.out.printf("%.2f foot %n",a/2.54/12);
		scanner.close();
	}
	
	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			a= scanner.nextInt();
		}
		while(a<0 || a>68399);
		System.out.print("Input: "+ a);
		System.out.println("s");
		
		int b = a%3600;
		int h = a/3600;
		int s = b%60;
		int m = b/60;
		
		System.out.print("Output:");
		System.out.printf("%02d : %02d : %02d",h,m,s);
		scanner.close();
	}
	
	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 4 so nguyen: ");
		int a[] = new int [4];
		for(int i=0; i<4;i++)
		{
			a[i] = scanner.nextInt();
		}
		
		for(int i=0; i<4;i++)
		{
			for(int j=i+1; j<4; j++)
			{
				if(a[i]>a[j])
				{
					int tg = a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}
		System.out.println("So nho nhat: " + a[0]);
		System.out.println("So lon nhat: " + a[3]);
		scanner.close();
	}
	
	public static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 2 so tu nhien: ");
		float a,b;
		do {
			System.out.print("a= ");
			a=scanner.nextFloat();
		} while (a<0 || (int)(a) != a );
		do {
			System.out.print("b= ");
			b=scanner.nextInt();
		} while (b<0 || (int)(b) != b );
		
		System.out.println("Hieu a-b= " + (a-b));
		if((a-b)>0)
			System.out.println("a lon hon b");
		else {
			System.out.println("a nho hon b");
		}
		scanner.close();
	}
	
	public static void question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 2 so tu nhien: ");
		float a,b;
		do {
			System.out.print("a= ");
			a=scanner.nextFloat();
		} while (a<0 || (int)(a) != a );
		do {
			System.out.print("b= ");
			b=scanner.nextInt();
		} while (b<0 || (int)(b) != b );
		
		if(a%b==0)
			System.out.println("a chia het cho b");
		else {
			System.out.println("a khong chia het cho b");
		}
		scanner.close();
	}
	
	public static void question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao diem cac mon: ");
		float a,b,c;
		System.out.print("Diem mon toan:  ");
		a=scanner.nextFloat();
		System.out.print("Diem mon li:  ");
		b=scanner.nextInt();
		System.out.print("Diem mon hoa:  ");
		c=scanner.nextInt();
		
		float dtb =(a*2+b+c)/4;
		System.out.print("Hoc luc: ");
		if(dtb >= 9)
			System.out.println("Xuat sac ");
		else {
			if(dtb>=8)
				System.out.println("Gioi");
			else {
				if(dtb>=7)
					System.out.println("Kha");
				else {
					if(dtb>=6)
						System.out.println("Trung binh kha");
					else {
						if(dtb>=5)
							System.out.println("Trung binh");
						else {
							System.out.println("Kem");
						}
					}
				}
			}
		}
		scanner.close();
	}
}
