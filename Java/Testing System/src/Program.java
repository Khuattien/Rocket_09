import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		
		Department depart1 = new Department();
		depart1.id=1;
		depart1.name="Phong 1";
		
		Department depart2 = new Department();
		depart2.id=2;
		depart2.name="Phong 2";
		
		Department depart3 = new Department();
		depart3.id=1;
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
		
		Account acc2 = new Account();
		acc2.id =2;
		acc2.email="trana2@gamil.com";
		acc2.username="a2";
		acc2.fullname="Tran A2";
		acc2.departmentId= depart2;
		acc2.positionId=posi2;
		acc2.createDate=LocalDate.of(2015, 2, 25);
		acc2.groupId= new Group[] {g2};
		
		Account acc3 = new Account();
		acc3.id =3;
		acc3.email="trana3@gamil.com";
		acc3.username="a3";
		acc3.fullname="Tran A3";
		acc3.departmentId= depart3;
		acc3.positionId=posi3;
		acc3.createDate=LocalDate.of(2015, 3, 25);
		acc3.groupId= new Group[] {g3};
		
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
		
		
		System.out.println("Department 1: ");
		System.out.println("id: " + depart1.id);
		System.out.println("name: " + depart1.name);
		System.out.println("\n");
		
		System.out.println("Position 1: ");
		System.out.println("id: " + posi1.id);
		System.out.println("name: " + posi1.name);
		System.out.println("\n");
		
		System.out.println("Group 1: ");
		System.out.println("id: " + g1.groupId);
		System.out.println("name: " + g1.groupName);
		System.out.println("\n");
		
		
		System.out.println("Account 1: ");
		System.out.println("id: " + acc1.id);
		System.out.println("email: " + acc1.email);
		System.out.println("username: " + acc1.username);
		System.out.println("fullname: " + acc1.fullname);
		System.out.println("departmentId: " + acc1.departmentId.id);
		System.out.println("positionId: " + acc1.positionId.id);
		System.out.println("createDate: " + acc1.createDate);
		//System.out.println("groupId: " + acc1.groupId);
		System.out.println("\n");
		
		
		System.out.println("TypeQuestion 1: ");
		System.out.println("Id: " + tq1.typeID);
		System.out.println("TypeName: " + tq1.TypeName);
		System.out.println("\n");
		
		
		System.out.println("CategoryQuestion 1: ");
		System.out.println("Id: " + cq1.categoryId);
		System.out.println("CategoryName: " + cq1.categoryName);
		System.out.println("\n");
		
		
		System.out.println("Question 1: ");
		System.out.println("Id: " + qs1.id);
		System.out.println("Content: " + qs1.content);
		System.out.println("CategoryId: " + qs1.categoryId);
		System.out.println("TypeId: " + qs1.typeId);
		System.out.println("AccountId: " + qs1.account.id);
		System.out.println("CreateDate: " + qs1.createDate);
		System.out.println("\n");
		
		System.out.println("Answer 1: ");
		System.out.println("Id: " + ans1.id);
		System.out.println("Content: " + ans1.content);
		System.out.println("QuestionId: " + ans1.questionId.id);
		System.out.println("isCorrect: " + ans1.isCorrect);
		System.out.println("\n");
		
		System.out.println("Exam 1: ");
		System.out.println("Id: " + ex1.id);
		System.out.println("Code: " + ex1.code);
		System.out.println("Title: " + ex1.title);
		System.out.println("CategoryId: " + ex1.categoryId);
		System.out.println("Duration: " + ex1.duration);
		System.out.println("AccountId: " + ex1.account.id);
		System.out.println("CreateDate: " + ex1.createDate);
		System.out.println("Questions: " + ex1.questions);
		System.out.println("\n");
	}

}
