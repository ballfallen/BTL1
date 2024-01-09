/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public class CaSi extends DichVu {

    private static int dem;
    private String tenCaSi;
    private int baiHat;

    {
        setId(String.format("%d", ++dem));
    }

    public CaSi(String tenCaSi, int baiHat, String name, double giaTien, String id) {
        super(name, giaTien, id);
        this.tenCaSi = tenCaSi;
        this.baiHat = baiHat;
    }

    public CaSi() {
       
    }

    @Override
    public String loaiDichVu() {
        return "Ten ca si ";
    }

    @Override
    public void inputDichVu() {
        super.inputDichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        this.tenCaSi = getName();
        System.out.println(" Nhap so bai hat yeu cau");
        this.baiHat = CauHinh.sc.nextInt();
        setGiaTien(getGiaTien() * this.getBaiHat());
        CauHinh.sc.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("---%d bai hat\n", this.baiHat);
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the tenCaSi
     */
    public String getTenCaSi() {
        return tenCaSi;
    }

    /**
     * @param tenCaSi the tenCaSi to set
     */
    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    /**
     * @return the baiHat
     */
    public int getBaiHat() {
        return baiHat;
    }

    /**
     * @param baiHat the baiHat to set
     */
    public void setBaiHat(int baiHat) {
        this.baiHat = baiHat;
    }

}
