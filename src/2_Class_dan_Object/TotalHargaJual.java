
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
public class TotalHargaJual {
    public static void main(String[] args) {
            Scanner btk1 = new Scanner (System.in);
        Diskon btk = new Diskon();
        System.out.println("Masukan Nama Barang");
        btk.namaBarang = btk1.nextLine();
        System.out.println("Masukan Kode Barang");
        btk.kode = btk1.nextInt();
        System.out.println("Minimum Pembelian Rp.10.000 Diskon 15%");
        System.out.println("Dengan Minimum Beli 5 Barang");
        System.out.println("Bonus Pembelian Minimal 5000 Diskon 5%");
        System.out.println("Dengan Minimum Beli 2 Barang");
        System.out.print("Masukkan Harga Barang : ");
        btk.hargaDasar = btk1.nextInt();
        System.out.print("Masukkan Jumlah Barang Yang Di Beli : ");
        btk.hitungHargaJual = btk1.nextInt();
        btk.total = btk.hargaDasar * btk.hitungHargaJual;
        if (btk.total >= 10000) {
            btk.diskon = btk.total *  -15 / 100;
            btk.total = (int) (btk.total - btk.diskon); 
        if (btk.hargaDasar >= 5){
            btk.diskon = btk.total - ((btk.total *5) / 100 );
            btk.tampilData();
        }
        else{
        }
    }
    }
}