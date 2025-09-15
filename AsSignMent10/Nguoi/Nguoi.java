package AsSignMent10.Nguoi;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;

public class Nguoi {

    private String HovaTen;
    private Date NgaySinh;
    private String GioiTinh;
    private int Cmnd;

//constractor Khong tham so 
    public Nguoi() {
    }

    //constractor co tham so
    public Nguoi(String HovaTen, Date NgaySinh, String GioiTinh, int Cmnd) {
        this.HovaTen = HovaTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.Cmnd = Cmnd;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String HovaTen) {
        this.HovaTen = HovaTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getCmnd() {
        return Cmnd;
    }

    public void setCmnd(int Cmnd) {
        this.Cmnd = Cmnd;
    }

    public void nhap() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Ho va Ten: ");
//            this.HovaTen=scanner.nextLine();
            setHovaTen(scanner.nextLine());

            System.out.println("Enter Gioi Tinh: ");
//            this.GioiTinh=scanner.nextLine();
            setGioiTinh(scanner.nextLine());

            System.out.println("Enter Cmnd: ");
            setCmnd(Integer.parseInt(scanner.nextLine()));
            
            System.out.println("Enter ngay sinh(dd/MM/yyyy)");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String NgaySinhString = scanner.nextLine();
            setNgaySinh(sdf.parse(NgaySinhString));
        } catch (ParseException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }

    public void xuat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ho va Ten: " + getHovaTen() + ", NgaySinh="
                + sdf.format(getNgaySinh()) + ",Gioi Tinh=" + getGioiTinh() + ",Cmnd=" + getCmnd());
    }

    void inputInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void displayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getIdCard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getFullName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getHoVaTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
