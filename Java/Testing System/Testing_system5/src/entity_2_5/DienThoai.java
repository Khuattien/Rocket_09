package entity_2_5;

public  class DienThoai implements IVuKhi {
    public void nghe()
    {
        System.out.println("Nghe");
    }
    public void goi()
    {
        System.out.println("Goi");
    }
    public void guiSMS()
    {
        System.out.println("Gui SMS");
    }
    public void nhanSMS()
    {
        System.out.println("Nhan SMS");
    }

    @Override
    public void tanCongKeXau() {
        System.out.println("Nem");
    }
}
