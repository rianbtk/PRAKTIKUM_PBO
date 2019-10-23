/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9_agussalimh_1941723007;

/**
 *
 * @author rian
 */
public class OrangAgusSalimH_1941723007 {
    private String nama;
    private HewanAgusSalimH_1941723007 hewanPeliharaan;
    
    public OrangAgusSalimH_1941723007(String nama){
        this.nama = nama;
    }
    public void peliharaHewanAgusSalimH_1941723007(HewanAgusSalimH_1941723007 hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalanAgusSalimH_1941723007(){
        System.out.println("Namaku "+ this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerakAgusSalimH_1941723007();
        System.out.println("------------------------------------------");
    }
}
