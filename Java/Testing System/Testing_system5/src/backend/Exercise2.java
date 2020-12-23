package backend;

import entity_2.Student;

import java.util.ArrayList;
import java.util.Random;

public class Exercise2 {
    private  ArrayList<Student> students;

    public void question1()
    {
        khoiTaoStudent();
        caLopDiemDanh();
        goiNhomDiHocBai();
        diDonVeSinh();
    }
    public void khoiTaoStudent()
    {
            students = new ArrayList<>();
//        Student student1 = new Student(1,"Anh1",1);
//        Student student2 = new Student(2,"Anh2",2);
//        Student student3 = new Student(3,"Anh3",3);
//        Student student4 = new Student(4,"Anh4",4);
//        Student student5 = new Student(5,"Anh5",1);
//        Student student6 = new Student(6,"Anh6",2);
//        Student student7 = new Student(7,"Anh7",3);
//        Student student8 = new Student(8,"Anh8",4);
//        Student student9 = new Student(9,"Anh9",1);
//        Student student10 = new Student(10,"Anh10",2);
        Random random = new Random();
        for(int i=0; i<10; i++)
        {
            Student student = new Student((i+1),"Anh"+(i+1), random.nextInt(5));
            students.add(student);
        }
    }

    public  void caLopDiemDanh()
    {
        for(Student student :students)
        {
            student.diemDanh();
        }
    }

    public  void goiNhomDiHocBai()
    {
        for(Student student :students)
        {
            if(student.getGroup()==1)
                student.hocBai();
        }
    }

    public void diDonVeSinh()
    {
        for(Student student :students)
        {
            if(student.getGroup()==2)
                student.diDonVeSinh();
        }
    }
}
