package com.vti.entity;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;
	
	public String getCongViec() {
		return congViec;
	}
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap cong viec: ");
		congViec = scanner.nextLine();
		scanner.close();
	}
	
	public void infor() {
		super.infor();
		System.out.println("Cong viec: "+ congViec);
	}

}
