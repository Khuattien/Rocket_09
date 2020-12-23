package backend;

import entity_2_3.HinhChuNhat;
import entity_2_3.HinhVuong;

public class Exercise3 {
    public void question1()
    {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        HinhVuong hinhVuong = new HinhVuong();
        System.out.println("Chu vi hinh chu nhat: "+hinhChuNhat.chuVi(4,5));
        System.out.println("Dien tich hinh chu nhat: "+hinhChuNhat.dienTich(4,5));

        System.out.println("Chu vi hinh vuong: "+hinhVuong.chuVi(4));
        System.out.println("Dien tich hinh vuong: "+hinhVuong.dienTich(4));

    }
}
