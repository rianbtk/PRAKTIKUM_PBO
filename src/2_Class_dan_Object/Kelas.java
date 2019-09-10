
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
public class Kelas {
    public static void main(String[] args) {
        Scanner btk = new Scanner(System.in);
        Mahasiswa btk1 = new Mahasiswa();
        
        System.out.println("Masukan Nama Anda");
        btk1.nama = btk.next();
        System.out.println("Masukan NIM Anda");
        btk1.nim = btk.nextInt();
        System.out.println("Masukan alamat anda");
        btk1.alamat = btk.next();
        System.out.println("Kelas Mahasiswa");
        btk1.kelas = btk.next();
        System.out.print("");
        btk1.ketok();
    }
    
}
