
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
public class TestBarang {
    public static void main(String[] args) {
        Scanner btk = new Scanner(System.in);
        Barang btk1 = new Barang();
        System.out.println("Masukan Nama Barang");
        btk1.namaBrg = btk.next();
        System.out.println("Masukan Jenis Barang");
        btk1.jenisBrg = btk.next();
        System.out.println("Masukan Stok Barang");
        btk1.stok = btk.nextInt();
        btk1.tampilBarang();
        System.out.println("Stok Baru : "+btk1.tambahStok(20));
    }
    }
