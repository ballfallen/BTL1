/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public abstract class DichVu {

    private String name;
    private double giaTien;
    private String id;

    public DichVu(String name, double giaTien, String id) {
        this.name = name;
        this.giaTien = giaTien;
        this.id = id;
    }

    public DichVu() {
    }

    

    public String loaiDichVu() {
        return "Dich vu";
    }

    public void inputDichVu() {
        System.out.printf("\nNhap %s ", this.loaiDichVu());
        this.setName(CauHinh.sc.nextLine());
        System.out.print("Gia tien ");
        this.setGiaTien(CauHinh.sc.nextDouble());
        CauHinh.sc.nextLine();
    }

    public void hienThi() {
        System.out.printf("%s---%s---%.1f vnd ", this.getId(), this.getName().toUpperCase(), this.getGiaTien());
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
