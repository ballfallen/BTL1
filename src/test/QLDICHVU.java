/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.ArrayList;

/**
 *
 * @author Minh Nghia
 */
public class QLDICHVU{

    private final ArrayList<TrangTri> dsTrangTri = new ArrayList<>();
    private final ArrayList<Karaoke> dsKara = new ArrayList<>();
    private final ArrayList<CaSi> dsCaSi = new ArrayList<>();

    public void  themTrangTri() {
        TrangTri t = new TrangTri();
        t.inputDichVu();
        this.dsTrangTri.add(t);
    }

    public void showTrangTri() {
        this.dsTrangTri.forEach(t -> t.hienThi());
    }

    public void themKara() {
        Karaoke kr = new Karaoke();
        kr.inputDichVu();
        this.dsKara.add(kr);
    }

    public void showKara() {
        this.dsKara.forEach(kr -> kr.hienThi());
    }

    public void themThueCaSi() {
        CaSi thue = new CaSi();
        thue.inputDichVu();
        this.dsCaSi.add(thue);
    }

    public void xoaCaSi(int id) {
        this.dsCaSi.remove(id);
    }

    public void xoaKaraoke(int id) {
        this.dsKara.remove(id);
    }

    public void xoaTrangTri(int id) {
        this.dsTrangTri.remove(id);
    }

    public void showCaSi() {
        this.dsCaSi.forEach(thue -> thue.hienThi());
    }
}
