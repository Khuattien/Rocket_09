package com.vti.entity;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;
	
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap nganh dao tao: ");
		nganhDaoTao = scanner.nextLine();
		scanner.close();
	}
	
	public void infor() {
		super.infor();
		System.out.println("Nganh dao tao: "+nganhDaoTao);
	}
}
