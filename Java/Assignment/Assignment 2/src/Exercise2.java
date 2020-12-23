import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.naming.ldap.SortKey;

import com.sun.swing.internal.plaf.basic.resources.basic;
import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;

import javafx.collections.transformation.SortedList;
import jdk.nashorn.internal.ir.ReturnNode;
import sun.awt.image.IntegerInterleavedRaster;
import sun.util.locale.StringTokenIterator;

public class Exercise2 {
	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8();
//		question9();
//		question10();
//		question11();
//		question12();
//		question13();
//		question14();
//		question15();
//		question16();
//		question17();
//		question18();
//		question19();
		question20();
//		question21();
	
	}
	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua day: ");
		int n = scanner.nextInt();
		float a[] = new float [n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Nhap phan tu a["+i+"]=");
			a[i] = scanner.nextFloat();
		}
		boolean check=false;
		System.out.print("Cac phan tu xuat hien trong day dung 1 lan:  ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					check = false;
					break;
				}
				else {
					check=true;
				}
			}
			if(check==true)
				System.out.print(a[i]+"    ");
		}
		scanner.close();
	}
	
	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua day: ");
		int n = scanner.nextInt();
		float a[] = new float [n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Nhap phan tu a["+i+"]=");
			a[i] = scanner.nextFloat();
		}
		
		System.out.print("Cac phan tu xuat hien trong day dung 2 lan:  ");
		
		for(int i=0; i<n;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					float tg = a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}
		int dem=1;
		for(int i=1; i<n; i++)
		{
			if(a[i]==a[i-1])
			{
				dem++;
			}
			else {
				if(dem==2)
				{
					System.out.print(a[i-1]+ "\t");	
					dem=1;
				}
			}
			if(i==n-1)
				if(dem==2)
				{
					System.out.print(a[i-1]+ "\t");	
				}
		}
		scanner.close();
	}
	
	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua day: ");
		int n = scanner.nextInt();
		float a[] = new float [n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Nhap phan tu a["+i+"]=");
			a[i] = scanner.nextFloat();
		}
		for(int i=0; i<n;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					float tg = a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}
		int dem=1;
		for(int i=1; i<n; i++)
		{
			if(a[i]==a[i-1])
			{
				dem++;
			}
			else {	
					System.out.print("\nPhan tu "+a[i-1]+ " xuat hien "+dem+" lan");	
					dem=1;
			}
		}
		System.out.print("\nPhan tu "+a[n-1]+ " xuat hien "+dem+" lan");	
		scanner.close();
	}
	
	public static int func_for_question4(int n)
	{
		if(n/10==0)
			return n;
		else {
			return (n%10)+func_for_question4(n/10);
		}
	}
	
	public static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen nat ki: ");
		int a= scanner.nextInt();
		System.out.print("Tong cac chu so la: "+func_for_question4(a));
		scanner.close();
	}
	
	public static void question5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen nat ki: ");
		int n= scanner.nextInt();
		int dem=0;
		System.out.print(n+" = " );
		for(int i=2; i<=n; i++)
		{
			if(n%i==0)
			{
				dem++;
				if(dem>1)
				{
					System.out.print("x");
				}
				System.out.print(i);
				n = n/i;
				i--;
			}
		}
		scanner.close();
	}
	
	public static boolean test_So_Nguuyen_To(int n) {
		if(n<2)
			return false;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen nat ki: ");
		int n= scanner.nextInt();
		for(int i=2; i<n; i++)
		{
			if(test_So_Nguuyen_To(i)==true)
				System.out.print(i+"\t");
		}
		scanner.close();
	}
	
	public static void question7() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong so nguyen to muon xem: ");
		int n= scanner.nextInt();
		int dem=0;
		for(int i=2; true; i++)
		{
			if(test_So_Nguuyen_To(i)==true)
				{
					System.out.print(i+"\t");
					dem++;
				}
			if(dem==n)
				break;
		}
		scanner.close();
	}
	
	public static int UCLN(int a,int b) {
		int du;
		while(a%b!=0)
		{
			du= a%b;
			a=b;
			b=du;
		}
		return b;
	}
	
	
	public static void question8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 2 so a va b: ");
		System.out.print("a= ");
		int a= scanner.nextInt();
		System.out.print("b= ");
		int b= scanner.nextInt();
		System.out.println("UCLN: "+ UCLN(a, b));
		System.out.println("BCNN: "+ a*b/UCLN(a, b));
		scanner.close();
	}
	
	public static int  Fibonacci(int n) {
		if(n==1 || n==2)
			return 1;
		else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
	
	public static void question9() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao vi tri cua so Fibonacci muon tim: ");
		System.out.print("n= ");
		int n= scanner.nextInt();
		System.out.println("So Fibonacci thu "+n+" la: "+ Fibonacci(n));
		scanner.close();
	}
	
	//tren mang
