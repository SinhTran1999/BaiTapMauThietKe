/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author ADMIN
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            NhanVien nv1 = new NhanVien();
    NhanVien nv2 = new NhanVien();
    nv1.setTen("Nguyen Van A");
    nv1.setTuoi(20);
    nv1.setDiaChi("Nha Trang - Khanh Hoa");
    nv1.setTienLuong(10000000);
    nv1.setTongGioLam(100);
    nv2.setTen("Nguyen Van B");
    nv2.setTuoi(21);
    nv2.setDiaChi("Nha Trang - Khanh Hoa");
    nv2.setTienLuong(20000000);
    nv2.setTongGioLam(200);

    System.out.println(nv1.getThongTin());
    System.out.println(nv2.getThongTin());
    }
    
}
