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
public class Mod9_AgusSalimH_1941723007Per2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rektor_AgusSalimH_1941723007 pakRektor = new Rektor_AgusSalimH_1941723007();
        
//        Mahasiswa mahasiswaBiasa = new Mahasiswa("Rian");
        Sarjana_AgusSalimH_1941723007 sarjanaCumlaude = new Sarjana_AgusSalimH_1941723007 ("Agus");
        PascaSarjana_AgusSalimH_1941723007 masterCumlaude = new PascaSarjana_AgusSalimH_1941723007 ("Elok");
//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }  
}
