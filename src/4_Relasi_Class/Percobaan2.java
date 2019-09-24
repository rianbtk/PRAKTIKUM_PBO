/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agussalim1941723007.percobaan2;

/**
 *
 * @author rian
 */
public class Percobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Mobilio");
        m.setBiaya(550000);
        Sopir s = new Sopir();
        s.setNama("Rian");
        s.setBiaya(300000);
        Pelanggan p = new Pelanggan();
        p.setNama("Rian");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Sewa Mobil");
        System.out.println("Biaya Total = " +
        p.hitungBiayaTotal());
        
    }
}