/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Minh Nghia
 */
public class QLSP {

    private  ArrayList<Drink> dsDrink = new ArrayList<>();
    private  ArrayList<Food> dsFood = new ArrayList<>();

    public QLSP() {
        this.dsDrink= new ArrayList<Drink>();
        this.dsFood= new ArrayList<Food>();
    }

    
    public void themDrink() {
        Drink d = new Drink();
        d.inputSanPham();
        this.dsDrink.add(d);
    }

    public void themFood() {
        Food f = new Food();
        f.inputSanPham();
        this.dsFood.add(f);
    }

    public void timKiemDrink(String kw) {
    	List<Drink> drinks = dsDrink.stream().filter(d -> d.getName().contains(kw)).collect(Collectors.toList());
    	for(Drink drink : drinks) {
    		System.out.println(drink.getName());

    	}
    }
    public void timKiemFood(String kw) {
    	List<Food> Foods = dsFood.stream().filter(f -> f.getName().contains(kw)).collect(Collectors.toList());
    	for(Food food : Foods) {
    		System.out.println(food.getName());
    	}
    }

    public void showDrink() {
        this.dsDrink.forEach(d -> d.hienThi());
    }

    public void showFood() {
        this.dsFood.forEach(f -> f.hienThi());
    }
    
       public void xoaFood(int id){
        this.dsFood.remove(id);
    }
        public void xoaDrink(int id){
        this.dsDrink.remove(id);
    }


}
