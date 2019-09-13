/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RianBtk
 */
public class Koperasi {
    public static void main(String[] args) {
        Anggota btk = new Anggota(" Agus Salim","Jalan Kenanga");
        System.out.println("Simpanan" +btk.getNama()+" : Rp "+btk.getSimpanan());
        btk.setNama("Agus");
        btk.setAlamat("Jalan Kenanga1");
        btk.setor(100000);
        System.out.println("Simpanan "+btk.getNama()+" : Rp "+btk.getSimpanan());
        btk.pinjam(5000);
        System.out.println("Simpanan "+btk.getNama()+" : Rp "+btk.getSimpanan());
        
        
    }
}
