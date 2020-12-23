package com.vti.entity;


public class Student {
	private int id;
	private String name;
	private String homeTown;
	private float diemHocLuc;
	

	public Student(String name, String homeTown)
	{
		this.name = name;
		this.homeTown = homeTown;
		this.diemHocLuc=0;
	}
	
	public void setDiem(float diem) {
		this.diemHocLuc=diem;
	}
	
	public void congDiem(float diem) {
		this.diemHocLuc += diem;
	}
	
	public void infor_student(Student a) {
		System.out.println("Ten: "+a.name);
		System.out.print("Diem hoc luc: ");
		if(this.diemHocLuc >8)
			System.out.println("Gioi");
		else {
			if(this.diemHocLuc > 6)
				System.out.println("Kha");
			else {
				if(this.diemHocLuc>4)
					System.out.println("TB");
				else {
					System.out.println("Yeu");
				}
			}
		}
	}
	
	
	
}