//	public static boolean testSoThuanNghich(int n){
//        StringBuilder xau= new StringBuilder();
//        String str= ""+n;
//        xau.append(str);
//        String check= ""+xau.reverse();
//        if(str.equals(check)) return true;
//        else return false;
//}
//	public static void question10() {
//		int n,count=0;
//        for(n=100000 ; n<= 999999 ; n++){
//                    if(testSoThuanNghich(n)){
//                                System.out.println(n);count++;
//                    }
//        }
//        System.out.println("Co "+count+" so thuan nghich co 6 chu so");
//	}
//	
//	//mang
//	 public static int nhap(){
//         Scanner input= new Scanner(System.in);
//         boolean check= false;
//         int n=0;
//         while(!check){
//                     System.out.print(" ");
//                     try{
//                                 n= input.nextInt();
//                                 check= true;
//                     }catch(Exception e){
//                                 System.out.println("Ban phai nhap so! hay nhap lai...");
//                                 input.nextLine();
//                     }
//         }
//         return (n);
//}
//	
//	public static void question11() {
//		System.out.print("Nhap n");
//        int n= nhap();
//        int[] array= new int[n+2];
//        int i,j,k=n-1,temp,check=1;
//        for(i=0 ; i<n ; i++){
//                    array[i]= i+1;
//        }
//        System.out.println("Cac hoan vi ke la: ");
//        try{
//                    i= n-2;
//                    while(check>0){
//                                //In ra hoan vi
//                                System.out.println("   ");
//                                for(j=0 ; j<n ; j++){
//                                            System.out.print(" "+array[j]);
//                                }
//                                for(i= n-2 ; i>=0 ; i--){
//                                            check= 1;
//                                if(array[i] < array[i+1]){
//                                            if(i==n-2){
//                                                        temp= array[i];
//                                                        array[i]= array[n-1];
//                                                        array[n-1]= temp;
//                                                        break;
//                                            }
//                                            else{
//                                                        //Tim so a[k] nho nhat ma >a[i] trong cac so ben phai a[i]
//                                                        k= i+1;
//                                                                    for(j=i+1 ; j<n ; j++){
//                                                                                if(array[i+1]>array[j] && array[j]>array[i]) k=j;
//
//                                                                    }
//                                                                    //Doi cho a[k] va a[i]
//                                                                    temp= array[i];
//                                                                    array[i]= array[k];
//                                                                    array[k]= temp;
//                                                        //Sap xep lai tu a[i+1] toi a[n]
//                                                        for(j=i+1 ; j<n ; j++){
//                                                                    for(int m= i+1 ; m<n ; m++){
//                                                                                if(array[j]<array[m]){
//                                                                                            temp= array[j];
//                                                                                            array[j]= array[m];
//                                                                                            array[m]= temp;
//                                                                                }
//                                                                    }
//                                                        }
//                                                        break;
//                                            }
//                                }
//                                else {
//                                            check=0;
//                                //          break;
//                                }
//                                }
//                                //if(i==0)check=0;
//                    }
//        }catch(Exception e){}
//	}
	
	//mang
