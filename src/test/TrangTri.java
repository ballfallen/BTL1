/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public class TrangTri extends DichVu {

    private static int dem;
    private String yeuCau;

    {
        setId(String.format("%s", ++dem));
    }

    public TrangTri(String yeuCau, String name, double giaTien, String id) {
        super(name, giaTien, id);
        this.yeuCau = yeuCau;
    }

    public TrangTri() {
        
    }

   

    @Override
    public String loaiDichVu() {
        return "Yeu cau trang tri";
    }

    @Override
    public void inputDichVu() {
        super.inputDichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println();
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
     * @return the yeuCau
     */
    public String getYeuCau() {
        return yeuCau;
    }

    /**
     * @param yeuCau the yeuCau to set
     */
    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

}
