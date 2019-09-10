
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RianBtk
 */
public class Diskon {
    Scanner btk = new Scanner(System.in);
    public int hargaDasar;
    public int total;
    public int kode;
    public String namaBarang;
    float diskon;
    int hitungHargaJual;
    
    public void tampilData(){
        System.out.println("Diskon = 15%");
        System.out.println("Tambahan Diskon 5%\n Total Diskon = 20%\n Total Bayar = " +total);
        System.out.println("Total Bayar = Rp."+total);
    }    
}
