package entity;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class TuyenSinh implements ITuyenSinh {

    private ArrayList<ThiSinh> thiSinhs;

    public TuyenSinh() {
        thiSinhs = new ArrayList<>();
    }

    @Override
    public void display() {
        for(ThiSinh thiSinh : thiSinhs)
        {
            System.out.println("SBD: "+ thiSinh.getSbd());
            System.out.println("Ho ten: "+thiSinh.getHoTen());
            System.out.println("Dia chi: "+thiSinh.getDiaChi());
            System.out.println("Muc uu tien: "+thiSinh.getMucUuTien());
            System.out.println("Khoi thi: "+thiSinh.getKhoi());
            System.out.println("Mon thi: "+thiSinh.getMon());
        }

    }

    @Override
    public void themTS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thi sinh muon them: ");
        int n = scanner.nextInt();
        for(int i=0; i<n; i++)
        {
            ThiSinh thiSinh = new ThiSinh();
            thiSinh.nhap();
            thiSinhs.add(thiSinh);

        }
        scanner.close();

    }

    @Override
    public void timTS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sdb: ");
        String sbd = scanner.nextLine();
        for(ThiSinh thiSinh:thiSinhs)
        {
            if(thiSinh.getSbd()== sbd)
            {
                System.out.println("SBD: "+ thiSinh.getSbd());
                System.out.println("Ho ten: "+thiSinh.getHoTen());
                System.out.println("Dia chi: "+thiSinh.getDiaChi());
                System.out.println("Muc uu tien: "+thiSinh.getMucUuTien());
                System.out.println("Khoi thi: "+thiSinh.getKhoi());
                System.out.println("Mon thi: "+thiSinh.getMon());
            }

        }

        scanner.close();
    }

}
