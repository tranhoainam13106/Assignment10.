package AsSignMent10.Nguoi;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonList {
    private ArrayList<Nguoi> danhSach;

    public PersonList() {
        danhSach = new ArrayList<>();
    }

    // thêm người
    public void them(Nguoi n) {
        n.nhap();
        danhSach.add(n);
    }

    // xuất danh sách
    public void xuat() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng!");
        } else {
            for (Nguoi n : danhSach) {
                n.xuat();
            }
        }
    }

    // tìm theo tên
    public void timTheoTen(String ten) {
        boolean found = false;
        for (Nguoi n : danhSach) {
            if (n.getHoVaTen().toLowerCase().contains(ten.toLowerCase())) {
                n.xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy người có tên: " + ten);
        }
    }

    // update thông tin theo CMND
    public void suaTheoCMND(int cmnd) {
        for (Nguoi n : danhSach) {
            if (n.getCmnd() == cmnd) {
                System.out.println("Nhập lại thông tin để cập nhật:");
                n.nhap();
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy người có CMND: " + cmnd);
    }

    // xoá theo CMND
    public void xoaTheoCMND(int cmnd) {
        Iterator<Nguoi> it = danhSach.iterator();
        while (it.hasNext()) {
            Nguoi n = it.next();
            if (n.getCmnd() == cmnd) {
                it.remove();
                System.out.println("Xoá thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy người có CMND: " + cmnd);
    }

    void themDanhSach(Nguoi nguoi) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void xuatDanhSach() {
        throw new UnsupportedOperationException("Not supported yet."); 

    void updatePerson(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void deletePerson(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void searchByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
