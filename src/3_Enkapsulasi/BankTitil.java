/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasi;

/**
 *
 * @author RianBtk
 */
public class BankTitil {
    public static void main(String[] args) {
        Member AgusSalim = new Member("Agus Salim", 5000000);
        System.out.println("Nama Member: " + AgusSalim.getNama());
        System.out.println("Limit Pinjaman: " + AgusSalim.getPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        System.out.println("Maaf jumlah melibihi limit");
        AgusSalim.pinjam(5000000);
        System.out.println("\nMeminjam uang 4.000.000...");AgusSalim.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + AgusSalim.getPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");AgusSalim.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + AgusSalim.getPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");AgusSalim.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + AgusSalim.getPinjaman()); 
    }
}
