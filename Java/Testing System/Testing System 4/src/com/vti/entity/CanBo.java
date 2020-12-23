package com.vti.entity;

import java.util.Scanner;

public class CanBo {
	private String hoTen,diaChi;
	private int tuoi;
	private Gender gioiTinh;
	
	public String getHoTen() {
		return hoTen;
	}
	
	public String getDiaChi() {
		return diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	
	public Gender getGioiTinh() {
		return gioiTinh;
	}
	
	public void setGioiTinh(String gioiTinh)
	{
		if(gioiTinh.toLowerCase()== "nam")
		{
			this.gioiTinh = Gender.valueOf("Nam");
		}
		else {
			if(gioiTinh.toLowerCase()=="nu")
			{
				this.gioiTinh = Gender.valueOf("Nu");
			}
			else {
				this.gioiTinh = Gender.valueOf("Khac");
			}
		}
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen=scanner.nextLine();
		
		System.out.println("Nhap tuoi: ");
		tuoi= scanner.nextInt();
		
		System.out.println("Nhap gioi tinh: ");
		setGioiTinh(scanner.nextLine());
		
		System.out.println("Nhap dia chi: ");
		diaChi = scanner.nextLine();
		scanner.close();
	}
	
	public void infor() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Tuoi: "+tuoi);
		System.out.println("Gioi tinh: "+gioiTinh);
		System.out.println("Dia chi: "+diaChi);
	}
	
}
