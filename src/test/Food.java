/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public class Food extends SanPham {

    private static int dem;
    private boolean isVegan;

    {
        setId(String.format("%s", ++dem));
    }

    public Food(boolean isVegan, String name, double giaTien, String id) {
        super(name, giaTien, id);
        this.isVegan = isVegan;
    }

    public Food() {
        super(null, 0, null);
    }

    

   

    @Override
    public String loaiSanPham() {
        return "Mon an";
    }

    @Override
    public void inputSanPham() {
        super.inputSanPham();
        System.out.println("Co phai san pham chay khong? <1.Chay/2.Man>");
        int choice;
        choice = CauHinh.sc.nextInt();
        CauHinh.sc.nextLine();
        isVegan = (choice == 1) ? true : false;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("---%b", isVegan);
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
     * @return the isVegan
     */
    public boolean isIsVegan() {
        return isVegan;
    }

    /**
     * @param isVegan the isVegan to set
     */
    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }

}
