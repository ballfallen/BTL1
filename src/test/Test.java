/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
/**
 *
 * @author Minh Nghia
 */
public class Test {

    public static void main(String[] args) {
    Lobby lb =new Lobby("Diamond",200,1,10000000);
    Lobby lb1 =new Lobby("Saphire",200,2,10000000);
    Lobby lb2 =new Lobby("Ruby",50,2,10000000);
    QLSANH qlsanh=new QLSANH();
    qlsanh.addSanh(lb2);
    qlsanh.addSanh(lb1);
    qlsanh.addSanh(lb);
    
    qlsanh.displayLobbyList();
    	


    }
}
