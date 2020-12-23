package com.vti.entity;

import java.util.Scanner;

public class  CongNhan extends CanBo {
	private int bac;
	
	public int getBac() {
		return bac;
	}

	public void input() {
		super.input();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap bac: ");
		bac = scanner.nextInt();
		scanner.close();
	}
	public void infor() {
		super.infor();
		System.out.println("Bac: "+bac);
	} 
}
