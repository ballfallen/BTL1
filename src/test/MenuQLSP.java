/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public class MenuQLSP {
    
public void hienThi(){
        QLSP qlsp = new QLSP();
        int choice = 0;
        do{
            System.out.println("------------------QUAN LY MON AN---------------------");
            System.out.println("1.Them Thuc An");
            System.out.println("2.Xoa Thuc An");
            System.out.println("3.Cap Nhat Thuc An");
            System.out.println("4.Tim kiem Thuc An");
            System.out.println("5.Hien thi danh sach Thuc An");
            System.out.println("6.Them Do Uong");
            System.out.println("7.Xoa Do Uong");
            System.out.println("8.Cap nhat Uong");
            System.out.println("9.Tim kiem Do Uong");
            System.out.println("10.Hien thi danh sach Do Uong");
            System.out.println("0.Thoat");
            System.out.println("-----------------------------------------------------");
            System.out.println("Hay chon mot thao tac tu 0-10: ");
            choice=CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Them Thuc An vao danh sach");
                    qlsp.themFood();
                    break;
                case 2:
                     System.out.println("Xoa Thuc An");
                    qlsp.showFood();
                    System.out.println("\nHay nhap id cua thuc an can xoa: ");
                    int id;
                    id = CauHinh.sc.nextInt();
                    qlsp.xoaFood(id);
                    break;
                case 3:
                case 4:
                    System.out.println("Hay nhap ten mon an muon tim kiem");
                    String tenMonAn;
                    tenMonAn=CauHinh.sc.nextLine();
                    qlsp.timKiemFood(tenMonAn);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Hien thi danh sach Thuc An ");
                    qlsp.showFood();
                    break;
                case 6:
                     System.out.println("Them Do Uong vao danh sach");
                    qlsp.themDrink();
                    break;
                case 7:
                     System.out.println("Xoa Do Uong");
                    qlsp.showDrink();
                    System.out.println("\nHay nhap id cua Do Uong can xoa: ");
                    int idx;
                    idx = CauHinh.sc.nextInt();
                    qlsp.xoaDrink(idx);
                    break;
                case 8:
                case 9:
                	   System.out.println("Hay nhap ten do uong muon tim kiem");
                       String d;
                       d=CauHinh.sc.nextLine();
                       qlsp.timKiemFood(d);
                       System.out.println("");
                       break;
                case 10:
                    System.out.println("Hien thi danh sach do uong ");
                    qlsp.showDrink();
                    break;
            }
        } while(choice != 0);
    }
}
