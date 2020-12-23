package entity_2_3;

public class HinhChuNhat implements  IHinhChuNhat{

    @Override
    public float chuVi(float a, float b) {
        return (a+b)*2;
    }

    @Override
    public float dienTich(float a, float b) {
        return a*b;
    }
}
