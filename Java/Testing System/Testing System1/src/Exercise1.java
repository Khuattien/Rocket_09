import java.time.LocalDate;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Exercise1 {

	public static void main(String[] args) {
		Department depart1 = new Department();
		depart1.id=1;
		depart1.name="Phong 1";
		
		Department depart2 = new Department();
		depart2.id=2;
		depart2.name="Phong 2";
		
		Department depart3 = new Department();
		depart3.id=3;
		depart3.name="Phong 3";
		
		Position posi1 = new Position();
		posi1.id=1;
		posi1.name="Dev";
		
		Position posi2 = new Position();
		posi2.id=2;
		posi2.name="Tester";
		
		Position posi3 = new Position();
		posi3.id=3;
		posi3.name="Scrum";
		
		Group g1 = new Group();
		g1.groupId =1;
		g1.groupName="G1";
		
		Group g2 = new Group();
		g2.groupId =2;
		g2.groupName="G2";
		
		Group g3 = new Group();
		g3.groupId =3;
		g3.groupName="G3";
		
		Account acc1 = new Account();
		acc1.id =1;
		acc1.email="trana1@gamil.com";
		acc1.username="a1";
		acc1.fullname="Tran A1";
		acc1.departmentId= depart1;
		acc1.positionId=posi1;
		acc1.createDate=LocalDate.of(2015, 1, 25);
		acc1.groupId= new Group[] {g1};
		g1.account = new Account[] {acc1};
		
		Account acc2 = new Account();
		acc2.id =2;
		acc2.email="trana2@gamil.com";
		acc2.username="a2";
		acc2.fullname="Tran A2";
		acc2.departmentId= depart2;
		acc2.positionId=posi2;
		acc2.createDate=LocalDate.of(2015, 2, 25);
		acc2.groupId= new Group[] {g2};
		g2.account = new Account[] {acc2};
		
		Account acc3 = new Account();
		acc3.id =3;
		acc3.email="trana3@gamil.com";
		acc3.username="a3";
		acc3.fullname="Tran A3";
		acc3.departmentId= depart3;
		acc3.positionId=posi3;
		acc3.createDate=LocalDate.of(2015, 3, 25);
		acc3.groupId= new Group[] {g3};
		g3.account = new Account[] {acc3};
		
		TypeQuestion tq1 = new TypeQuestion();
		tq1.typeID=1;
		tq1.TypeName="Essay";
		
		TypeQuestion tq2 = new TypeQuestion();
		tq2.typeID=2;
		tq2.TypeName="Essay";
		
		TypeQuestion tq3 = new TypeQuestion();
		tq3.typeID=3;
		tq3.TypeName="Multiple-Choice";
		
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.categoryId=1;
		cq1.categoryName="Java";
		
		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.categoryId=2;
		cq2.categoryName=".NET";
		
		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.categoryId=3;
		cq3.categoryName="SQL";
		
		Question qs1 = new Question();
		qs1.id=1;
		qs1.content="qs1";
		qs1.categoryId = cq1;
		qs1.typeId = tq1;
		qs1.account= acc1;
		qs1.createDate= LocalDate.of(2020, 1, 1);
		
		Question qs2 = new Question();
		qs2.id=2;
		qs2.content="qs2";
		qs2.categoryId = cq2;
		qs2.typeId = tq2;
		qs2.account= acc2;
		qs2.createDate= LocalDate.of(2020, 2, 1);
		
		Question qs3 = new Question();
		qs3.id=3;
		qs3.content="qs3";
		qs3.categoryId = cq3;
		qs3.typeId = tq3;
		qs3.account= acc3;
		qs3.createDate= LocalDate.of(2020, 3, 1);
		
		Answer ans1= new Answer();
		ans1.id=1;
		ans1.content="answer1";
		ans1.questionId= qs1;
		ans1.isCorrect= true;
		
		Answer ans2= new Answer();
		ans2.id=2;
		ans2.content="answer2";
		ans2.questionId= qs2;
		ans2.isCorrect= true;
		
		Answer ans3= new Answer();
		ans3.id=3;
		ans3.content="answer3";
		ans3.questionId= qs3;
		ans3.isCorrect= false;
		
		Exam ex1 = new Exam();
		ex1.id=1;
		ex1.code="1";
		ex1.title="test1";
		ex1.categoryId = "chu de 1";
		ex1.duration=90;
		ex1.account=acc1;
		ex1.createDate = LocalDate.of(2020, 1, 1);
		ex1.questions = new Question[] {qs1};
		
		Exam ex2 = new Exam();
		ex2.id=2;
		ex2.code="2";
		ex2.title="test2";
		ex2.categoryId = "chu de 2";
		ex2.duration=90;
		ex2.account=acc2;
		ex2.createDate = LocalDate.of(2020, 1, 2);
		ex2.questions = new Question[] {qs2};
		
		Exam ex3 = new Exam();
		ex3.id=3;
		ex3.code="3";
		ex3.title="test3";
		ex3.categoryId = "chu de 3";
		ex3.duration=90;
		ex3.account=acc3;
		ex3.createDate = LocalDate.of(2020, 1, 3);
		ex3.questions = new Question[] {qs3};
		
		
//		//qs1
//		if(acc2.departmentId== null)
//			System.out.print("Nhan vien nay chua co phong ban");
//		else {
//			System.out.print("Phong ban cua nhan vien nay la: " + acc2.departmentId.name);
//		}
		
		//qs2
//		if(acc2.groupId.length==0)
//			System.out.print("Nhan vien nay chua co group");
//		else {
//			if (acc2.groupId.length==1) {
//				System.out.print("Nhan vien thuoc group: "+acc2.groupId[0].groupName);
//			}
//			else {
//				if(acc2.groupId.length==2)
//				{
//					System.out.print("Nhan vien thuoc group: "+acc2.groupId[0].groupName +", "+acc2.groupId[1].groupName);
//				}
//				else {
//					if(acc2.groupId.length==3)
//					{
//						System.out.print("Nhan vien nay la nguoi quan trong, tham gia nhieu group ");
//					}
//					else {
//						System.out.print("Nhan vien nay la nguoi hong chuyen tham gia tat ca group ");
//					}
//				}
//			}
		
//		//qs3
//		System.out.print(acc2.departmentId==null ? "Nhan vien nay chua co phong ban": "Nhan vien nay thuoc phong "+acc2.departmentId.name);
//		
//		//qs4
//		System.out.print(acc1.positionId.name=="Dev"? "Day la Developer": "Nguoi nay khong phai developer");
		
		//qs5
//		switch (g1.account.length) {
//		case 1:
//		{
//			System.out.print("Nhom co 1 thanh vien");
//			break;
//		}
//		case 2:
//		{
//			System.out.print("Nhom co 2 thanh vien");
//			break;
//		}
//		case 3:
//		{
//			System.out.print("Nhom co 3 thanh vien");
//			break;
//		}
//		default:
//			System.out.print("Nhom co nhieu thanh vien");
//			break;
//		}
		
		//qs6
//		switch (acc2.groupId.length) {
//		case 0:
//		{
//			System.out.print("Nhan vien nay chua co group");
//			break;
//		}
//		case 1:
//		{
//			System.out.print("Group nhan vien nay la: "+acc2.groupId[0].groupName);
//			break;
//		}
//		case 2:
//		{
//			System.out.print("Group nhan vien nay la: "+acc2.groupId[0].groupName+", "+acc2.groupId[1].groupName);
//			break;
//		}
//		case 3:
//		{
//			System.out.print("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
//			break;
//		}
//		default:
//			System.out.print("Nhan vien nay la nguoi hong chuyen tham gia tat ca group");
//			break;
//		}
		
		//qs7
//		switch (acc1.positionId.name) {
//		case "Dev":
//		{
//			System.out.print("Day la developer");
//			break;
//		}
//		default:
//			System.out.print("Nguoi nay khong phai developer");
//			break;
//		}
		
		//qs8
		Account[] accounts = new Account[] { acc1, acc2, acc3};
//		for(Account acc :accounts)
//		{
//			System.out.println("Email: "+acc.email);
//			System.out.println("FullName: "+acc.fullname);
//			System.out.println("Phong ban: "+acc.departmentId.name);
//			System.out.print("\n");
//		}
		
		//qs9
		Department[] departments = new Department[] {depart1, depart2, depart3};
//		for(Department department : departments)
//		{
//			System.out.println("Id: "+department.id);
//			System.out.println("Name: "+department.name);
//			System.out.print("\n");
//		}
		
		//qs10
//		for(int i=0 ; i<accounts.length; i++)
//		{
//			System.out.println("Thong tin account thu "+(i+1)+" la: ");
//			System.out.println("Email: "+ accounts[i].email);
//			System.out.println("FullName: "+ accounts[i].fullname);
//			System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//			System.out.println("\n");
//		}
		
		//qs11
//		for(int i=0 ; i<departments.length; i++)
//		{
//			System.out.println("Thong tin department thu "+(i+1)+" la: ");
//			System.out.println("Id: "+ departments[i].id);
//			System.out.println("Name: "+ departments[i].name);
//			System.out.println("\n");
//		}
		
		//qs12
//		for(int i=0 ; i<2; i++)
//		{
//			System.out.println("Thong tin account thu "+(i+1)+" la: ");
//			System.out.println("Email: "+ accounts[i].email);
//			System.out.println("FullName: "+ accounts[i].fullname);
//			System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//			System.out.println("\n");
//		}
		
		
		//qs13
//		for(int i=0 ; i<accounts.length; i++)
//		{
//			if(i!=1)
//			{
//				System.out.println("Thong tin account thu "+(i+1)+" la: ");
//				System.out.println("Id: "+ accounts[i].id);
//				System.out.println("Email: "+ accounts[i].email);
//				System.out.println("UserName: "+ accounts[i].username);
//				System.out.println("FullName: "+ accounts[i].fullname);
//				System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//				System.out.println("Position: "+ accounts[i].positionId.name);
//				System.out.println("CreateDate: "+ accounts[i].createDate);
//				int dem=0;
//				System.out.print("Group: ");
//				for(int j=0; j<accounts[i].groupId.length; j++)
//				{
//					if(dem>0)
//						System.out.print(", ");
//					System.out.print( accounts[i].groupId[j].groupName);
//					dem++;
//				}
//				System.out.println("\n");
//			}
		
		
		//qs14
//		for(int i=0 ; i<accounts.length; i++)
//			{
//				if(accounts[i].id < 4)
//				{
//					System.out.println("Thong tin account thu "+(i+1)+" la: ");
//					System.out.println("Id: "+ accounts[i].id);
//					System.out.println("Email: "+ accounts[i].email);
//					System.out.println("UserName: "+ accounts[i].username);
//					System.out.println("FullName: "+ accounts[i].fullname);
//					System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//					System.out.println("Position: "+ accounts[i].positionId.name);
//					System.out.println("CreateDate: "+ accounts[i].createDate);
//					int dem=0;
//					System.out.print("Group: ");
//					for(int j=0; j<accounts[i].groupId.length; j++)
//					{
//						if(dem>0)
//							System.out.print(", ");
//						System.out.print( accounts[i].groupId[j].groupName);
//						dem++;
//					}
//					System.out.println("\n");
//				}
//			}
		
		//qs15
		//sai de. So am cung co the la so chan
		
		//qs16-10
//		int i=0;
//		while(i<accounts.length)
//			{
//				System.out.println("Thong tin account thu "+(i+1)+" la: ");
//				System.out.println("Email: "+ accounts[i].email);
//				System.out.println("FullName: "+ accounts[i].fullname);
//				System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//				System.out.println("\n");
//				i++;
//			}
		
		//qs16-11
//		int i=0;
//		while(i<departments.length)
//		{
//			System.out.println("Thong tin department thu "+(i+1)+" la: ");
//			System.out.println("Id: "+ departments[i].id);
//			System.out.println("Name: "+ departments[i].name);
//			System.out.println("\n");
//			i++;
//		}
		
		//qs16-12
//		int i=0
//		while(i<2)
//		{
//			System.out.println("Thong tin account thu "+(i+1)+" la: ");
//			System.out.println("Email: "+ accounts[i].email);
//			System.out.println("FullName: "+ accounts[i].fullname);
//			System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//			System.out.println("\n");
//			i++;
//		}
		
		//qs16-13
//		int i=0;
//		while(i<accounts.length)
//			{
//				if(i!=1)
//				{
//					System.out.println("Thong tin account thu "+(i+1)+" la: ");
//					System.out.println("Id: "+ accounts[i].id);
//					System.out.println("Email: "+ accounts[i].email);
//					System.out.println("UserName: "+ accounts[i].username);
//					System.out.println("FullName: "+ accounts[i].fullname);
//					System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//					System.out.println("Position: "+ accounts[i].positionId.name);
//					System.out.println("CreateDate: "+ accounts[i].createDate);
//					int dem=0;
//					System.out.print("Group: ");
//					for(int j=0; j<accounts[i].groupId.length; j++)
//					{
//						if(dem>0)
//							System.out.print(", ");
//						System.out.print( accounts[i].groupId[j].groupName);
//						dem++;
//					}
//					System.out.println("\n");				
//				}
//				i++;
//			}
		
		
		//qs16-14
//		int i=0;
//		while(i<accounts.length)
//		{
//			if(accounts[i].id < 4)
//			{
//				System.out.println("Thong tin account thu "+(i+1)+" la: ");
//				System.out.println("Id: "+ accounts[i].id);
//				System.out.println("Email: "+ accounts[i].email);
//				System.out.println("UserName: "+ accounts[i].username);
//				System.out.println("FullName: "+ accounts[i].fullname);
//				System.out.println("Phong ban: "+ accounts[i].departmentId.name);
//				System.out.println("Position: "+ accounts[i].positionId.name);
//				System.out.println("CreateDate: "+ accounts[i].createDate);
//				int dem=0;
//				System.out.print("Group: ");
//				for(int j=0; j<accounts[i].groupId.length; j++)
//				{
//					if(dem>0)
//						System.out.print(", ");
//					System.out.print( accounts[i].groupId[j].groupName);
//					dem++;
//				}
//				System.out.println("\n");
//			}
//			i++;
//		}
		
		//qs17
		//de co van de logic
		
		
		//question 8 - exercise 4- testing system 3
//		Group[] groups= new Group[] {g1, g2, g3};
//		int dem=0;
//		System.out.print("Group chua chu Java: ");
//		for(int i=0; i< groups.length; i++)
//		{
//			if(groups[i].groupName.contains("Java")==true)
//			{
//				if(dem>0)
//					System.out.print(", ");
//				System.out.print(groups[i].groupName);
//				dem++;
//			}
//		}
		
		//question 9 - exercise 4 - testing systeam 3
//		Group[] groups= new Group[] {g1, g2, g3};
//		int dem=0;
//		System.out.print("Group chua chu Java: ");
//		for(int i=0; i< groups.length; i++)
//		{
//			if(groups[i].groupName=="Java')
//			{
//				if(dem>0)
//					System.out.print(", ");
//				System.out.print(groups[i].groupName);
//				dem++;
//			}
//		}
	}
}
