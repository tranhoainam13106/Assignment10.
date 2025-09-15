package AsSignMent10.Nguoi;

import java.util.Scanner;
import java.util.Date;

public class GiaoVien extends Nguoi {

    private String MaGV;

    public GiaoVien() {
    }

    public GiaoVien(String HovaTen, Date NgaySinh, String GioiTinh, int Cmnd, String MaGV) {
        super(HovaTen, NgaySinh, GioiTinh, Cmnd);
        this.MaGV = MaGV;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Ma Giao Vien: ");
        setMaGV(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ma giao vien: " + getMaGV());
    }

    public void xeploai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xep loai ren luyen(1-Gioi, 2-Kha, 3-Trung Binh)");
        int chon = scanner.nextInt();

        switch (chon) {
            case 1:
                System.out.println("Gioi");
                break;
            case 2:
                System.out.println("Kha");
                break;
            case 3:
                System.out.println("Trung Binh");
                break;
        }
    }
}
