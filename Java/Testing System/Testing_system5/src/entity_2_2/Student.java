package entity_2_2;

import java.util.Scanner;

public class Student extends Person{
    private int maSV;
    private float dtb;
    private String email;


    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã sinh viên: ");
        this.maSV = scanner.nextInt();

        System.out.println("Nhập điểm trung bình: ");
        this.dtb = scanner.nextFloat();

        System.out.println("Nhập email: ");
        this.email = scanner.nextLine();
        scanner.close();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm trung bình: " + dtb);
        System.out.println("Email: " + email);
    }
    public void xetHocBong()
    {
        if(dtb>=8)
            System.out.println("Du dieu kien nhan hoc bong");
        else
            System.out.println("Khong du dieu kien nhan hoc bong");
    }
}
