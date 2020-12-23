package entity;

import java.util.Scanner;

public class ThiSinh {
	private String sbd, hoTen, diaChi, mucUuTien;
	private Khoi khoi;
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap sbd: ");
		this.sbd = scanner.nextLine();
		System.out.println("Nhap ho ten: ");
		this.hoTen=scanner.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = scanner.nextLine();
		System.out.println("Nhap muc uu tien: ");
		this.mucUuTien = scanner.nextLine();
		System.out.println("Nhap khoi: ");
		khoi = new Khoi();
		khoi.setTenKhoi(scanner.nextLine());
		scanner.close();
	}
	
	public String getSbd() {
		return sbd;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public String getDiaChi() {
		return diaChi;
	}
	
	public String getMucUuTien() {
		return mucUuTien;
	}
	
	public Khoi getKhoi() {
		return khoi;
	}
	public String getMon() {
		return khoi.getMonThi();
	}
	
}
