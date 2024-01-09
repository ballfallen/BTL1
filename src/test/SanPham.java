/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public abstract class SanPham {

    protected String name;
    protected double giaTien;
    protected String id;

    public SanPham(String name, double giaTien, String id) {
        this.name = name;
        this.giaTien = giaTien;
        this.id = id;
    }

    public SanPham() {
    }

    
    
    public String loaiSanPham() {
        return "SanPham";
    }

    public void inputSanPham() {
        System.out.printf("Nhap ten %s ", this.loaiSanPham());
        this.setName(CauHinh.sc.nextLine());
        System.out.print("Gia tien ");
        this.setGiaTien(CauHinh.sc.nextDouble());
        CauHinh.sc.nextLine();
    }

    public void hienThi() {
        System.out.printf("%s---%s---%.1f vnd", this.getId(), this.getName().toUpperCase(), this.getGiaTien());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the giaTien
     */
    public double getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

}
