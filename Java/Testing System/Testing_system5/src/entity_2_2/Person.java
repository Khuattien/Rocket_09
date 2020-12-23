package entity_2_2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String ten;
    private Gender gioiTinh;
    private LocalDate ngaySinh;
    private String diaChi;

    public String getTen() {
        return ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public Gender getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(Gender gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public  void inputInfor()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên:");
        this.ten = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gt = scanner.nextLine();
        if(gt.toLowerCase()=="nam")
            this.gioiTinh = Gender.valueOf("Nam");
        else if(gt.toLowerCase()=="nu")
            this.gioiTinh = Gender.valueOf("Nu");
            else
            this.gioiTinh = Gender.valueOf("khac");
        System.out.println("Nhập ngày sinh: ");
        this.ngaySinh = LocalDate.parse(scanner.nextLine());

        System.out.println("Nhập địa chỉ: ");
        this.diaChi = scanner.nextLine();
        scanner.close();
    }

    public void showInfo() {
        System.out.println("Tên: " + ten);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
