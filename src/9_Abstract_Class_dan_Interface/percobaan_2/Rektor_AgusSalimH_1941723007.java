/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9_agussalimh_1941723007.per2;

/**
 *
 * @author rian
 */
public class Rektor_AgusSalimH_1941723007 {
    public void beriSertifikatCumlaude(ICumlaude_AgusSalimH_1941723007 mahasiswa){
        System.out.println("Saya rektor memberikan sertifikat cumlaude.");
//        System.out.println("Selamat silahkan perkenalkan diri anda.");
        System.out.println("Selamat , Bagaimana anda bisa Cumlaude ? ");
        
        mahasiswa.lulus_AgusSalimH_1941723007();
        mahasiswa.meraihIPKTertinggi_AgusSalimH_1941723007();
        
        System.out.println("------------------------------------------");
    }
    public void beriSertifikatMawapres(IBerprestasi_AgusSalimH_1941723007 mahasiswa){
        System.out.println("Saya rektor memberikan sertifikat cumlaude.");
//        System.out.println("Selamat silahkan perkenalkan diri anda.");
        System.out.println("Selamat , Bagaimana anda bisa Cumlaude ? ");
        
        mahasiswa.menjuariKompetisi_AgusSalimH_1941723007();
        mahasiswa.membuatPublikasiIlmiah_AgusSalimH_1941723007();
        
        System.out.println("------------------------------------------");
    }
}
