/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public class Karaoke extends DichVu {

    private static int dem;
    private int timeKaraoke;

    {
        setId(String.format("%s", ++dem));
    }

    public Karaoke(int timeKaraoke, String name, double giaTien, String id) {
        super(name, giaTien, id);
        this.timeKaraoke = timeKaraoke;
    }

    public Karaoke() {
    }

   

    

    @Override
    public String loaiDichVu() {
        return "Hat karaoke ";
    }

    @Override
    public void inputDichVu() {
        super.inputDichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap thoi gian hat ");
        this.setTimeKaraoke(CauHinh.sc.nextInt());
        CauHinh.sc.nextLine();
        System.out.printf("Gia tien hat trong %dh\n", this.getTimeKaraoke());
        setGiaTien(getGiaTien() * this.getTimeKaraoke());
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("---%dh\n", this.getTimeKaraoke());
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
     * @return the timeKaraoke
     */
    public int getTimeKaraoke() {
        return timeKaraoke;
    }

    /**
     * @param timeKaraoke the timeKaraoke to set
     */
    public void setTimeKaraoke(int timeKaraoke) {
        this.timeKaraoke = timeKaraoke;
    }

}