//	public static int nhap(){
//        Scanner input= new Scanner(System.in);
//        boolean check= false;
//        int n=0;
//        while(!check){
//                    System.out.print(" ");
//                    try{
//                                n= input.nextInt();
//                                check= true;
//                    }catch(Exception e){
//                                System.out.println("Ban phai nhap so! hay nhap lai...");
//                                input.nextLine();
//                    }
//        }
//        return (n);
//	}
//	public static void inArray(int[] a, int begin , int end){
//        System.out.println();
//        int i;
//        for(i=begin ; i<end ; i++){
//                    System.out.print(" "+a[i]);
//        }
//        System.out.println();
//	}
//	public static void themPhanTu(int[] a,int n,int pt){
//        a[0]= pt;
//        Arrays.sort(a);
//	}
//	
//	public static void question12() {
//		System.out.println("Nhap n");
//        int n= nhap();
//        System.out.println("Nhap m");
//        int m= nhap();
//        int i;
//        int[] a= new int[n+m];
//        int[] b= new int[m];
//        //Nhap vao mang A va sap xep theo thu tu tang dan
//        System.out.println("nhap mang A: ");
//        for(i=0 ; i<n ; i++){
//                    System.out.print("\n Nhap phan tu thu "+i+" = ");
//                    a[i]= nhap();
//        }
//        Arrays.sort(a);
//        //Nhap vao mang B va sap xep theo thu tu tang dan
//        System.out.println("nhap mang B: ");
//        for(i=0 ; i<m ; i++){
//                    System.out.print("\n Nhap phan tu thu "+i+" = ");
//                    b[i]= nhap();
//        }
//        Arrays.sort(b);
//        //Gop mang b vao mang a
//        for(i=0 ; i<m ; i++){
//                    themPhanTu(a, n+m+1, b[i]);
//        }
//        inArray(a, 0, n+m);
//
//	}
	
	
	public static void question13() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua day: ");
		int n = scanner.nextInt();
		float a[] = new float [n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Nhap phan tu a["+i+"]=");
			a[i] = scanner.nextFloat();
		}
		int b[]= new int[n];
		for(int i=0; i<n; i++)
		{
			b[i]=i;
		}
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[b[i]]>a[b[j]])
				{
					int tg= b[i];
					b[i]=b[j];
					b[j]=tg;
				}
				
			}
		}
		System.out.print("Day sau khi sap: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[b[i]]+"\t");
		}
		scanner.close();
	}
	
	public static void question14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 so tu nhien : ");
		System.out.print("n= ");
		int n= scanner.nextInt();
		int m;
		for(int i=1; true; i++)
		{
			if(Fibonacci(i) > n)
			{
				m=i;
				break;
			}
		}
		System.out.print("Cac so Fibonacci nho hon "+n+": ");
		for(int i=1; i<m; i++)
		{
			if(test_So_Nguuyen_To(Fibonacci(i)) == true)
			{
				System.out.print(Fibonacci(i)+"\t");
			}
		}
		scanner.close();
	}
	
	public static void question15() {
		question4();
		question5();
	}
	
	public static void question16() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 so tu nhien : ");
		System.out.print("n= ");
		int n= scanner.nextInt();
		int dem =0;
		System.out.print("Cac uoc cua "+n+": ");
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+"\t");
				dem++;
			}
		}
		System.out.println("\n"+n+" co "+ dem+ " uoc");
		System.out.print("Cac uoc nguyen to cua "+n+": ");
		for(int i=1; i<=n; i++)
		{
			if(n%i==0 && test_So_Nguuyen_To(i))
			{
				System.out.print(i+"\t");
			}
		}
		scanner.close();
	}
	
	public static void question17() {
		
	}
	
	public static void question18() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua day: ");
		int n = scanner.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; i++)
		{
			do {
				System.out.print("Nhap phan tu a["+i+"]=");
				a[i] = scanner.nextInt();
			}
			while(a[i]>=100 || a[i]<1);
		}
		int max=a[0];
		for(int i=0; i<n; i++)
		{
			if(max<a[i])
				max=a[i];
		}
		
		//in ra phan tu lon nhat va lon thu 2
		System.out.print("Phan tu lon nhat: "+max);
		System.out.print("\nVi tri phan tu lon nhat: ");
		int dem=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]==max)
				{
					if(dem>0)
						System.out.print(",");
					System.out.print((i+1));
					dem++;
				}
		}
		int max2=-1;
		int dem1=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]<max)
				max2=a[i];
		}
		if(max2==-1)
		{
			System.out.print("\nKhong co so lon thu 2");
		}
		else {
			for(int i=0; i<n; i++)
			{
				if(max2<a[i] && a[i]!=max)
					max2=a[i];
			}
			System.out.print("\nPhan tu lon thu 2: "+max2);
			System.out.print("\nVi tri phan tu lon thu 2: ");
			for(int i=0; i<n; i++)
			{
				if(a[i]==max2)
				{
					if(dem1>0)
						System.out.print(", ");
					System.out.print((i+1));
				}
			}
		}
		
		//Sap xep mang theo thu tu giam dan
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]<a[j])
				{
					int tg =a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}
		
		// chen them 1 phan tu vao mang
		
		
		
		scanner.close();
	}
	
	public static void question19() {
		Scanner scanner = new Scanner(System.in);
		int n=100;
		int[] a = new int[n+1];
		Random random = new Random();
		for(int i=0; i<n; i++)
		{
			a[i] = random.nextInt(100);
		}
		int max=a[0];
		for(int i=0; i<n; i++)
		{
			if(max<a[i])
				max=a[i];
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		//in ra phan tu lon nhat va lon thu 2
		System.out.print("\nPhan tu lon nhat: "+max);
		System.out.print("\nVi tri phan tu lon nhat: ");
		int dem=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]==max)
				{
					if(dem>0)
						System.out.print(",");
					System.out.print((i+1));
					dem++;
				}
		}
		int max2=-1;
		int dem1=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]<max)
				max2=a[i];
		}
		if(max2==-1)
		{
			System.out.print("\nKhong co so lon thu 2");
		}
		else {
			for(int i=0; i<n; i++)
			{
				if(max2<a[i] && a[i]!=max)
					max2=a[i];
			}
			System.out.print("\nPhan tu lon thu 2: "+max2);
			System.out.print("\nVi tri phan tu lon thu 2: ");
			for(int i=0; i<n; i++)
			{
				if(a[i]==max2)
				{
					if(dem1>0)
						System.out.print(", ");
					System.out.print((i+1));
					dem1++;
				}
			}
		}
		
		//Sap xep mang theo thu tu giam dan
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]<a[j])
				{
					int tg =a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
		}
		
		// chen them 1 phan tu vao mang
		
		
		scanner.close();
	}
	
	public static void question20() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 chuoi: ");;
		String str= scanner.nextLine();
		str= str.trim();
