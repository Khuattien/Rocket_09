package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class QLCB {
	private ArrayList<NhanVien> nhanViens;
	private ArrayList<KySu> kySus;
	private ArrayList<CongNhan> congNhans;
	
	public QLCB()
	{
		nhanViens=new ArrayList<NhanVien>();
		kySus = new ArrayList<KySu>();
		congNhans = new ArrayList<CongNhan>();
	}
	
	public void themCB(){
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so CB muon nhap: ");
		n= scanner.nextInt();
		for(int i=0; i<n; i++)
		{
			
			System.out.println("Loai can bo muon nhap: ");
			System.out.println("1: Cong Nhan\n2: Ky Su\n3: Nhan vien");
			int a= scanner.nextInt();
			switch (a) {
			case 1:
				CongNhan congNhan = new CongNhan();
				congNhan.input();
				congNhans.add(congNhan);
				break;

			case 2:
				KySu kySu = new KySu();
				kySu.input();
				kySus.add(kySu);
				break;
				
			case 3:
				NhanVien nhanVien = new NhanVien();
				nhanVien.input();
				nhanViens.add(nhanVien);
				break;
			default:
				System.out.println("Vui long chon lai");
				i--;
				break;
			}
		
		scanner.close();
		}
	}
	

	public void timCB() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten CB can tim: ");
		String hoTen = scanner.nextLine();
		for(CongNhan cn : congNhans)
		{
			if(cn.getHoTen() == hoTen)
				cn.infor();
		}
		for(KySu ks : kySus)
		{
			if(ks.getHoTen() == hoTen)
				ks.infor();
		}
		for(NhanVien nv : nhanViens)
		{
			if(nv.getHoTen() == hoTen)
				nv.infor();
		}
		scanner.close();
	}
	
	public void hienThiInfor() {
		for(CongNhan cn : congNhans)
		{
			cn.infor();
		}
		for(KySu ks : kySus)
		{
			ks.infor();
		}
		for(NhanVien nv : nhanViens)
		{
			nv.infor();
		}
	}
	
	public void deleteCB() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten CB can xoa:");
		String hoTen= scanner.nextLine();
		congNhans.removeIf(congNhans -> hoTen.equals(congNhans.getHoTen()));
		scanner.close();
	}
}
