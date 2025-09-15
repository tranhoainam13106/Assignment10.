package AsSignMent10.Nguoi;

import java.util.Scanner;
import java.util.Date;

public class SinhVien extends Nguoi {

    public String MaSV;

    public SinhVien() {
    }

    public SinhVien(String HovaTen, Date NgaySinh, String GioiTinh, int Cmnd, String MaSV) {
        super(HovaTen, NgaySinh, GioiTinh, Cmnd);
        this.MaSV = MaSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Enter MaSV: ");
        setMaSV(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ma so sinh vien cua ban la: " + MaSV);
    }

    public void danhgia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh gia danh cho ban la ( 1-tot, 2-kha, 3-trung binh, 4-Yeu)");
        int chon = scanner.nextInt();

        switch (chon) {
            case 1:
                System.out.println("Tot");
                break;
            case 2:
                System.out.println("Kha");
                break;
            case 3:
                System.out.println("Trung binh");
                break;
            case 4:
                System.out.println("Yeu");
                break;
            default:
                System.out.println("Lua chon khong hop le ! ");

        }
    }
}
