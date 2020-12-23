package entity;

public class Khoi {
    private String tenKhoi;
    private String monThi;

    public String getTenKhoi() {
        return tenKhoi;
    }

    public String getMonThi() {
        if(tenKhoi.toLowerCase()=="a")
            monThi="Toan, Ly, Hoa";
        else {
            if(tenKhoi.toLowerCase() =="b")
                monThi="Toan, Hoa, Sinh";
            else {
                if(tenKhoi.toLowerCase()=="c")
                    monThi="Van, Su, Dia";
                else {
                    return("Khong co khoi thi nay");
                }
            }
        }
        return monThi;
    }

    public void setTenKhoi(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }
}