//		str =str.replaceAll("  "," ");
		
		int q= str.length();
		for(int i=0; i<q; i++)
		{
			
			if(str.charAt(i) ==' ' && str.charAt(i+1)==' ')
			{
				str = str.replaceFirst("  "," ");
				i--;
				q--;
			}
		}
		
		String str1="";
		String a[] = str.split(" ");
		for(int i=0; i<a.length; i++)
		{
			str1+= String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
			if( i!= (a.length-1))
				str1+=" ";
		}
		
		System.out.println("Chuoi sau khi chuan hoa: "+str1);
		scanner.close();
	}
	
	public static void question21() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 chuoi: ");
		String str= scanner.nextLine();
		
		//tim tu dai nhat trong chuoi
		String a[] = str.split(" ");
		int dem = a[0].length();
		for(int i=1; i< a.length; i++)
		{
			if(dem < a[i].length())
				dem= a[i].length();
		}
		int w=0;
		String str2="";
		
		
		System.out.print("Tu dai nhat: ");
		for(int i=1; i< a.length; i++)
		{
			if(dem == a[i].length())
			{
				System.out.print(a[i]+"\t");
				if(w==0)
					str2=a[i];
				w++;
			}
		}
		
		//tim vi tri tu dai nhat trong chuoi
		System.out.print("\nVi tri tu dai nhat: " + (str.indexOf(str2)+1));
		scanner.close();
	}
	
	
}
