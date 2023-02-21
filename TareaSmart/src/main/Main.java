/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

import Smart.SmartTV;

/**
 *
 * @author neril
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SmartTV> tv = new ArrayList<>();
        tv.add(new SmartTV("FULL HD 4K", 55, "SAMSUNG", true));
        tv.add(new SmartTV("HD", 75, "SONY", false));
        tv.add(new SmartTV("FULL HD", 90, "Hisense", true));
        System.out.println(tv);
        for (SmartTV smartTV : tv) {
			System.out.println(smartTV.encendiendo());
			System.out.println(smartTV.toString());
			System.out.println(smartTV.apagando());
			System.out.println(" ");
		}
        
    }
}
